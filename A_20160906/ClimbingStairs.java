package A_20160906;

public class ClimbingStairs {
	// https://leetcode.com/problems/climbing-stairs/
	public static void main(String[] args) {

		int n = 2;
		System.out.println(climbStairs(n));

	}

	static int climbStairs(int n) {
		int result = 0;
		if (n < 2) {
			return 1;
		}
		int pivos[] = new int[n+1];
		pivos[0] = 1;
		pivos[1] = 1;
		
		if (n >= 2) {
			for (int i = 2; i <= n; i++) {
				pivos[i] = pivos[i - 1] + pivos[i - 2];
				result = pivos[i];
			}
		}
		return result;

	}
}
