package A_20160822;

import java.util.Scanner;

public class Coding_Interview {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int numbers[] = { 2, 7, 11, 15 };
		int target = 26;

		int output[] = resultFuntion(numbers, target);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

		input.close();

	}

	static int[] resultFuntion(int numbers[], int target) {
		int result[] = new int[2];

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if ((target - numbers[i]) == numbers[j]) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
	}
}
