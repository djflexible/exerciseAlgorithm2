package A_20160909;

public class SumOfTwoIntegers {
	// https://leetcode.com/problems/sum-of-two-integers/
	public static void main(String[] args) {
		int a = 5;
		int b = 9;
		System.out.println(getSum(a, b));
	}

	static int getSum(int a, int b) {
		if (a == 0)
			return b;
		if (b == 0)
			return a;

		while (b != 0) {
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		return a;
	}
}
