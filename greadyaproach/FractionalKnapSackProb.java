package greadyaproach;

public class FractionalKnapSackProb {

    // Function to calculate the maximum profit in the fractional knapsack problem
    public static double fractionalKnapsack(int[] weights, int[] values, int capacity) {
        // Create an array to store the value-to-weight ratio
        double[][] ratio = new double[weights.length][2];
        
        // Calculate the value-to-weight ratio for each item
        for (int i = 0; i < weights.length; i++) {
            ratio[i][0] = (double) values[i] / weights[i]; // Value-to-weight ratio
            ratio[i][1] = weights[i]; // Weight of the item
        }
        
        // Sort the items based on their value-to-weight ratio in descending order
        java.util.Arrays.sort(ratio, (a, b) -> Double.compare(b[0], a[0]));
        
        double maxProfit = 0.0; // Initialize maximum profit
        
        // Iterate through the sorted items
        for (int i = 0; i < weights.length; i++) {
            if (capacity == 0) {
                break; // If the capacity is full, break out of the loop
            }
            
            // If the weight of the item is less than or equal to the remaining capacity
            if (ratio[i][1] <= capacity) {
                maxProfit += ratio[i][0] * ratio[i][1]; // Add the full value of the item to maxProfit
                capacity -= ratio[i][1]; // Decrease the remaining capacity
            } else {
                maxProfit += ratio[i][0] * capacity; // Add the fraction of the item that fits in the remaining capacity
                capacity = 0; // Set capacity to zero as it is now full
            }
        }
        
        return maxProfit; // Return the maximum profit
    }

    public static void main(String[] args) {
        
        int[] weights = {10, 20, 30};
        int[] values = {60, 100, 120};
        int capacity = 50;
        
        double maxProfit = fractionalKnapsack(weights, values, capacity);
        System.out.println("Maximum profit: " + maxProfit); // Output: Maximum profit: 240.0
    }
}
