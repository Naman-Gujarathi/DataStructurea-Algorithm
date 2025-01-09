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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;

        //length of LinkedList
        int length =1;
        while(temp.next != null){
            temp = temp.next;
            length++;
        }

        if(k >= length){
            k = k % length;
        }
        ListNode newHead = head;
        // ListNode temp2 = head;
        for(int i=1; i<= k ; i++){
          newHead = remove(length, newHead );
        }
        return newHead;
         
    }

    ListNode remove(int length, ListNode tailPrevious){
        ListNode head = tailPrevious;
        int count = 1;

        while(count != length -1){
            tailPrevious  = tailPrevious.next;
            count++;
        }

        ListNode tail =tailPrevious.next;
        tailPrevious.next = null;
        
        tail.next = head;
        head = tail; 
        return head;
    }

    // ListNode appendToHead(ListNode tail, ListNode head){
            
    // }

}