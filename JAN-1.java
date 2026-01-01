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
  public ListNode reverseKGroup(ListNode head, int k) {
         ListNode temp=head;
         ListNode next;
         ListNode prev;
          int count=0;
        while(count<k){
            if(temp==null){
                return head;
            }
            count=count+1;
            temp=temp.next;
                      }
       prev= reverseKGroup(temp,k);   
          temp=head;count=0;
          while(count<k){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
            count=count+1;
          }
      return prev;
    }
}
