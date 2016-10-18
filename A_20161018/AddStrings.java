package A_20161018;

//https://leetcode.com/problems/add-strings/
public class AddStrings {

	public static void main(String[] args) {

		String num1 = "2798";
		String num2 = "12413";

		System.out.println(addStrings(num1, num2));

	}

	static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int n = num1.length(), m = num2.length();
        int i = n - 1, j = m - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int x = i > -1 ? Integer.parseInt("" + num1.charAt(i)) : 0;
            int y = j > -1 ? Integer.parseInt("" + num2.charAt(j)) : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            sum = sum % 10;
            sb.append(sum);
            i--;
            j--;
        }
        return sb.reverse().toString();

	}
}
