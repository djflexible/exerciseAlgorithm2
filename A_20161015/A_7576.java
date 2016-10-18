package A_20161015;

import java.util.Scanner;

public class A_7576 {

	static int M = 0;
	static int N = 0;
	static int CNT = 0;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		M = input.nextInt();
		N = input.nextInt();
		int BOX[][] = new int[N][M];

		System.out.println(M);
		System.out.println(N);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				BOX[i][j] = input.nextInt();
			}
		}

		System.out.println(sol(BOX));

		input.close();
	}

	public static int sol(int[][] BOX) {

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (BOX[i][j] == 1) {
					//CNT++;
					dfs(BOX, i, j);
					CNT++;
				}
			}
		}

		return CNT;
	}

	public static void dfs(int[][] BOX, int i, int j) {
		if (i < 0 || i >= N || j < 0 || j >= M || BOX[i][j] == 0)
			return;
		BOX[i][j] = 1;
		dfs(BOX, j - 1, i);
		dfs(BOX, j, i - 1);
		dfs(BOX, j, i + 1);
		dfs(BOX, j + 1, i);
	}
}