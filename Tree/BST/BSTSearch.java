public class BSTSearch {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int values) {
        if (root == null) {
            root = new Node(values);
            return root;
        }

        if (root.data > values) {
            root.left = insert(root.left, values);
        } else {
            root.right = insert(root.right, values);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // search in BST
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data > key) { // left subtree
            return search(root.left, key);
        }

        else if (root.data == key) {
            return true;
        }

        else { // right subtree
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        int[] values = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);

        if (search(root, 9)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

    }
}
