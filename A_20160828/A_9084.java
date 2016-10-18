package A_20160828;

import java.util.Scanner;

public class A_9084 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		int M[] = new int[T];

		for (int i = 0; i < T; i++) {
			int N[] = new int[input.nextInt()];
			for (int j = 0; j < N.length; j++) {
				N[i] = input.nextInt();
			}
			M[i] = input.nextInt();
		}

		input.close();

	}

}
