package A_20161009;

public class ReverseWordsInAString {
	// https://leetcode.com/problems/reverse-words-in-a-string/
	public static void main(String[] args) {
		String s = "dd asd f";
		System.out.println(reverseWords(s));

	}

	static String reverseWords(String s) {
		
			String sArry[] = s.trim().split("\\s+");
			String result = "";

			for (int i = sArry.length - 1; i > 0; i--) {
				result += sArry[i] + " ";
			}

			return result + sArry[0];
		
	}
}
