/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//  Class Pair{
//     int index;
//     int listNo;
//     ListNode node;
//     // public Pair( ListNode node){
        
//     //     this.node  = node;  
//     // }
//  }
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a,b) -> a.val - b.val
        );
       int currentIndex =0;
       for(int i=0; i<lists.length; i++){
           if (lists[i] != null) {
                pq.add(lists[i]);
           }
            
       }
       ListNode dummy = new ListNode(-1);
       ListNode temp = dummy;
       ListNode currSmallestNode= null;
       while(!pq.isEmpty()){
                currSmallestNode = pq.poll();
                temp.next = currSmallestNode;
                temp = temp.next;
                if(currSmallestNode.next != null) {
                    ListNode currNode = currSmallestNode.next;
                    pq.add(currNode);
                 }
                 else {
                        continue;
                  }
       }
       
        return dummy.next;

    }
}