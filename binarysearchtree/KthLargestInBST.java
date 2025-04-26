package binarysearchtree;

public class KthLargestInBST {
    
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

    // Function to find the kth largest element in the BST
    int kthLargestUtil(Node node, int k, int[] count) {
        if (node == null || count[0] >= k) {
            return -1; // Return -1 if kth largest not found or count exceeds k
        }

        // Traverse the right subtree first (reverse inorder)
        int right = kthLargestUtil(node.right, k, count);

        // If kth largest is found in the right subtree, return it
        if (right != -1) {
            return right;
        }

        // Increment count of visited nodes
        count[0]++;

        // If count is equal to k, return the current node's data
        if (count[0] == k) {
            return node.data;
        }

        // Otherwise, traverse the left subtree
        return kthLargestUtil(node.left, k, count);
    }

    // Wrapper function to find the kth largest element in the BST
    int kthLargest(int k) {
        int[] count = {0}; // Initialize count as an array to keep track of visited nodes
        return kthLargestUtil(root, k, count);
    }

    public static void main(String[] args) {
        KthLargestInBST tree = new KthLargestInBST();
        tree.root = null;

        // Constructing the BST
        int[] keys = {15, 10, 20, 8, 12, 16, 25};
        for (int key : keys) {
            tree.root = tree.insert(tree.root, key);
        }

        // Finding the 3rd largest element in the BST
        int k = 2;
        int result = tree.kthLargest(k);
        if (result != -1) {
            System.out.println(k + "th largest element in the BST is: " + result);
        } else {
            System.out.println(k + "th largest element not found in the BST.");
        }
    }
}
