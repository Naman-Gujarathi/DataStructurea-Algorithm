/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {

        HashMap<Integer, TreeNode> map = new HashMap<>();// 15, 17, 20, 80, 19, 50
        HashSet<Integer> childset = new HashSet<>();// 15 17 20, 80, 19
        HashSet<Integer> parentset = new HashSet<>();// 20 50 80
        TreeNode currParentNode = null;
         TreeNode currChildNode = null;
        for(int i=0; i<descriptions.length; i++){
            
            int parent = descriptions[i][0];
            if(map.containsKey(parent)){
                  parentset.add(parent);
                  currParentNode = map.get(parent);
            }else{
                 currParentNode = new TreeNode(parent);
                 parentset.add(currParentNode.val);
                 map.put(currParentNode.val, currParentNode);
            }
           

            int child = descriptions[i][1];


            if(map.containsKey(child)){
                  childset.add(child);
                  currChildNode = map.get(child);
            }else{
                currChildNode = new TreeNode(child);
                childset.add(currChildNode.val);
                map.put(currChildNode.val, currChildNode);
            }

           
            if(descriptions[i][2] == 1){
                currParentNode.left = currChildNode;
            }else{
                currParentNode.right = currChildNode;
            }
        }

    //      System.out.println(" parentsetValue " );
    //    for( TreeNode node : parentset) {
    //        System.out.print(" " + node.val);
    //     }
        

            // System.out.println("parentset " +  parentset);
            // System.out.println("childset " +  childset);
            // System.out.println("map " +  map);
            
       int head = -1;
        for( int value : parentset) {
            if(!childset.contains(value)) {
                head = value;
            }
        }

       return map.get(head);
    }
}