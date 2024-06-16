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
        int maxPairSum = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        ListNode currNode = head;
        int n=0;
        while(currNode != null){
            n++;
            list.add(currNode.val);
            currNode = currNode.next;
        }

        for(int i=0; i<=(n/2)-1; i++){
            maxPairSum = Math.max(maxPairSum, (list.get(i) + list.get(n-1-i)));
            
        }
        return maxPairSum;
    }
}