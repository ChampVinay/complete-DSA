package arrayproblems;

public class SubArraySumOptimize {
    static void subarraySum(int[] arr, int target) {
        int start = 0;
        int end = 0;
        int sum = 0;

        while (start < arr.length) {
            if (sum == target) {
                System.out.println("Sum found between indexes " + start + " and " + (end - 1));
                return;
            }

            if (sum < target && end < arr.length) {
                sum += arr[end];
                end++;
            } else {
                sum -= arr[start];
                start++;
            }
        }

        System.out.println("No subarray found");
    }
    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int sum = 23;
        subarraySum(arr, sum);
    }
}
