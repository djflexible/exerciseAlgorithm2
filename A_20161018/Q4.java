package A_20161018;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			ArrayList<Character> charList = new ArrayList<Character>();
			String input = scanner.nextLine();

			for (char c : input.toCharArray()) {
				if (c != ' ' && (c < 'a' || c > 'z'))
					throw new IllegalArgumentException(
							"only lowercase characters['a'-'z']");

				if (charList.contains(c))
					continue;
				charList.add(c);
				System.out.print(c);
			}	//for문 종료
		} finally {
			scanner.close();
		}
	}
}