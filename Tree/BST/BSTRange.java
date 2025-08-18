
public class BSTRange {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (root.data > value) {
            root.left = insert(root.left, value);
        } else if (root.data < value) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void printInRange(Node root, int l, int h) {
        if (root == null) {
            return;
        }

        // If the current node's value is within the range [l, h], we should print it
        if (l <= root.data && root.data <= h) {
            printInRange(root.left, l, h);
            System.out.print(root.data + " ");
            printInRange(root.right, l, h);

        } else if (root.data <= l) { // If the current node's value is less than the lower bound `l`,
            // we only need to look at the right subtree because the left subtree will
            // contain smaller values.
            printInRange(root.right, l, h);

        } else {// If the current node's value is greater than the upper bound `h`,
            // we only need to look at the left subtree because the right subtree will
            // contain larger values.
            printInRange(root.left, l, h);
        }
    }

    public static void main(String[] args) {
        int[] values = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        printInRange(root, 6, 10);
    }
}
