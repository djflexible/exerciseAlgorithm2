package A_20161009;

import java.util.Arrays;

public class FindtheDifference {
	// https://leetcode.com/problems/find-the-difference/
	public static void main(String[] args) {

		String s = "abcd";
		String t = "eabcd";
		System.out.println(findTheDifference(s, t));
	}

	static char findTheDifference(String s, String t) {

		char sArray[] = s.toCharArray();
		char tArray[] = t.toCharArray();

		Arrays.sort(sArray);
		Arrays.sort(tArray);

		for (int i = 0; i < sArray.length; i++) {
			if (tArray[i] != sArray[i])
				return tArray[i];
		}
		return tArray[tArray.length - 1];

	}

}
