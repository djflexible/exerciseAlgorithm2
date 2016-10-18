package A_20160926;

public class Recursive {

	public static void main(String[] args) {
		// 1부터 n까지의 합을 recursive
		int N = 5;
		System.out.println(recurSum(N));
	}

	static int recurSum(int N) {

		if (N <= 1) {
			return N;
		} else
			return N + recurSum(N - 1);

	}

}
