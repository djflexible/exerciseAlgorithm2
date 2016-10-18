package A_20160905;

import java.util.ArrayList;
import java.util.Scanner;

//magic number 개념
public class Review_q3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int tCase = input.nextInt();	//테스트 케이스
		int fNum[] = new int[tCase];	//범위 안의 매직 넘버 개수
		int count = 0;	//소수를 구하기 위한 변수

		for (int k = 0; k < tCase; k++) {
			int N = input.nextInt(); // 소수 구하기
			int L = input.nextInt(); // 범위
			int R = input.nextInt();

			ArrayList<Integer> prime = new ArrayList<Integer>(); // 소수 저장 배열
			// 소수 구하기
			for (int i = 2; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (i % j == 0) {
						count++;
					}
				}
				if (count == 2) {
					prime.add(i);
				}
				count = 0;
			}

			ArrayList<Integer> result = new ArrayList<Integer>(); // 매직 넘버 저장 배열
			for (int i = L; i <= R; i++) {
				for (int j = 0; j < prime.size(); j++) {
					if ((i % prime.get(j)) == 0) {
						result.add(i);
						break;
					}
				}
			}
			fNum[k] = result.size();
		}
		
		for (int i = 0; i < tCase; i++) {
			System.out.println(fNum[i]);
		}
		input.close();
	}
}
