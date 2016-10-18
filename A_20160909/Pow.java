package A_20160909;

public class Pow {

	public static void main(String[] args) {

		double x = 8.88023;
		int n = 3;
		System.out.println(myPow(x, n));
	}

	static double myPow(double x, int n) {

		double k = Math.pow(x, n);
		
		return k;
	}

}
