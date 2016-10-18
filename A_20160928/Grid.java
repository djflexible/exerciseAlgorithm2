package A_20160928;

//경로 가지수 구하기, 경로 구하기, 경로 표로 표현
public class Grid {

	static int[][] path = new int[100][100];

	public static void main(String[] args) {
		
		int[][] grid = { { 1, 1, 0, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1 },
				{ 1, 0, 1, 1, 1 } };

		int n = grid_way(0, 0, grid);
		System.out.println(n);

		int s1 = 0;
		int s2 = 0;
		int e1 = 4;
		int e2 = 4;
		String way = "";
		printAllWay(grid, s1, s2, e1, e2, way);

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

	private static void printAllWay(int[][] grid, int s1, int s2, int e1, int e2, String way) {
		if (s1 > e1 || s2 > e2)
			return;
		if (s1 == e1 && s2 == e2) {
			way += "[" + s1 + "," + s2 + "]";
			System.out.println(way);
			return;
		}

		if (grid[s1][s2] == 0) {
			way += "[" + s1 + "," + s2 + "]-";
			printAllWay(grid, s1 + 1, s2, e1, e2, way);
			printAllWay(grid, s1, s2 + 1, e1, e2, way);
		}
	}
}