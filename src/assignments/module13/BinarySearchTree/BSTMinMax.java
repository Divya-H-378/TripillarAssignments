package assignments.module13.BinarySearchTree;

public class BSTMinMax {

    Node9 root;

    int findMin(Node9 node) {
        while (node.left != null)
            node = node.left;
        return node.data;
    }

    int findMax(Node9 node) {
        while (node.right != null)
            node = node.right;
        return node.data;
    }

    public static void main(String[] args) {
        BSTMinMax tree = new BSTMinMax();

        tree.root = new Node9(50);
        tree.root.left = new Node9(30);
        tree.root.right = new Node9(70);

        System.out.println("Min: " + tree.findMin(tree.root));
        System.out.println("Max: " + tree.findMax(tree.root));
    }
}