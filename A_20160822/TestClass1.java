package A_20160822;
import java.util.Scanner;

public class TestClass1 {
	// 테스트 케이스를 입력 받고, 그 원소들의 제곱수를 구하는 문제
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int Tarry[] = new int[T];

		for (int i = 0; i < T; i++) {
			Tarry[i] = scanner.nextInt();
			Tarry[i] = Tarry[i] * Tarry[i];
		}
		for (int j = 0; j < T; j++) {
			System.out.println(Tarry[j]);
		}
		scanner.close();

	}

}
