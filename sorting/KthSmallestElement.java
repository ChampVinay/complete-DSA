package sorting;

public class KthSmallestElement {
    // Function to find the kth smallest element in an array
    public static int kthSmallest(int[] arr, int k) {
        // Sort the array using merge sort
        mergeSort(arr);
        // Return the kth smallest element (k-1 index)
        return arr[k - 1];
    }

    public static void mergeSort(int[] arr) {
        // Base case: if the array has less than 2 elements, it's already sorted
        if (arr.length < 2) {
            return;
        }

        // Find the middle point to divide the array into two halves
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // Copy data to temporary arrays left[] and right[]
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        // Recursively sort the two halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(left, right, arr);
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int i = 0, j = 0, k = 0;

        // Merge the temp arrays back into arr[]
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy the remaining elements of left[], if any
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy the remaining elements of right[], if any
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }


    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15}; // Example array
        int k = 5; // Find the 3rd smallest element

        int result = kthSmallest(arr, k);
        System.out.println(k + "th smallest element is " + result);
    }


    /*
     * Time Complexity: O(n log n) for sorting the array using merge sort
     * Space Complexity: O(n) for the temporary arrays used in merge sort
     * Note: The kth smallest element is found in O(1) time after sorting the array.
     * This implementation is not optimal for large arrays, as it uses O(n) space for sorting.
     * For large arrays, consider using a more efficient algorithm like Quickselect or a min-heap.
     * For example, Quickselect has an average time complexity of O(n) and a space complexity of O(1).
     * However, Quickselect has a worst-case time complexity of O(n^2) if the pivot is not chosen well.
     * In practice, Quickselect is often faster than sorting the entire array, especially for large datasets.
     */
}
