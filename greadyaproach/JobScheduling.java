package greadyaproach;

import java.util.Arrays;

public class JobScheduling {
    // Function to find the maximum profit from jobs
    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] jobs = new int[n][3];
        
        // Create a 2D array to store jobs with their start time, end time, and profit
        for (int i = 0; i < n; i++) {
            jobs[i][0] = startTime[i];
            jobs[i][1] = endTime[i];
            jobs[i][2] = profit[i];
        }
        
        // Sort the jobs based on their end time
        Arrays.sort(jobs, (a, b) -> Integer.compare(a[1], b[1]));
        
        // Create an array to store the maximum profit at each job
        int[] dp = new int[n];
        dp[0] = jobs[0][2]; // Profit of the first job
        
        for (int i = 1; i < n; i++) {
            // Include the current job's profit
            dp[i] = jobs[i][2];
            
            // Find the last non-conflicting job
            for (int j = i - 1; j >= 0; j--) {
                if (jobs[j][1] <= jobs[i][0]) {
                    dp[i] += dp[j]; // Add the profit of the last non-conflicting job
                    break;
                }
            }
            
            // Update the maximum profit so far
            dp[i] = Math.max(dp[i], dp[i - 1]);
        }
        
        return dp[n - 1]; // Return the maximum profit from all jobs
    }

    public static void main(String[] args) {
        int[] startTime = {1, 2, 3, 3};
        int[] endTime = {3, 4, 5, 6};
        int[] profit = {50, 10, 40, 70};
        
        int maxProfit = jobScheduling(startTime, endTime, profit);
        System.out.println("Maximum Profit: " + maxProfit); // Output: Maximum Profit: 120
    }
    
}
