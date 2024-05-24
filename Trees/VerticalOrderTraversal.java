package Trees;

import java.util.*;

// -2  -1  0  1  2
//            10           0            vertical  horizontal node 
//      2         3        1             TreeMap<vertical_idx,TreeMap<horizontal_idx, Intger>>
//   4     65       7      2                 
//   (-2,2)  (0,2)    (2,2)
// 4 2 10 5 6 3 7

// vertical   horizontal  node.data
// -2          2            4
// -1          1            2
//  0          0 2 2        1  [6, 5]
//  1          1            3
//  2          2            7

//  map.size()
//  TreeMap<>   temp = map.getValues();
//  priprityqueue queue = temp.getValue()
//  queue.pop()

class TreeNode {

    TreeNode left;
    TreeNode right;
    int data;

    public TreeNode(int data) {
        this.data = data;
    }

}

public class VerticalOrderTraversal {
    TreeNode root;

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>>();
        List<List<Integer>> list = new ArrayList<>();
        // List<Integer> listFragment = new ArrayList<>();
        markNodes(0, 0, root, map);
        System.out.println("map" + map);
        // map{-2={2=[4]}, -1={1=[2]}, 0={0=[10], 2=[5, 8]}, 1={1=[3]}, 2={2=[6]}}

        Collection<TreeMap<Integer, PriorityQueue<Integer>>> resultValueMap = map.values();
         
        System.out.println("resultValueMap " + resultValueMap);

        // {{2=[4]}, {1=[2]}, {0=[10], [5, 8]}, {1=[3]}, {2=[6]}}
        for (TreeMap<Integer, PriorityQueue<Integer>> resultInnerMap : resultValueMap) {
            Collection<PriorityQueue<Integer> > queueList  = resultInnerMap.values();
               for( PriorityQueue<Integer> queue:queueList) {
                List<Integer> listFragment = new ArrayList<>();
                System.out.println("queue " + queue);
                   while(!queue.isEmpty()) {
                      int value = queue.poll();
                      listFragment.add(value);
                   }

                   list.add(listFragment);
                   
                        
               }
                     
              }
        System.out.println("ArrayList " + list);
        return list;
    }

    void markNodes(int coloumn, int row, TreeNode node,
            TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map) {

        if (node == null)
            return;

        if (!map.containsKey(coloumn)) {
            map.put(coloumn, new TreeMap<Integer, PriorityQueue<Integer>>());
        }

        TreeMap<Integer, PriorityQueue<Integer>> innerMap = map.get(coloumn);
        if (!innerMap.containsKey(row)) {
            innerMap.put(row, new PriorityQueue<>());
        }

        innerMap.get(row).add(node.data);

        markNodes(coloumn - 1, row + 1, node.left, map);

        markNodes(coloumn + 1, row + 1, node.right, map);

    }

    public static void main(String args[]) {
        VerticalOrderTraversal obj = new VerticalOrderTraversal();
        obj.root = new TreeNode(10);
        obj.root.left = new TreeNode(2);
        obj.root.right = new TreeNode(3);
        obj.root.left.left = new TreeNode(4);
        obj.root.left.right = new TreeNode(8);
        obj.root.right.left = new TreeNode(5);
        obj.root.right.right = new TreeNode(6);

        obj.verticalTraversal(obj.root);

    }
}

            //       10
            //   2        3
            // 4     85      6
            // result 4 2 10 5 8 3 6