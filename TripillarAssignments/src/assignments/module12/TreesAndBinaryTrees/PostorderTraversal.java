package assignments.module12.TreesAndBinaryTrees;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class PostorderTraversal {

    Node root;

    void postorder(Node node) {
        if (node == null) return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        PostorderTraversal tree = new PostorderTraversal();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        tree.postorder(tree.root);
    }
}