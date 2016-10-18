package A_20160822;

import java.util.ArrayList;

public class IsomorphicStrings {

	public static void main(String[] args) {
		// https://leetcode.com/problems/isomorphic-strings/
		// egg, add foo, bar paper, title
		// 같은 것이 등장할때
		String s = "foo";
		String t = "oop";

		String sArray[] = s.split("");
		String tArray[] = t.split("");

		ArrayList<Integer> sArray1 = new ArrayList<>();
		ArrayList<Integer> tArray1 = new ArrayList<>();

		for (int i = 0; i < sArray.length; i++) {
			for (int j = i + 1; j < sArray.length; j++) {
				if (sArray[i].equals(sArray[i])) {
					sArray1.add(i);
					sArray1.add(j);
				}
			}
		}

		for (int i = 0; i < tArray.length; i++) {
			for (int j = i + 1; j < tArray.length; j++) {
				if (tArray[i].equals(tArray[i])) {
					tArray1.add(i);
					tArray1.add(j);
				}
			}
		}

		for (int i = 0; i < sArray1.size(); i++) {
			System.out.print(sArray1.get(i));
		}

		System.out.println();

		for (int i = 0; i < tArray1.size(); i++) {
			System.out.print(tArray1.get(i));
		}

	}

}
