package assignments.module13.BinarySearchTree;

class Node8 {
    int data;
    Node8 left, right;

    Node8(int data) {
        this.data = data;
    }
}

public class CheckBST {

    boolean isBST(Node8 node, int min, int max) {
        if (node == null) return true;

        if (node.data <= min || node.data >= max)
            return false;

        return isBST(node.left, min, node.data) &&
                isBST(node.right, node.data, max);
    }

    public static void main(String[] args) {
        CheckBST tree = new CheckBST();

        Node8 root = new Node8(50);
        root.left = new Node8(30);
        root.right = new Node8(70);

        System.out.println("Is BST: " +
                tree.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
