package shortingalgorithms;

import java.util.Arrays;

/*
 * It is called bubble sort.
 * It is an in-place sorting algorithm because it doesn't take extra space for sorting.
 * It is a stable sorting algorithm because the relative order of equal elements is preserved.
 * Time complexity O(n^2)
 * Space complexity O(1)
 */

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = true;
                }
            }
            if (!isSorted) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 4, 3, 9, 6};
        
        long startTime = System.nanoTime();
        bubbleSort(arr);
        long endTime = System.nanoTime();
        
        System.out.println("Sorted array :: " + Arrays.toString(arr));
        System.out.println("Execution time in nanoseconds: " + (endTime - startTime));
    }
}