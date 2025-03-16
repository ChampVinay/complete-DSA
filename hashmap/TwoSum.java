package hashmap;

import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {
        // create an array to store the result
        int result[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                result[0] = map.get(diff);
                result[1] = i;
                return result;
            }
            map.put(arr[i], i);
        }

        if(result[0] == 0 && result[1] == 0) {
            result[0]=-1;   
            result[1]=-1;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of elements in the array:");
        int n = Integer.parseInt(reader.readLine());

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println("Enter the target element:");
        int target = Integer.parseInt(reader.readLine());

        int[] result = twoSum(nums, target);
        System.out.println("Result :: [" + result[0] + ", " + result[1] + "]");
    }
}
