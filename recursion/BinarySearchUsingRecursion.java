package recursion;

public class BinarySearchUsingRecursion {

    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is smaller than mid, it can only be present in the left subarray
            if (arr[mid] > target) {
                return binarySearch(arr, left, mid - 1, target);
            }

            // Else the target can only be present in the right subarray
            return binarySearch(arr, mid + 1, right, target);
        }

        // Target is not present in the array
        return -1;
    }

    public static void runBinarySearchTests(int[] arr, int[] targets) {
        int n = arr.length;
        for (int target : targets) {
            int result = binarySearch(arr, 0, n - 1, target);
            System.out.println("Element " + target + " is at index: " + result);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int[] targets = {10, 4, 2, 40, 5};

        runBinarySearchTests(arr, targets);
    }
}