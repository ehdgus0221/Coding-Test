class Solution {
    static char[][] grid;
    static boolean[][] visited;
    
    static void dfs(int row, int col) {
        visited[row][col] = true;

        if(col + 1 < grid[0].length && grid[row][col+1] != '0' && !visited[row][col+1]) {
            dfs(row, col + 1);
        }
        if(col - 1 >= 0 && grid[row][col - 1] != '0'&& !visited[row][col - 1]) {
            dfs(row, col - 1);
        }

        if(row + 1 < grid.length && grid[row + 1][col] != '0' && !visited[row + 1][col]) {
            dfs(row + 1, col);
        }

        if(row - 1 >= 0 && grid[row - 1][col] != '0' && !visited[row - 1][col]) {
            dfs(row - 1, col);
        }
    }
    public int numIslands(char[][] grid) {
        this.grid = grid;
        this.visited = new boolean[grid.length][grid[0].length];

        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '0' || visited[i][j] == true) continue;
                dfs(i, j);
                result++;

            }
            
        }

        return result;
    }
}