package binarysearchtree;

public class PredecessorInBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static Node findPredecessor(Node root, int key) {
        Node predecessor = null;
        Node current = root;

        while (current != null) {
            if (key > current.data) {
                predecessor = current;
                current = current.right;
            } else {
                current = current.left;
            }
        }

        return predecessor;
    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);

        int key = 15;
        Node predecessor = findPredecessor(root, key);

        if (predecessor != null) {
            System.out.println("Inorder predecessor of " + key + " is: " + predecessor.data);
        } else {
            System.out.println("No inorder predecessor found for " + key);
        }
    }
}
