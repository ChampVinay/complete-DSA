package searching;

public class BinarySearch {

	// Performs binary search on a sorted array
	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                result = mid; // possible floor, but look for a larger one
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
		//return -1; // not found
	}

    // Main method to test the binary search
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int target = 5;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found"+result);
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
