package A_20161007;

public class LengthOfLastWord {
//https://leetcode.com/problems/length-of-last-word/
	public static void main(String[] args) {
		String s = " ";
		System.out.println(lengthOgLastWord(s));

	}

	static int lengthOgLastWord(String s) {

		s = s.trim();
		String sArry[] = s.split(" ");
		return sArry[sArry.length - 1].length();

	}
}
