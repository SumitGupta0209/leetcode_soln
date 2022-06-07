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
        if(head == null) return null;
        ListNode t = head;
        int l=1;
        while(t.next!=null){
            l++; t=t.next;
        }
        t.next = head;
        k = k%l;
        k = l-k;
        while(k-- > 0){
            t = t.next;
        }
        
        head = t.next;
        t.next = null;
        return head;
    }
}