package A_20160905;

import java.util.Scanner;

public class Review_q1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int number[] = new int[N];

		for (int i = 0; i < N; i++) {
			number[i] = input.nextInt();
			number[i] = number[i] * number[i];
		}

		for (int i = 0; i < N; i++) {
			System.out.println(number[i]);
		}

		input.close();

	}

}
