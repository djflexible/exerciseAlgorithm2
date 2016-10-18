package A_20160828;

import java.util.Scanner;

public class A_2747 {
	// https://www.acmicpc.net/problem/2747
	// memorization을 이용해 풀기
	static int d[] = new int[10000];
	static int count = 0;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		for (int i = 0; i < d.length; i++) {	//초기화
			d[i] = -1;
		}

		System.out.println(pivo(n));
		System.out.println("반복 횟수 : " + count);
		input.close();

	}

	static int pivo(int n) {
		if (n < 2) {
			return n;
		}

		if (d[n] != -1) {
			return d[n];
		}
		d[0] = 0;
		d[1] = 1;

		d[n] = pivo(n - 1) + pivo(n - 2);
		count++;
		return d[n];

	}

}
