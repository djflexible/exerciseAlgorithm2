package A_20160912;

import java.util.HashMap;

public class ContainsDuplicate {
	// https://leetcode.com/problems/contains-duplicate/
	public static void main(String[] args) {

		int nums[] = { 3, 5, 2, 89, 89, 90 };
		System.out.println(containsDuplicate(nums));

	}

	static boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> conNums = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (conNums.containsKey(nums[i])) {
				return true;
			} else {
				conNums.put(nums[i], 0);
			}
		}

		return false;
	}
}
