package A_20161009;

public class ReverseWordsInAString2 {
	// https://leetcode.com/problems/reverse-words-in-a-string/
	public static void main(String[] args) {
		String s = "the sky is blue";
		System.out.println(reverseWords(s));

	}

	static String reverseWords(String s) {
		
			String sArry[] = s.trim().split("\\s+");
			StringBuffer sb = new StringBuffer();

			for (int i = sArry.length - 1; i > 0; i--) {
				sb.append(sArry[i] + " ");
				
			}

			return sb.toString() + sArry[0];
		
	}
}
