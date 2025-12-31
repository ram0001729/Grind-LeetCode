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
    public int sizecal(ListNode head){
      int size=0;
      ListNode temp=head;
       while(temp!=null){
         size=size+1;
        temp=temp.next;
          }
          return size;
        }
public ListNode removeNthFromEnd(ListNode head, int n) {
    int size = sizecal(head);
        if(head==null){
            return head;
          }
        ListNode temp=head;
        ListNode prev=null;
        int find=size-n;
        int present=1;
         if(n==size){
            head=head.next;
            return head;
        }
      
       while(temp!=null){
       if(present==find){
               prev=temp;
            prev.next=temp.next.next;
               break;
            }
           else{
              present=present+1;
            //   tempprev=temp;
              temp=temp.next;

              }

            }



return head;


    }
}
