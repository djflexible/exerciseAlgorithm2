package A_20160828;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2503
//http://egloos.zum.com/ysh1991/v/5962399	참고함
//완벽히 이해하지 않음
public class A_2503 {

	static int N;// 질문 수
	static int Answer; // 가능한 답의 개수
	static int[] number;// 질문한 개별 숫자
	static int[] strike;// 자릿수, 숫자 일치
	static int[] ball;// 숫자만 일치

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		number = new int[N];
		strike = new int[N];
		ball = new int[N];
		Answer = 0;
		for (int i = 0; i < N; i++) {
			number[i] = sc.nextInt();
			strike[i] = sc.nextInt();
			ball[i] = sc.nextInt();
		} // test case 입력

		int[] tmp = new int[10];	//tmp가 왜 10 사이즈?
		makeNumber(0, tmp);
		System.out.println(Answer);
		sc.close();

	}

	static boolean checkNumber(int num) {
		int[] digit = new int[3]; // input test-case
		int[] digit2 = new int[3]; // compare test-case

		digit[0] = num / 100; // 100자리
		digit[1] = num / 10 % 10;// 10자리
		digit[2] = num % 10;// 1자리

		for (int i = 0; i < N; i++) {
			digit2[0] = number[i] / 100;
			digit2[1] = number[i] / 10 % 10;
			digit2[2] = number[i] % 10;

			int s = 0; // count strike
			int b = 0; // count ball

			for (int j = 0; j < 3; j++) {	
				for (int k = 0; k < 3; k++) {
					if (j == k && digit[j] == digit2[k])	//strike case
						s += 1;
					if (j != k && digit[j] == digit2[k])	//ball case
						b += 1;
				}
			}

			if (s != strike[i] || b != ball[i])	// 	?? 이해 안됨
				return false;
		}
		return true;
	}

	static void makeNumber(int num, int[] arr) {
		// 3자리수를 만듬
		if (num > 100) { // num은 0부터 시작, arr 크기는 10
			if (checkNumber(num))
				Answer++;
			return;
		}

		for (int i = 1; i <= 9; i++) {//이해 안됨, 100미만일 때?
			if (arr[i] == 0) {
				arr[i] = 1;
				makeNumber(num * 10 + i, arr);
				arr[i] = 0;
			}
		}
	}

}
