package queue;

import java.util.ArrayList;

public class SlidingWindow {
    public static ArrayList<Integer> maxSlidingWindow(int[]nums,int k){
        int n = nums.length;
        ArrayList<Integer> result = new ArrayList<>();
        
        // Check for edge cases
        if (n == 0 || k == 0 || k > n) {
            return result;
        }
        
        // Iterate over the array to find the maximum in each sliding window
        for (int i = 0; i < n - k + 1; i++) {
            int max = nums[i];
            // Find the maximum in the current window of size k
            for (int j = 1; j < k; j++) {
            if (nums[i + j] > max) {
                max = nums[i + j];
            }
            }
            // Add the maximum to the result list
            result.add(max);
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
