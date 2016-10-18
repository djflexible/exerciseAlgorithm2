package A_20160905;

import java.util.Scanner;

public class Review_q2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String strArry[] = str.split("");
		int count = 0;

		for (int i = 0; i < strArry.length;) {
			for (int j = 0; j < strArry.length; j++) {
				if (strArry[i].equals(strArry[j])) {
					count++;
				}
			}
			if ((count % 2 == 0)) {
				System.out.println("Yes");
			} else
				System.out.println("No");
			break;
		}
		scanner.close();
	}

}
