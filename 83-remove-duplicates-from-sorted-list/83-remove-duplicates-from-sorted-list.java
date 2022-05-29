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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        
        ListNode prev = head;
        ListNode curr = head.next;
        
        while(curr != null){
            if(curr.val != prev.val){ // unique
                prev.next = curr;
                prev = curr;
            }
            ListNode nbr = curr.next;
            curr.next = null;
            curr = nbr;
        }
        
        prev.next = null;
        
        return head;
    }
}