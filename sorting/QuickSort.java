package sorting;

public class QuickSort {
    // Function to partition the array on the basis of pivot element
    static int partition(int[] arr, int low, int high) {
        // Select the pivot element
        int pivot = arr[high];
        // Initialize the index for the smaller element
        int i = (low - 1);

        // Put the elements smaller than pivot on the left and greater than pivot on the right of pivot
        for (int j = low; j < high; j++) {
            // If the current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return (i + 1);
    }

    // Function to perform quicksort
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
          /* Find pivot element such that
            element smaller than pivot are on the left
            element greater than pivot are on the right*/  
            int pi = partition(arr, low, high);

            // Recursive call on the left of pivot
            quickSort(arr, low, pi - 1);

            // Recursive call on the right of pivot
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10}; // Example array to be sorted
        quickSort(arr, 0, arr.length - 1);

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*
Time Complexity:
- Best Case: O(n log n) [Occurs when the pivot divides the array into two nearly equal halves]
- Average Case: O(n log n)
- Worst Case: O(n^2) [Occurs when the pivot is the smallest or largest element repeatedly]

Space Complexity:
- O(log n) [For recursive stack space in the best/average case]
- O(n) [In the worst case due to recursion depth]

In-place Algorithm:
- Yes, QuickSort is an in-place sorting algorithm as it does not require extra space for another array.
*/
