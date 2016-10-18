package A_20160926;

import java.util.Scanner;

public class GNP {

	static int cnt = 0;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int M = input.nextInt();
		int N = input.nextInt();
		int arry[][] = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				arry[i][j] = input.nextInt();
			}
		}

		System.out.println(cnt);

		input.close();

	}

	static int gnpFuntion(int a[][]) {

		return cnt;
	}

	static void right() {

	}

	static void bottom() {

	}

}
