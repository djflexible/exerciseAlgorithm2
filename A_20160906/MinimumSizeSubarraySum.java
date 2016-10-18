package A_20160906;

import java.util.Scanner;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		// https://leetcode.com/problems/minimum-size-subarray-sum/
		Scanner input = new Scanner(System.in);
		int numbers[] = { 2, 3, 1, 2, 4, 3 };
		int s = 7;

		int output[] = resultFuntion(numbers, s);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

		input.close();

	}

	static int[] resultFuntion(int numbers[], int s) {
		int result[] = new int[2];

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if ((s - numbers[i]) == numbers[j]) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
	}
}
