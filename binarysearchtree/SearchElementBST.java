package binarysearchtree;

public class SearchElementBST {
    
    class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Root of the BST
    Node root;

    // Function to insert a new node in the BST
    Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    // Iterative function to search for a key in the BST
    boolean search(Node root, int key) {
        while (root != null) {
            if (key == root.data) {
                return true;
            } else if (key < root.data) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return false;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        SearchElementBST tree = new SearchElementBST();
        tree.root = null;

        // Constructing the BST
        int[] keys = {15, 10, 20, 8, 12, 16, 25};
        for (int key : keys) {
            tree.root = tree.insert(tree.root, key);
        }

        // Searching for the key 25
        int searchKey = 25;
        if (tree.search(tree.root, searchKey)) {
            System.out.println("Key " + searchKey + " found in the BST.");
        } else {
            System.out.println("Key " + searchKey + " not found in the BST.");
        }
    }
}
