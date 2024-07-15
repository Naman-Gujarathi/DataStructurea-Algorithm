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
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return head;
        }

        ListNode curr = head;

        int temp;
        ListNode firstNode = null;
        ListNode secondNode = null;

        while(curr != null && curr.next != null) {
            firstNode = curr;
            secondNode = curr.next;
            temp =  firstNode.val;
            // System.out.println("temp " + temp);
            firstNode.val = secondNode.val;
            secondNode.val = temp;
            curr = curr.next.next;
            // System.out.println("currentNode " + curr.val);
            //  System.out.println("currentNodeNext " + curr.next.val);

        }

       return head;
        

    }
}