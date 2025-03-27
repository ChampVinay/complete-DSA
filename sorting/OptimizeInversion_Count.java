package sorting;

public class OptimizeInversion_Count {

    // Function to count the number of inversions in an array using the merge sort algorithm
    public static int countInversions(int[] arr) {
        return mergeSortAndCount(arr, 0, arr.length - 1);
    }

    // Function to count the number of inversions in an array using the merge sort algorithm
    public static int mergeSortAndCount(int[] arr, int l, int r) {
        int count = 0;
        if (l < r) {
            int m = (l + r) / 2;
            count += mergeSortAndCount(arr, l, m);
            count += mergeSortAndCount(arr, m + 1, r);
            count += mergeAndCount(arr, l, m, r);
        }
        return count;
    }

    // Function to count the number of inversions in an array using the merge step of merge sort
    public static int mergeAndCount(int[] arr, int l, int m, int r) {
        int[] left = new int[m - l + 1];
        int[] right = new int[r - m];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[l + i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = arr[m + 1 + i];
        }

        int i = 0, j = 0, k = l, swaps = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }

        return swaps;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 4, 3, 9, 6}; // Example array to test the inversion count
        System.out.println("Inversion count :: " + countInversions(arr)); // Print the inversion count using the optimized method
    }
}
