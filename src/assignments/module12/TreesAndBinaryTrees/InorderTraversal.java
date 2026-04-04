package assignments.module12.TreesAndBinaryTrees;

class Node1 {
    int data;
    Node1 left, right;

    Node1(int data) {
        this.data = data;
        left = right = null;
    }
}

public class InorderTraversal {
    Node1 root;

    void inorder(Node1 node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        InorderTraversal tree = new InorderTraversal();

        tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);

        tree.inorder(tree.root);
    }
}

