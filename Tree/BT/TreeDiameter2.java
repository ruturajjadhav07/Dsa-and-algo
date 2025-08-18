// package BT;

public class TreeDiameter2 {
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

    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static TreeInfo diameter(Node root) {

        if (root == null) {
            return new TreeInfo(0, 0);
        }

        // first left subtree info
        TreeInfo left = diameter(root.left);
        // second right subtree info
        TreeInfo right = diameter(root.right);

        // my height is left subtree + right subtree +1
        int myHeight = Math.max(left.height, right.height) + 1;

        // now taking daiameter

        int diam1 = left.diameter;
        int diam2 = right.diameter;

        int diam3 = left.height + right.height + 1;

        int myDiameter = Math.max(diam3, Math.max(diam1, diam1));

        TreeInfo myInfo = new TreeInfo(myHeight, myDiameter);

        return myInfo;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("The number of nodes in diameter are " + diameter(root).diameter);

    }
}
