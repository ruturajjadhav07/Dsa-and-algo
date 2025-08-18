
// TC = n^2
// With root

public class TreeDiameter1 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class BinaryTree {
        static int index = -1;

        public static Node buildTree(int[] nodes) {
            index++;

            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }
    }

    // need height function to check largest height of node on each side
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;

    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int dialeft = diameter(root.left); // going thorugh all nodes == n
        int diaright = diameter(root.right);

        int finaldiameter = height(root.left) + height(root.right) + 1; // again checking for height is == n

        // using height function to get max height of node
        return Math.max(finaldiameter, Math.max(dialeft, diaright));
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("The number of nodes in diameter are " + diameter(root));
    }
}
