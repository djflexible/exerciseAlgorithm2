package A_20161013;

//https://leetcode.com/problems/number-of-islands/
public class NumberOfIslands {

	static int numOfRow;
	static int numOfCol;

	public static void main(String[] args) {
		char grid[][] = { { '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' } };
		System.out.println(numIslands(grid));
	}

	public static int numIslands(char[][] grid) {
		int numOfIsland = 0;
		numOfRow = grid.length;
		if (numOfRow == 0)
			return 0;
		numOfCol = grid[0].length;

		for (int i = 0; i < numOfRow; i++) {
			for (int j = 0; j < numOfCol; j++) {
				if (grid[i][j] == '1') {
					numOfIsland++;
					dfs(grid, i, j);
				}
			}
		}

		return numOfIsland;
	}

	public static void dfs(char[][] grid, int i, int j) {
		if (i < 0 || i >= numOfRow || j < 0 || j >= numOfCol || grid[i][j] != '1')
			return;
		grid[i][j] = '0';
		dfs(grid, i - 1, j);
		dfs(grid, i, j - 1);
		dfs(grid, i, j + 1);
		dfs(grid, i + 1, j);
	}

}
