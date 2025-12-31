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
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if(head==null || head.next ==null){
            return head;
        }
        ListNode tempprev=head;
      ListNode temp=head.next;
      while(temp!=null){
         if(temp.val==val){
            tempprev.next=temp.next;
            temp=tempprev.next;
      }else{
        tempprev=temp;
        temp=temp.next;
      }
      }
      return head;
    }
}
