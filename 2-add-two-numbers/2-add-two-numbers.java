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

public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
    int sum=0,carry=0;
    ListNode pre=null;
   // ListNode curr=new ListNode();
    ListNode ans=null;
    
    while(l1!=null || l2!=null){
        sum=0;
        if(l1!=null){
            sum+=l1.val;
            l1=l1.next;
        }
        if(l2!=null){
            sum+=l2.val;
            l2=l2.next;
        }
        sum+=carry;
       
        if(pre==null){
            pre=new ListNode();
            ans=pre;
           pre.val=sum%10;
        }
        else {
            ListNode newnode=new ListNode();
           newnode.val=sum%10;
            pre.next=newnode;
            pre=newnode;
        }
        carry=sum/10;
    }
    if(carry!=0){
         ListNode newnode=new ListNode();
          newnode.val=carry;
            pre.next=newnode;
            pre=newnode;
    }
    return ans;
}
}

