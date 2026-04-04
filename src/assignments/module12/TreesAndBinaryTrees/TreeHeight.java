package assignments.module12.TreesAndBinaryTrees;

class Node5 {
    int data;
    Node5 left, right;

    Node5(int data) {
        this.data = data;
    }
}

public class TreeHeight {

    Node5 root;

    int height(Node5 node) {
        if (node == null) return 0;

        int left = height(node.left);
        int right = height(node.right);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeHeight tree = new TreeHeight();

        tree.root = new Node5(1);
        tree.root.left = new Node5(2);
        tree.root.right = new Node5(3);

        System.out.println("Height: " + tree.height(tree.root));
    }
}
