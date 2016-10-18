package A_20160910;

import java.util.ArrayList;
import java.util.Scanner;

public class A_1929 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int M = input.nextInt();
		int N = input.nextInt();
		int count = 0;
		ArrayList<Integer> nums = new ArrayList<>();
		ArrayList<Integer> primeNums = new ArrayList<>();

		for (int i = M; i <= N; i++) {
			nums.add(i);
		}

		
		for (int i = 0; i < nums.size(); i++) {
//			double d = Math.sqrt(nums.get(i));
//			d = Math.floor(d); 
//			d = (int) d;

			for (int j = 1; j <= nums.size(); j++) {
				if (nums.get(i) % j == 0)
					count++;
			}

			if (count == 2) {
				primeNums.add(nums.get(i));
			}
			count = 0;
		}

		for (int i = 0; i < primeNums.size(); i++) {

			System.out.println(primeNums.get(i));
		}

		input.close();
	}

}
