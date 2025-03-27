package sorting;

// This class contains methods to count the number of inversions in an array
public class Inversion_count {

    // This method uses a brute force approach to count inversions in the array
    // An inversion is a pair (i, j) such that i < j and arr[i] > arr[j]
    public static int brutForceCount(int[] arr) {
        int count = 0;
        // Iterate through each pair of elements in the array
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Increment count if an inversion is found
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count; // Return the total count of inversions
    }

    public static void main(String[] args) {
        // Example array to test the inversion count
        int[] arr = {2, 5, 7, 4, 3, 9, 6};
        // Print the inversion count using the brute force method
        System.out.println("Inversion count :: " + brutForceCount(arr));
    }
}
