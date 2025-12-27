 class Solution {

    public ListNode mid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // find mid
        ListNode midNode = mid(head);
        ListNode righthead = midNode.next;
        midNode.next = null;

        // reverse 2nd half
        ListNode current = righthead;
        ListNode prev = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // alternate merging
        ListNode left = head;
        ListNode right = prev;
        ListNode nextL, nextR;

        while (left != null && right != null) {
            nextR = right.next;
            nextL = left.next;

            left.next = right;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
}
