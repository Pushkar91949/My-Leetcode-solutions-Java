class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int ans = 0;

        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= cols - 3; j++) {
                if (helper(grid, i, j)) {
                    ans++;
                }
            }
        }

        return ans;
    }

    private boolean helper(int[][] grid, int r, int c) {
        Set<Integer> values = new HashSet<>();

        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                int value = grid[i][j];
                if (values.contains(value) || value < 1 || value > 9) { 
                    return false;
                }
                values.add(value);
            }
        }

        for (int i = r; i < r + 3; i++) {
            if (grid[i][c] + grid[i][c + 1] + grid[i][c + 2] != 15) {
                return false;
            }
        }

        for (int i = c; i < c + 3; i++) {
            if (grid[r][i] + grid[r + 1][i] + grid[r + 2][i] != 15) {
                return false;
            }
        }

        if (grid[r][c] + grid[r + 1][c + 1] + grid[r + 2][c + 2] != 15 ||
            grid[r + 2][c] + grid[r + 1][c + 1] + grid[r][c + 2] != 15) {
            return false;
        }

        return true;
    }
}
