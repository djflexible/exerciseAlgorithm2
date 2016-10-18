package A_20160822;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass4 {
	// 중복되는 문자열 제거후 출력
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> charList = new ArrayList<String>();
		String input = "abcabcbb";
		String inputArry[] = input.split("");
		int check = 0;

		for (int i = 0; i < inputArry.length; i++) { // 캐릭터 형으로 변환된 문자열 배열
														// input의 원소를,
														// 중복을 제거하여 charList에 추가

			if (charList.contains(inputArry[i])) {
				continue;
			} // c는 input의 원소, 존재하면 저장하지 않고 continue
			charList.add(inputArry[i]); // 없다면 저장
			System.out.print(inputArry[i]);
		}
		System.out.println();
		System.out.println(charList.size());

		String str = charList.toString();
		System.out.println(str);

		str = str.substring(1, str.length() - 1);
		str = str.replace(", ", "");
		// str = str.substring(1, str.length());
		System.out.println(str);

	}
}
