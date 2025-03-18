package backtracking;

import java.util.ArrayList;
import java.util.List;

public class NqueenProblem {

    // Method to solve the N-Queen problem
    public static void solveNQueen(int[][] board, int col, int n, List<List<String>> result) {
        // If all queens are placed, add the solution to the result list
        if (col == n) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    sb.append(board[i][j]);
                }
                list.add(sb.toString());
            }
            result.add(list);
            return;
        }

        // Try placing the queen in all rows one by one
        for (int i = 0; i < n; i++) {
            // Check if it's safe to place the queen at board[i][col]
            if (isSafe(board, i, col, n)) {
                // Place the queen
                board[i][col] = 1;
                // Recur to place the rest of the queens
                solveNQueen(board, col + 1, n, result);
                // Backtrack and remove the queen
                board[i][col] = 0;
            }
        }
    }

    // Method to check if it's safe to place a queen at board[row][col]
    private static boolean isSafe(int[][] board, int row, int col, int n) {
        // Check the row on the left side
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check the upper diagonal on the left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check the lower diagonal on the left side
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // Main method to test the N-Queen problem solution
    public static void main(String[] args) {
        int n = 4; // Size of the board (4x4)
        int[][] board = new int[n][n]; // Initialize the board
        List<List<String>> result = new ArrayList<>(); // List to store the solutions
        solveNQueen(board, 0, n, result); // Solve the N-Queen problem
        System.out.println(result); // Print the solutions
    }
}
