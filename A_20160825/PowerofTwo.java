package A_20160825;

public class PowerofTwo {

	public static void main(String[] args) {
		// https://leetcode.com/problems/power-of-two/
		// 4의 제곱수 확인, 다시 이해하기

		int n = 4;

		System.out.println(isPowerOfTwo(n));

	}

	static boolean isPowerOfTwo(int n) {

		return Integer.toString(n, 4).matches("10*");

	}

}
