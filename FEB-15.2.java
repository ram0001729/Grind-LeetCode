public class subtreeoftree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static boolean isidentical(Node node, Node subroot) {
        if (node == null && subroot == null) {
            return true;
        } else if (node == null || subroot == null || node.data != subroot.data) {
            return false;
        }

        return isidentical(node.left, subroot.left) &&
               isidentical(node.right, subroot.right);
    }

    public static boolean issubtree(Node root, Node subroot) {

        // safety check
        if (subroot == null) return true;
        if (root == null) return false;

        if (root.data == subroot.data) {
            if (isidentical(root, subroot)) {
                return true;
            }
        }

        return issubtree(root.left, subroot) ||
               issubtree(root.right, subroot);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        System.out.println(issubtree(root, subroot)); // true
    }
}
