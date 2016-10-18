package A_20160822;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class TestClass2 {
	// balanced number 구하기
	// 출력값 : yes or no
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
		String input = scanner.nextLine();

		for (char c : input.toCharArray()) { // 입력 받은 String형 문자열 input 을 char형
												// 문자로 변환하여 배열에 저장
			if (c < 'a' || c > 'z') {
				scanner.close();
				throw new IllegalArgumentException( // 입력 값이 알파벳 소문자가 아닐 경우
						"only lowercase characters['a'-'b']");
			}
			if (countMap.containsKey(c)) { // countMap에 'c'라는 키값이 존재하면
				countMap.put(c, countMap.get(c) + 1); // value 값을 1개씩 더함
			} else { // 'c'가 존재하지 않으면 value 값을 1로 하여 추가
				countMap.put(c, 1);
			}
		} // for 종료

		boolean check = false;
		for (char key : countMap.keySet()) {// key 값을 반환
			int count = countMap.get(key); // 해당 key값의 value를 count로 설정
			if ((count % 2) != 0) { // count가 홀수 이면
				check = true; // check가 true로 바뀜
				break; // 바뀌면 뒤에 것을 확인할 필요 없이 바로 나감
			}
		} // for 종료

		if (check == true) { // check가 true, 즉 홀수로 바뀌었으니 NO
			System.out.println("No");

		} else {
			System.out.println("Yes");
		}
		scanner.close();
	}

}
