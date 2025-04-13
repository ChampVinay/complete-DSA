package greadyaproach;

public class MergeOverLapping {

    public static int[][] mergeIntervals(int[][] intervals) {
        // Sort the intervals based on the start time
        java.util.Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        // Create a list to hold the merged intervals
        java.util.List<int[]> merged = new java.util.ArrayList<>();
        
        for (int[] interval : intervals) {
            // If the list is empty or if the current interval does not overlap with the last merged one
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // There is an overlap, so we merge the current interval with the last merged one
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }
        
        // Convert the list back to an array and return it
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        // Function to merge overlapping intervals
        // This function takes an array of intervals and merges them if they overlap
        // It returns a new array of merged intervals
        
        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18},
            {17, 20},
            {5, 7},
            {6, 8},
            {12, 15},
            {14, 18},
            {8, 10},
            {15, 18},
            {17, 20}
        };
        
        int[][] mergedIntervals = mergeIntervals(intervals);
        
        for (int[] interval : mergedIntervals) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
