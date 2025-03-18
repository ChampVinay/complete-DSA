 package hashmap;

public class CalculateMaxAreaOfHistogram {

    /**
     * This method calculates the maximum area of a histogram.
     * 
     * @param arr the array representing the heights of the histogram's bars
     * @return the maximum area of the histogram
     */
    public static int maxAreaOfHistogram(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];  // Array to store the index of the nearest smaller element to the left
        int[] right = new int[n]; // Array to store the index of the nearest smaller element to the right
        int maxArea = 0;          // Variable to store the maximum area

        // Fill the left array
        for (int i = 0; i < n; i++) {
            left[i] = i;
            while (left[i] > 0 && arr[left[i] - 1] >= arr[i]) {
                left[i] = left[left[i] - 1];
            }
        }

        // Fill the right array
        for (int i = n - 1; i >= 0; i--) {
            right[i] = i;
            while (right[i] < n - 1 && arr[right[i] + 1] >= arr[i]) {
                right[i] = right[right[i] + 1];
            }
        }

        // Calculate the maximum area
        for (int i = 0; i < n; i++) {
            maxArea = Math.max(maxArea, arr[i] * (right[i] - left[i] + 1));
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 2, 5, 4, 5, 1, 6 };
        System.out.println("Max area of histogram is :: " + maxAreaOfHistogram(arr));
    }
}