package A_20160829;

import java.util.LinkedHashMap;

public class FindtheDifference {

	public static void main(String[] args) {

		String s = "abcd";
		String t = "abcde";

		System.out.println(findTheDifference(s, t));

	}

	static public String findTheDifference(String s, String t) {
		String str = "d";
		String sArry[] = s.split("");
		String tArry[] = t.split("");

		LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
		LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>();
		for (int i = 0; i < sArry.length; i++) {
			map1.put(i, sArry[i]);
		}

		for (int i = 0; i < tArry.length; i++) {
			map2.put(i, tArry[i]);
		}

		for (int i = 0; i < sArry.length; i++) {

		}

		return str;
	}
}
