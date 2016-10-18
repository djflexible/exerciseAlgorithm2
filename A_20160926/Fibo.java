package A_20160926;

public class Fibo {

	public static void main(String[] args) {

		int N = 8;
		System.out.println(fibo(N));

	}

	static int fibo(int N) {

		if (N <= 1)
			return N;

		int fiboNums[] = new int[N + 1];
		fiboNums[0] = 0;
		fiboNums[1] = 1;

		return fiboNums[N - 1] + fiboNums[N - 2];

	}

}
