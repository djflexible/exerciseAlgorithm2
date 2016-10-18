package A_20160822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class TestClass5 {
	// 예외 처리가 안되있었음 -> 닫힌 괄호가 먼저 나올 경우
	// 스택 1,2,3 -> ((){)}에서 No가 나옴 -> 스택을 3개 만들어서 처리

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String input = br.readLine();

			if (input.length() < 1 || input.length() > 100) {
				System.out.println("1 <= length of string <= 100"); // 문자열이 제약
																	// 사항
				return;
			}
			Stack<Character> stack1 = new Stack<Character>(); // 괄호의 종류에 따라 스택을
																// 만들었어야 함
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
					if ('{' == stack1.peek()) { // top에 '('이 없을때 예외처리로 가 끝내야함
						stack1.pop();
					}
					break;

				case '[':
					stack3.push('[');
					break;

				case ']':
					if ('[' == stack1.peek()) { // top에 '('이 없을때 예외처리로 가 끝내야함
						stack1.pop();
					}
					break;
				}
			}
			if ((stack1.isEmpty()) && (stack2.isEmpty()) && (stack3.isEmpty())) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} catch (Exception e) {// 이 부분 빼먹음, ), }, ]가 먼저 나올 경우
			System.out.println("NoNo");
		} finally {
			if (br != null) {
				br.close();
			}
		}
	}
}
