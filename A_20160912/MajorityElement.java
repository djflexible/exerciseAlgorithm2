package A_20160912;

import java.util.HashMap;

public class MajorityElement {
	// https://leetcode.com/problems/majority-element/
	public static void main(String[] args) {

		int nums[] = { 1, 2, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 1 };
		System.out.println(majorityElement(nums));
	}

	static int majorityElement(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i]))
				map.put(nums[i], map.get(nums[i]) + 1);
			else
				map.put(nums[i], 1);

			if (map.containsKey(nums[i]) && (map.get(nums[i]) > nums.length / 2))
				return nums[i];
		}

		return -1;
	}
}
