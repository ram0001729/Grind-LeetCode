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
        if(head==null || head.next == null){
            return head;
        }
        ListNode temp=head;
        ListNode tempnext=temp.next;
        while(temp!=null && tempnext != null){
        if(temp.val==tempnext.val){
            tempnext=tempnext.next;
            temp.next=tempnext;

            }
            else{                
            temp=tempnext;
            tempnext = tempnext.next;
            
              }
        
           }
           return head;
    }
}
