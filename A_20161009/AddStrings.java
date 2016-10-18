package A_20161009;

import java.util.ArrayList;

//https://leetcode.com/problems/add-strings/
public class AddStrings {

	public static void main(String[] args) {

		String num1 = "2798";
		String num2 = "12413";

		System.out.println(addStrings(num1, num2));

	}

	static String addStrings(String num1, String num2) {

		String num1Arry[] = num1.split("");
		String num2Arry[] = num2.split("");

		ArrayList<Integer> nums1 = new ArrayList<>();
		ArrayList<Integer> nums2 = new ArrayList<>();
		StringBuffer sb = new StringBuffer();
		int k = 0;

		int sum = 0;
		int carry = 0;

		for (int i = 0; i < num1Arry.length; i++) {
			nums1.add(Integer.parseInt(num1Arry[num1Arry.length - 1 - i]));
		}

		for (int i = 0; i < num2Arry.length; i++) {
			nums2.add(Integer.parseInt(num2Arry[num2Arry.length - 1 - i]));
		}

		if (nums1.size() < nums2.size())
			k = nums2.size();
		else
			k = nums1.size();

		if (nums1.size() < nums2.size()) {
			for (int i = 0; i < nums2.size() - nums1.size(); i++) {
				nums1.add(carry);
			}
		}

		if (nums1.size() > nums2.size()) {
			for (int i = 0; i <= nums1.size() - nums2.size() + 1; i++) {
				nums2.add(carry);
			}
		}

		for (int i = 0; i < nums2.size(); i++) {

			sum = nums1.get(i) + nums2.get(i) + carry;

			if (sum >= 10) {
				sum = sum % 10;
				sb.append(sum);
				carry = 1;
			} else {
				sb.append(sum);
				carry = 0;
			}

			if (i == k - 1) {
				sb.append(carry);
			}
		}

		return sb.reverse().toString();
	}
}
