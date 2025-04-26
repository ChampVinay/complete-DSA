package binarysearchtree;

import java.util.HashSet;

public class PairSumInBST {
    public static boolean findPairWithSum(Node root, int target) {
        HashSet<Integer> set = new HashSet<>();
        return findPairUtil(root, target, set);
    }

    private static boolean findPairUtil(Node node, int target, HashSet<Integer> set) {
        if (node == null) {
            return false;
        }

        if (findPairUtil(node.left, target, set)) {
            return true;
        }

        if (set.contains(target - node.data)) {
            System.out.println("Pair is (" + node.data + ", " + (target - node.data) + ")");
            return true;
        } else {
            set.add(node.data);
        }

        return findPairUtil(node.right, target, set);
    }

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);

        int targetSum = 20;
        if (findPairWithSum(root, targetSum)) {
            System.out.println("Pair with sum " + targetSum + " found in the BST.");
        } else {
            System.out.println("No pair with sum " + targetSum + " found in the BST.");
        }
    }
}
