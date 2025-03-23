package hashmap;

import java.util.HashMap;
import java.util.Map;

public class MaxElementOfArray {

    public static int maxElementOfArray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxElement = arr[0];
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= maxCount) {
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 5, 1, 6};
        System.out.println("Max element of array is :: " + maxElementOfArray(arr));
    }
}
