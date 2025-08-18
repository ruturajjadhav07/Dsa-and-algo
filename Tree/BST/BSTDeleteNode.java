public class BSTDeleteNode {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
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
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void inorder(Node root) { // to check tree
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // delete node
    public static Node delete(Node root, int value) {
        if (root.data > value) {
            root.left = delete(root.left, value);
        } else if (root.data < value) {
            root.right = delete(root.right, value);
        }

        else { // root.data == value
               // case1
            if (root.left == null && root.right == null) {
                return null; // return root parent as null
            }

            // case2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case3
            // find inorder successor
            Node Is = inorderSuccessor(root.right);
            root.data = Is.data; // updated root data with inorder successor
            root.right = delete(root.right, Is.data); // deleted inorder succsessor from root right subtree and updated
                                                      // root right subtree
        }
        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.print("Inorder before deletion: ");
        inorder(root);
        System.out.println();

        root = delete(root, 14); // Deleting node with value

        System.out.print("Inorder after deletion: ");
        inorder(root);
        System.out.println();
    }
}
