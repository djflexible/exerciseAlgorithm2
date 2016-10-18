package A_20161018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine();
			if (input.length() < 1 || input.length() > 100) {
				System.out.println("1 <= length of string <= 100"); // 문자열이
																	// 100자리가
																	// 넘어갈 경우
				return;
			}
			// 스택에 쌓기
			Stack<Character> stack = new Stack<Character>(); // 괄호의 종류에 따라 스택을
																// 만들었어야 함
			for (char c : input.toCharArray()) {
				switch (c) { // '('와 같이 left인 것만 push
				case '(':
					stack.push('(');
					break;
				case ')':
					if ('(' == stack.peek()) { // top에 '('이 없을때 예외처리로 가 끝내야함
						stack.pop();
					}
					break;
				case '{':
					stack.push('{');
					break;
				case '}':
					if ('{' == stack.peek()) {
						stack.pop();
					}
					break;
				case '[':
					stack.push('[');
					break;
				case ']':
					if ('[' == stack.peek()) {
						stack.pop();
					}
					break;
				}
			}
			if (stack.isEmpty()) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
				// ((){)}에서 No가 나옴 -> 스택을 3개 만들어서 처리
			}
		}

		catch (Exception e) {// 이 부분 빼먹음
			System.out.println("NoNo");
		}

		finally {
			if (br != null) {
				br.close();
			}
		}
	}
}
