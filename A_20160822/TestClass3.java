package A_20160822;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//magic number 
//N까지의 소수를 먼저 구한 후, L부터 R까지의 원소중 N의 원소로 나누어 지는 수가 몇개 인가
//1 : 소수를 먼저 구한 후
//2 : 나누어 떨어지는지 구한 후 
//3: 그 개수를 셈
public class TestClass3 {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		int tCase = input.nextInt(); // 테스트 케이스
		int fNum[] = new int[tCase]; // 범위 안의 매직 넘버 개수
		int count = 0; // 소수를 구하기 위한 변수
		long range2 = 0L;// long형은 약 9백경 즉 19자리 까지 가능, int는 약 21억 즉 10자리
		long range1 = 1;

		for (int k = 0; k < tCase; k++) {
			int N = input.nextInt(); // 소수 구하기
			long L = input.nextLong(); // 범위
			long R = input.nextLong(); // 범위
/*
			if (((tCase < 1) || (tCase > 11)) || ((N <= 1) || (N > 50))
					|| ((L < range1) || (L > range2)) || ((R < range1) || (R > range2))
					|| (L <= R)	) {
				System.out.println("주어진 범위를 초과함");	//문자열이 제약 사항
				return;
			}
*/
			ArrayList<Integer> prime = new ArrayList<Integer>();
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
			// 여기까지 소수를 구했음
			ArrayList<Long> magic = new ArrayList<Long>();// 매직 넘버
																		// 저장
			for (long i = L; i <= R; i++) {
				for (int j = 0; j < prime.size(); j++) { // 각 원소를 소수의 개수만큼 나눠줌
					if ((i % prime.get(j)) == 0) {
						magic.add(i);
						break; // 한 번 나누어 졌으니 더이상 나눌 필요가 없음
					}
				}
			}
			fNum[k] = magic.size();
		}

		for (int i = 0; i < tCase; i++) {
			System.out.println(fNum[i]);
		}
		input.close();
	}
}
