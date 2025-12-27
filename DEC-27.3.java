class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow;
        ListNode right = mid.next;
        mid.next = null;

        ListNode current = right;
        ListNode prev = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        ListNode newright = prev;
        ListNode newleft = head;

        while (newright != null && newleft != null) {
            if (newright.val != newleft.val) {
                return false;
            }
            newright = newright.next;
            newleft = newleft.next;
        }

        return true;
    }
}
