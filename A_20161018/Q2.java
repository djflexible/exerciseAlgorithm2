package A_20161018;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);
		try {
			HashMap<Character, Integer> countMap = new HashMap<>();
			String input = scanner.nextLine();

			for (char c : input.toCharArray()) {
				if (c < 'a' || c > 'z')
					throw new IllegalArgumentException(	//입력값이 알파벳 소문자가 아닐 경우
							"only lowercase characters['a'-'z']");

				if (countMap.containsKey(c)) {
					countMap.put(c, countMap.get(c) + 1);
				} else {
					countMap.put(c, 1);
				}
			}

			boolean check = false;
			for (char key : countMap.keySet()) {
				int count = countMap.get(key);
				if (count % 2 != 0) {
					check = true;
					break;
				}
			}

			if (check) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		} finally {
			scanner.close();
		}
	}
}