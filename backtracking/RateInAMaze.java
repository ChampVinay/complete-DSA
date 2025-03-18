package backtracking;

import java.util.ArrayList;

public class RateInAMaze {

    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        ArrayList<String> result = new ArrayList<>();
        if (mat == null || mat.size() == 0 || mat.get(0).get(0) == 0) {
            return result;
        }
        int n = mat.size();
        boolean[][] visited = new boolean[n][n];
        findPaths(mat, 0, 0, "", visited, result);
        return result;
    }

    private void findPaths(ArrayList<ArrayList<Integer>> mat, int x, int y, String path, boolean[][] visited, ArrayList<String> result) {
        int n = mat.size();
        if (x == n - 1 && y == n - 1) {
            result.add(path);
            return;
        }

        if (x < 0 || y < 0 || x >= n || y >= n || mat.get(x).get(y) == 0 || visited[x][y]) {
            return;
        }

        visited[x][y] = true;

        // Move Down
        findPaths(mat, x + 1, y, path + "D", visited, result);
        // Move Left
        findPaths(mat, x, y - 1, path + "L", visited, result);
        // Move Right
        findPaths(mat, x, y + 1, path + "R", visited, result);
        // Move Up
        findPaths(mat, x - 1, y, path + "U", visited, result);

        visited[x][y] = false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(0);
        row1.add(0);
        row1.add(0);
        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(1);
        row2.add(1);
        row2.add(0);
        row2.add(1);
        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(1);
        row3.add(1);
        row3.add(0);
        row3.add(0);
        ArrayList<Integer> row4 = new ArrayList<>();
        row4.add(0);
        row4.add(1);
        row4.add(1);
        row4.add(1);
        mat.add(row1);
        mat.add(row2);
        mat.add(row3);
        mat.add(row4);
        RateInAMaze obj = new RateInAMaze();
        System.out.println(obj.findPath(mat));
    }
}
