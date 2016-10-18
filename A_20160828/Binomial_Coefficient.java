package A_20160828;

public class Binomial_Coefficient {

	static int count = 0;
	static int count2 = 0;
	static int cache[][] = new int[30][30];

	public static void main(String[] args) {

		for (int i = 0; i < cache.length; i++) {//초기화 빼먹지 말기
			for (int j = 0; j < cache.length; j++) {
				cache[i][j] = -1;
			}
		}

		System.out.println(bino(10, 2));
		System.out.println(count + "회 반복");

		System.out.println(binoCache(10, 2));
		System.out.println(count2 + "회 반복");

	}

	static int bino(int n, int r) {
		if (r == 0 || n == r)
			return 1;
		else
			count++;
		return bino(n - 1, r - 1) + bino(n - 1, r);
	}

	static int binoCache(int n, int r) {// 메모제이션 이용

		if (r == 0 || n == r) {
			return 1;
		}
		if (cache[n][r] != -1) {
			return cache[n][r];
		}
		count2++;
		return cache[n][r] = binoCache(n - 1, r - 1) + binoCache(n - 1, r);
	}

}
