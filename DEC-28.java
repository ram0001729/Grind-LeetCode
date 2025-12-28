

class Solution {
    public Node flatten(Node head) {
        if (head == null) return null;
        dfs(head);
        return head;
    }

    // Flattens the list starting at node and returns the tail
    private Node dfs(Node node) {
        Node curr = node;
        Node last = null;

        while (curr != null) {
            Node next = curr.next;

            if (curr.child != null) {
                // Flatten child list
                Node childHead = curr.child;
                Node childTail = dfs(childHead);

                // Connect curr -> child
                curr.next = childHead;
                childHead.prev = curr;

                // Connect childTail -> next
                if (next != null) {
                    childTail.next = next;
                    next.prev = childTail;
                }

                curr.child = null;
                last = childTail;
                curr = childTail;
            } else {
                last = curr;
            }

            curr = curr.next;
        }
        return last;
    }
}
