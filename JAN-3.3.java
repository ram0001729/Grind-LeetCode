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
  public ListNode reverse(ListNode linkedlist){
    ListNode prev=null;
    ListNode curr=linkedlist;
    while(curr!=null){
        ListNode next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    return prev;
  }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null){
            return l1;
        }
        if(l2==null){
            return l2;
        }
         ListNode L1=  reverse(l1);
         ListNode L2 = reverse(l2);
         int sum=0;
         int carry=0;
        ListNode dummy=new ListNode(0);
         ListNode curr=dummy;

         while(L1!=null || L2!=null || carry!=0){
            sum=carry;
            if(L1!=null){
             sum=sum+L1.val;
              L1=L1.next;
        
        }

         if(L2!=null){
         sum=sum+L2.val;
         L2=L2.next;

         }
         carry=sum/10;
        curr.next=new ListNode(sum%10);
        curr=curr.next;

         }
     return reverse(dummy.next);
 
    }
}
