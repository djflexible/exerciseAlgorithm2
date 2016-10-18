package A_20160906;

import java.util.ArrayList;
import java.util.Collections;

public class CreateMaximumNumber {
////안품
////https://leetcode.com/problems/create-maximum-number/
	public static void main(String[] args) {

		int nums1[] = { 3, 4, 6, 5 };
		int nums2[] = { 9, 1, 2, 5, 8, 3 };
		int k = 5;

		System.out.println(maxNumber(nums1, nums2, k));

	}

	static String maxNumber(int[] nums1, int[] nums2, int k) {

		ArrayList<Integer> merge = new ArrayList<>();

		for (int i = 0; i < nums1.length; i++) {
			merge.add(nums1[i]);
		}

		for (int i = 0; i < nums2.length; i++) {
			merge.add(nums2[i]);
		}

		Collections.sort(merge); // arraylist sort

		for (int i = 0; i < merge.size(); i++) {
			System.out.print(merge.get(i) + ", ");
		}

		ArrayList<Integer> merge2 = new ArrayList<>();

		for (int i = merge.size() - 1; i >= k; i--) {
			merge2.add(merge.get(i));
			// System.out.print(merge2.get(i) + ", ");

		}
		System.out.println();
		for (int i = 0; i < k; i++) {

			System.out.print(merge2.get(i) + ", ");
		}

		System.out.println();
		return merge.toString();

	}

}
