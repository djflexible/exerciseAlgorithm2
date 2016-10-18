package A_20161018;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int Tarry[] = new int[T];

		for (int i = 0; i < T; i++) {
			Tarry[i] = sc.nextInt();
		}

		for (int i = 0; i < T; i++) {
			System.out.println(Tarry[i] * Tarry[i]);
		}

		sc.close();

	}

}
