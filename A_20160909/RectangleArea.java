package A_20160909;

public class RectangleArea {

	public static void main(String[] args) {

		int A = -3;
		int B = 0;
		int C = 3;
		int D = 4;
		int E = 0;
		int F = -1;
		int G = 9;
		int H = 2;
		System.out.println(computeArea(A, B, C, D, E, F, G, H));

	}

	static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		int result = (C - A) * (D - B) + (G - E) * (H - F);
		
		if (C <= E || G <= A || H <= B || D <= F)
			return result;
		
		int dx = Math.min(C, G) - Math.max(A, E);
		int dy = Math.min(D, H) - Math.max(B, F);

		return result - dx * dy;

	}
}
