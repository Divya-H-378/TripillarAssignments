package assignments.module12.TreesAndBinaryTrees;

class Node2 {
    int data;
    Node2 left, right;

    Node2(int data) {
        this.data = data;
    }
}

public class CountNodes {

    Node2 root;

    int count(Node2 node) {
        if (node == null) return 0;

        return 1 + count(node.left) + count(node.right);
    }

    public static void main(String[] args) {
        CountNodes tree = new CountNodes();

        tree.root = new Node2(1);
        tree.root.left = new Node2(2);
        tree.root.right = new Node2(3);

        System.out.println("Total Nodes: " + tree.count(tree.root));
    }
}