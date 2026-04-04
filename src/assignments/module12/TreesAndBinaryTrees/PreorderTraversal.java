package assignments.module12.TreesAndBinaryTrees;

class Node4 {
    int data;
    Node4 left, right;

    Node4(int data) {
        this.data = data;
    }
}

public class PreorderTraversal {

    Node4 root;

    void preorder(Node4 node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        PreorderTraversal tree = new PreorderTraversal();

        tree.root = new Node4(1);
        tree.root.left = new Node4(2);
        tree.root.right = new Node4(3);

        tree.preorder(tree.root);
    }
}