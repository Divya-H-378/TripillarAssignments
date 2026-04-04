package assignments.module13.BinarySearchTree;

class Node7 {
    int data;
    Node7 left, right;

    Node7(int data) {
        this.data = data;
    }
}

public class BSTInsert {

    Node7 root;

    Node7 insert(Node7 node, int data) {
        if (node == null) return new Node7(data);

        if (data < node.data)
            node.left = insert(node.left, data);
        else
            node.right = insert(node.right, data);

        return node;
    }

    void inorder(Node7 node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        BSTInsert tree = new BSTInsert();

        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);

        tree.inorder(tree.root);
    }
}