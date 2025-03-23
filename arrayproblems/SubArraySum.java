package arrayproblems;

import java.util.ArrayList;

public class SubArraySum {

    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();

        // Try all subarrays starting from index i
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            // Try all possible end points j
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                // If sum matches, return the indices (1-based)
                if (sum == target) {
                    result.add(i + 1); // Convert to 1-based index
                    result.add(j + 1);
                    return result;
                }
                
                else if(sum>target)break;
            }
        }

        // If no subarray found, return [-1]
        result.add(-1);
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int sum = 23;
       
        subarraySum(arr, sum).forEach(System.out::println);
       
    }
}
