package A_20160903;

import java.util.Arrays;
import java.util.Scanner;

public class A_10815_re {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		int nums[] = new int[T];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = input.nextInt();
		}

		Arrays.sort(nums);

		// 6 3 2 10 -10
		// -10 2 3 6 10

		int M = input.nextInt();
		int nums2[] = new int[M];
		//int result[] = new int[M];

		for (int i = 0; i < nums2.length; i++) {
			nums2[i] = input.nextInt();
		}

		for (int i = 0; i < M; i++) {
			int left = 0;
			int right = nums.length - 1;
			// 0 5
			boolean bTrue = false;

			while (left <= right) {
				int mid = (left + right) / 2;
				if (nums[mid] == nums2[i]) {
					// position = mid;
					bTrue = true;
					break;
				} else if (nums[mid] > nums2[i]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
			if (bTrue == true) {
				//result[i] = 1;
				System.out.print("1 ");
			} else {
				//result[i] = 0;
				System.out.print("0 ");
			}
		}
		System.out.println("");

		input.close();

	}

}
