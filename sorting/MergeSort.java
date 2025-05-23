package sorting;

public class MergeSort {
    // Main function that sorts an array using merge sort
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

    // Function to merge two subarrays left[] and right[] into arr[]
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

    // Main method to test the merge sort algorithm
    public static void main(String[] args) {
        int[] arr = {38, 27,34,12,45,23,18,10,21,34}; // Example array to be sorted
        mergeSort(arr);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/**
 * MergeSort Algorithm:
 * 
 * MergeSort is a divide-and-conquer algorithm that recursively divides the array
 * into two halves, sorts each half, and then merges the sorted halves back together.
 * 
 * Time Complexity:
 * - Best Case: O(n log n)
 * - Average Case: O(n log n)
 * - Worst Case: O(n log n)
 * 
 * Space Complexity:
 * - O(n): The algorithm requires additional space for the temporary arrays
 *   used during the merging process.
 * 
 * In-Place or Out-of-Place:
 * - MergeSort is an out-of-place algorithm because it requires additional
 *   memory to store the temporary arrays (left[] and right[]).
 */