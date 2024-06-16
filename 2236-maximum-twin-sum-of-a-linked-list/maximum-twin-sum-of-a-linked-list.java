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
    public int pairSum(ListNode head) {
        int twinPairSum = Integer.MIN_VALUE;
        ListNode curr = head;
     
        ListNode fast = curr;
        ListNode slow = curr;
        while( fast !=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode mid = slow;
        ListNode prev = null;
        ListNode next = null;
        curr = mid;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        ListNode tail = prev;
        ListNode start = head;
        while(tail != null){
       
            twinPairSum = Math.max(twinPairSum, start.val + tail.val);
           
            start = start.next;
            tail = tail.next;
        }

        return twinPairSum;
        
    }
}