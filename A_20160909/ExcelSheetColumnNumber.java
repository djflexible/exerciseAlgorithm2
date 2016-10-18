package A_20160909;

public class ExcelSheetColumnNumber {
	// https://leetcode.com/problems/excel-sheet-column-number/
	public static void main(String[] args) {
		
		String s = "AB";
		System.out.println(titleToNumber(s));

	}

	static int titleToNumber(String s) {
		int value = 0;
        for(int i = 0; i < s.length(); i++)
            value = value * 26 + ((int)s.charAt(i) - 'A') + 1;
        return value;

	}

}
