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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
    // to find mid node
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode mid = slow; // mid node
        ListNode current = mid.next; // lastnode for reverse linkedlist
        mid.next = null; // setting tail of first linked to null

        // setting reverse linkedlist of other half
        ListNode prevNode = null;
        ListNode nextNode = null;
        // reverse linkedlist from mid
        while(current != null) {
               nextNode = current.next; // saving reference of next node
               current.next = prevNode; // making link of current node with previoud node
               prevNode = current; // new previous Node
               current = nextNode;//  new current Node
               
        }
        ListNode headRef = head;
        ListNode tailRef = prevNode; // start node of reverse linkedlist
        ListNode nextHeadRef = null;
        ListNode nextTailRef = null;

        while(tailRef != null && headRef != null){
            nextHeadRef = headRef.next;// storing refernece for next node
            headRef.next = tailRef; // making new  connecton
            nextTailRef = tailRef.next;// storing refernce of next node
            tailRef.next = nextHeadRef; // making new connection
            headRef = nextHeadRef; // updating headRef
            tailRef = nextTailRef; // updating tailRef
        }

    }
}