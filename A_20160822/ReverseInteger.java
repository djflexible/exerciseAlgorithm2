package A_20160822;

import java.io.IOException;

public class ReverseInteger {
	// https://leetcode.com/problems/reverse-integer/
	// Integer.MAX_VALUE 이해하기
	public static void main(String[] args) throws IOException {

		int x = 236469;

		System.out.println(reverse(x));
	}

	static public long reverse(int x) {
		int res = 0;
		while (x != 0) {
			if (res > 0 && res > Integer.MAX_VALUE / 10) {
				return 0;
			}

			if (res < 0 && res < Integer.MIN_VALUE / 10) {
				return 0;
			}

			res = res * 10 + x % 10;
			x = x / 10;
		}
		return res;

	}

}
