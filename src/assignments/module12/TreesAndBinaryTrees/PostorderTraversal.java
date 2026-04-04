package assignments.module12.TreesAndBinaryTrees;

class Node3 {
    int data;
    Node3 left, right;

    Node3(int data) {
        this.data = data;
    }
}

public class PostorderTraversal {

    Node3 root;

    void postorder(Node3 node) {
        if (node == null) return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        PostorderTraversal tree = new PostorderTraversal();

        tree.root = new Node3(1);
        tree.root.left = new Node3(2);
        tree.root.right = new Node3(3);

        tree.postorder(tree.root);
    }
}