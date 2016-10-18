package A_20161018;

//경로 가지수 구하기, 경로 구하기, 경로 표로 표현
public class Grid {

	static int[][] path = new int[100][100];

	public static void main(String[] args) {

		int[][] grid = { { 1, 1, 0, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1 },
				{ 1, 0, 1, 1, 1 } };

		int n = grid_way(0, 0, grid);
		System.out.println(n);
	}

	private static int grid_way(int i, int j, int[][] grid) {
		if (i > grid.length - 1 || j > grid[0].length - 1) {
			return 0;
		}
		if (grid[i][j] == 0) {
			return 0;
		}
		if (i == grid.length - 1 && j == grid[0].length - 1) {
			return 1;
		}

		return grid_way(i + 1, j, grid) + grid_way(i, j + 1, grid);
	}

}