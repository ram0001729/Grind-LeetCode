public class DoublyLinkedList {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int removeFirst() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }

        int value = head.data;

        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;
        return value;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);

        dll.printList();
        dll.reverse();
        dll.printList();
    }
}
