public class Linkedlist_mergesort {

    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static node head;

    public node getmid(node head) {
        node slow = head;
        node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public node merge(node head1, node head2) {
        node mergedll = new node(-1);
        node temp = mergedll;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        if (head1 != null) temp.next = head1;
        if (head2 != null) temp.next = head2;

        return mergedll.next;
    }

    public node mergeSort(node head) {
        if (head == null || head.next == null) {
            return head;
        }

        node mid = getmid(head);
        node righthead = mid.next;
        mid.next = null;

        node left = mergeSort(head);
        node right = mergeSort(righthead);

        return merge(left, right);
    }

    public static void main(String[] args) {
        Linkedlist_mergesort ll = new Linkedlist_mergesort();

        head = new node(4);
        head.next = new node(2);
        head.next.next = new node(1);
        head.next.next.next = new node(3);

        head = ll.mergeSort(head);

        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
