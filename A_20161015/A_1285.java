package A_20161015;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1285
public class A_1285 {

	public static void main(String[] args) {
		// 앞 0-H, 뒤 1-T
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[][] arry = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arry[i][j] = input.nextInt();
			}
		}

		input.close();
	}
}
