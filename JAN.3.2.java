/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */ 
class Solution {
    public void deleteNode(ListNode node) {
        if(node==null){
            return ;
        }
          ListNode curr=node;
          ListNode prev=curr.next;
          curr.val=prev.val;
          curr.next=prev.next;
    }
}
