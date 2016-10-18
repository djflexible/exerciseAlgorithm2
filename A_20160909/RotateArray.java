package A_20160909;

import java.util.ArrayList;

public class RotateArray {

	public static void main(String[] args) {
		// https://leetcode.com/problems/rotate-array/
		// answer
		// https://discuss.leetcode.com/topic/51183/easy-to-read-java-solution-without-using-reverse
		int nums[] = { 1,3,1,2,4 };
		int k = 2;
		rotate(nums, k);
	}

	static void rotate(int[] nums, int k) {
		ArrayList<Integer> nums2 = new ArrayList<>();
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums.length == 1)
				break;

			if (nums2.size() < k) {
				nums2.add(nums[nums.length - k + i]);
			}
			if (nums2.size() >= k) {
				nums2.add(nums[count]);
				count++;
			}

			System.out.print(nums2.get(i) + ", ");
		}

		System.out.println();
		for (int i = 0; i < nums.length; i++) {
			if (nums.length == 1) {
				nums2.add(nums[0]);
				nums[0] = nums2.get(0);
				System.out.print(nums[i] + ", ");
				break;
			}
			nums[i] = nums2.get(i);
			System.out.print(nums[i] + ", ");
		}

	}
}
