package A_20160829;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		// https://leetcode.com/problems/excel-sheet-column-title/
		//http://www.dreamy.pe.kr/zbxe/CodeClip/158356	StringBuilder 사용법
		int n = 59;
		System.out.println(convertToTitle(n));
		System.out.println('A' + 'G');
	}

	static String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();
		while (n-- != 0) {
			sb.append((char) (n % 26 + 'A'));
			n = n / 26;
		}
		return sb.reverse().toString();
	}
}
