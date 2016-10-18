package A_20160928;

import java.util.Scanner;

public class GNP_dp {
	// 0,0 시작 4,4 도착하는 가짓수 구하기, 오른쪽 아님 아래
	static int dp[][] = new int[10000][10000];

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int arry[][] = new int[5][5];

		int board[][] = { { 0, 0, 1, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 0 }, { 0, 0, 0, 0, 0 },
				{ 0, 1, 0, 0, 0 } };

		int startX = input.nextInt();
		int startY = input.nextInt();

		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp.length; j++) {
				dp[i][j] = -1;
			}
		}

		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp.length; j++) {
				if (board[i][j] == 1) {
					dp[i][j] = 0;
				}

				else if (board.length == 0) {
					dp[i][j] = 1;
					continue;
				}
				else{
					//dp[i][j] = dp[][]
				}
			}
		}

		int i = 0;
		int j = 0;

		if (i == 0 && j == 0) {
			dp[i][j] = 1;
		}

		input.close();

	}

	static int gnp(int arry[][]) {
		if (0 > arry.length - 1 || 0 > arry[0].length - 1) {
			return 0;
		}

		return 0;

	}

}
