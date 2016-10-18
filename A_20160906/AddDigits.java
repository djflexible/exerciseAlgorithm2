package A_20160906;

public class AddDigits {
	// https://leetcode.com/problems/add-digits/
	public static void main(String[] args) {
		int num = 708538619;
		System.out.println(addDigits(num));

	}

	static int addDigits(int num) {
		int k = 0;
		int sum = 0;

		while (num > 0) {

			k = num % 10;
			sum = k + sum;
			num = num / 10;
		}

		int m = sum / 10;
		int n = sum % 10;
		int d = m + n;

		if (d == 10)
			return 1;
		if (d > 10) {
			m = d / 10;
			n = d % 10;
			return m + n;
		}

		else
			return d;

	}
}
