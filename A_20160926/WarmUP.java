package A_20160926;

public class WarmUP {

	public static void main(String[] args) {

		int N = 31294;
		System.out.println(warm(N));

	}

	static int warm(int N) {

		if (N <= 0)
			return 0;

		return N % 10 + warm(N / 10);

	}

}
