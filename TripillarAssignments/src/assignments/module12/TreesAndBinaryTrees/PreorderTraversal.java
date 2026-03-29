package assignments.module12.TreesAndBinaryTrees;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class PreorderTraversal {

    Node root;

    void preorder(Node node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        PreorderTraversal tree = new PreorderTraversal();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.preorder(tree.root);
    }
}