package backtracking;

public class SuddukoProblem {

    // Method to solve the Sudoku puzzle
    public static boolean solveSudoku(int[][] board) {
        int N = board.length;
        int row = -1;
        int col = -1;
        boolean isEmpty = true;

        // Find an empty cell in the Sudoku board
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                break;
            }
        }

        // If there are no empty cells, the Sudoku is solved
        if (isEmpty) {
            return true;
        }

        // Try placing numbers 1 to N in the empty cell
        for (int num = 1; num <= N; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num; // Place the number

                // Recursively try to solve the rest of the board
                if (solveSudoku(board)) {
                    return true;
                } else {
                    board[row][col] = 0; // Backtrack if placing num doesn't lead to a solution
                }
            }
        }
        return false; // Trigger backtracking
    }

    // Method to check if it's safe to place a number in a cell
    public static boolean isSafe(int[][] board, int row, int col, int num) {
        // Check the row for the same number
        for (int x = 0; x < board.length; x++) {
            if (board[row][x] == num) {
                return false;
            }
        }

        // Check the column for the same number
        for (int x = 0; x < board.length; x++) {
            if (board[x][col] == num) {
                return false;
            }
        }

        // Check the 3x3 sub-grid for the same number
        int sqrt = (int) Math.sqrt(board.length);
        int startRow = row - row % sqrt;
        int startCol = col - col % sqrt;

        for (int i = 0; i < sqrt; i++) {
            for (int j = 0; j < sqrt; j++) {
                if (board[i + startRow][j + startCol] == num) {
                    return false;
                }
            }
        }

        return true; // It's safe to place the number
    }

    // Method to print the Sudoku board
    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Main method to test the Sudoku solver
    public static void main(String[] args) {
        int[][] board = {
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 0, 0, 1, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solveSudoku(board)) {
            printBoard(board); // Print the solved board
        } else {
            System.out.println("No solution exists."); // Print if no solution exists
        }
    }
}
