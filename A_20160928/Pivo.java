package A_20160928;

import java.util.Scanner;

public class Pivo {

	static int d[] = new int[10000];

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int N = input.nextInt();

		for (int i = 0; i < d.length; i++) {
			d[i] = -1;
		}

		System.out.println("final num : "+ pivo(N));

		input.close();
	}

	static int pivo(int N) {
		if (N < 2) {
			return N;
		}

		if (d[N] != -1) {
			return d[N];
		}
		
		d[0] = 1;
		d[1] = 1;

		d[N] = pivo(N - 1) + pivo(N - 2);

		System.out.print(d[N] + ", ");
		return d[N];
	}

}
