package A_20160828;

import java.util.Scanner;

public class A_2747_re {
	// https://www.acmicpc.net/problem/2747

	static int count = 0;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		System.out.println(pivo(n + 1));
		input.close();

	}

	static int pivo(int n) {
		int result = -1;

		if (n < 2) {
			return n;
		}
		int pivos[] = new int[n];
		pivos[0] = 0;
		pivos[1] = 1;

		if (n >= 2) {
			for (int i = 2; i < n; i++) {
				pivos[i] = pivos[i - 1] + pivos[i - 2];
				result = pivos[i];
			}
		}
		return result;

	}

}
