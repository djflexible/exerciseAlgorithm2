package A_20160905;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Review_q5 {

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
			Stack<Character> stack1 = new Stack<Character>();
			Stack<Character> stack2 = new Stack<Character>();
			Stack<Character> stack3 = new Stack<Character>();

			for (char c : input.toCharArray()) {
				switch (c) { // '('와 같이 left인 것만 push
				case '(':
					stack1.push('(');
					break;
				case ')':
					if ('(' == stack1.peek()) { // top에 '('이 없을때 예외처리로 가 끝내야함
						stack1.pop();
					}
					break;
				case '{':
					stack2.push('{');
					break;
				case '}':
					if ('{' == stack2.peek()) {
						stack2.pop();
					}
					break;
				case '[':
					stack3.push('[');
					break;
				case ']':
					if ('[' == stack3.peek()) {
						stack3.pop();
					}
					break;
				}
			}

			if ((stack1.isEmpty()) && (stack2.isEmpty()) && (stack3.isEmpty())) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
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
