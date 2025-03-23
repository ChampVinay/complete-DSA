package arrayproblems;

import java.util.ArrayList;

public class SubArraySumUsingWindow {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int left = 0, sum = 0;
        
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            // If sum exceeds target, shrink the window
            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }

            // If sum matches the target, return 1-based indices
            if (sum == target) {
                list.add(left + 1); // Convert to 1-based index
                list.add(right + 1);
                return list;
            }
        }

        // If no subarray found, return -1
        list.add(-1);
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int target = 23;
        System.out.println(subarraySum(arr, target));
    }
}
