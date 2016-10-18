package A_20161009;

import java.util.ArrayList;

public class FizzBuzz {

	public static void main(String[] args) {

		int n = 30;
		System.out.println(fizzBuzz(n));

	}

	static ArrayList<String> fizzBuzz(int n) {

		ArrayList<String> fb = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				fb.add("FizzBuzz");
			}

			else if (i % 3 == 0) {
				fb.add("Fizz");
			}

			else if (i % 5 == 0) {
				fb.add("Buzz");
			} else {
				fb.add(String.valueOf(i));
			}
		}

		return fb;

	}
}
