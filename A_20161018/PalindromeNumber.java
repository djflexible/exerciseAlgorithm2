package A_20161018;

public class PalindromeNumber {
	// https://leetcode.com/problems/palindrome-number/
	public static void main(String[] args) {

		int x = 2147247412;
		System.out.println(isPalindrome(x));
	}

	static boolean isPalindrome(int x) {
		String str = Integer.toString(x);
		String strArry[] = str.split("");
		boolean check = true;

		for (int i = 0; i < strArry.length / 2; i++) {
			if (strArry[i].equals(strArry[strArry.length - 1 - i]) == false) {
				check = false;
			}
		}

		return check;
	}
}
