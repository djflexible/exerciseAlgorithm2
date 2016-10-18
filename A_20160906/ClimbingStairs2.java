package A_20160906;

public class ClimbingStairs2 {
	// https://leetcode.com/problems/climbing-stairs/

	public static void main(String[] args) {

		int n = 35;
		System.out.println(climbStairs2(n));

	}

	static int climbStairs2(int n) {

		int d[] = new int[10000];
		for (int i = 0; i < d.length; i++) { // 초기화
			d[i] = -1;
		}
		
		if (n < 2) {
			return 1;
		}

		
		if (d[n] != -1) {
			return d[n];
		}
		d[0] = 1;
		d[1] = 1;

		d[n] = climbStairs2(n - 1) + climbStairs2(n - 2);
		return d[n];

	}
}
