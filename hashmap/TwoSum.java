package hashmap;

import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoSum {

    // Method to find two indices such that their values add up to the target
    public static int[] twoSum(int[] arr, int target) {
        // create an array to store the result
        int result[] = new int[2];
        // create a hashmap to store the value and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            // calculate the difference needed to reach the target
            int diff = target - arr[i];
            // check if the difference is already in the map
            if (map.containsKey(diff)) {
                // if found, store the indices in the result array
                result[0] = map.get(diff);
                result[1] = i;
                return result;
            }
            // if not found, add the current value and its index to the map
            map.put(arr[i], i);
        }

        // if no such indices are found, return [-1, -1]
        if(result[0] == 0 && result[1] == 0) {
            result[0] = -1;   
            result[1] = -1;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // prompt user to enter the number of elements in the array
        System.out.println("Enter the number of elements in the array:");
        int n = Integer.parseInt(reader.readLine());

        int[] nums = new int[n];
        // prompt user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }

        // prompt user to enter the target element
        System.out.println("Enter the target element:");
        int target = Integer.parseInt(reader.readLine());

        // call the twoSum method and store the result
        int[] result = twoSum(nums, target);
        // print the result
        System.out.println("Result :: [" + result[0] + ", " + result[1] + "]");
    }
}
