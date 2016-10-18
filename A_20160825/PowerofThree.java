package A_20160825;

public class PowerofThree {

	public static void main(String[] args) {
		// https://leetcode.com/problems/power-of-three/

		int n = 81;

		System.out.println(isPowerOfThree(n));

	}

	static boolean isPowerOfThree(int n) {

		return Math.log10(n) / Math.log10(3) % 1 == 0;

	}
}
