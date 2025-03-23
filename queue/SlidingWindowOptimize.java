package queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowOptimize {

    public static ArrayList<Integer> maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        ArrayList<Integer> result = new ArrayList<>();
        
        // Check for edge cases
        if (n == 0 || k == 0 || k > n) {
            return result;
        }
        
        // Create a deque to store the indices of the elements in the current window
        Deque<Integer> deque = new LinkedList<>();
        
        // Iterate over the array to find the maximum in each sliding window
        for (int i = 0; i < n; i++) {
            // Remove the index of elements that are not in the current window
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            
            // Remove the index of elements that are smaller than the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            
            // Add the index of the current element to the deque
            deque.offer(i);
            
            // Add the maximum to the result list when the window size is reached
            if (i >= k - 1) {
                result.add(nums[deque.peek()]);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[][] testCases = {
            {12, 1, 78, 90, 57, 89, 56},
            {1, 3, -1, -3, 5, 3, 6, 7},
            {9, 11, 8, 5, 7, 10},
            {4, 3, 2, 1},
            {10, 14, 12, 11, 15, 13, 16}
        };
        int k = 3;
        
        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Test case " + (i + 1) + ": " + maxSlidingWindow(testCases[i], k).toString());
        }
    }
}
