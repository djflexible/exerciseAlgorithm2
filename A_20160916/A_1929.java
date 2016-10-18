package A_20160916;

import java.util.Scanner;

public class A_1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		boolean flag = true;
		
		for (int i = 2; i <= n; i++) {
			flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true && i >= m) {
				System.out.println(i);
			}
		}

		sc.close();
	}
}