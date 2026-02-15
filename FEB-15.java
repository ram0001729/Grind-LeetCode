public class subtree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class info {
        int dia;
        int ht;

        public info(int dia, int ht) {
            this.dia = dia;
            this.ht = ht;
        }
    }

    public static info diameter(Node root) {
        if (root == null) {
            return new info(0, 0);
        }

        info leftinfo = diameter(root.left);
        info rightinfo = diameter(root.right);

        int dia = Math.max(
                Math.max(leftinfo.dia, rightinfo.dia),
                leftinfo.ht + rightinfo.ht + 1
        );

        int ht = Math.max(leftinfo.ht, rightinfo.ht) + 1;

        return new info(dia, ht);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        info result = diameter(root);
        System.out.println("Diameter: " + result.dia);
    }
}
