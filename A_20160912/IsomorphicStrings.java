package A_20160912;

import java.util.HashMap;

public class IsomorphicStrings {
	// https://leetcode.com/problems/isomorphic-strings/
	// 못품
	public static void main(String[] args) {
		String str1 = "paper";
		String str2 = "title";
		System.out.println(isIsomorphic(str1, str2));
	}

	static boolean isIsomorphic(String s, String t) {

		if (s.length() != t.length())
			return false;

		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		char sArry[] = s.toCharArray();
		char tArry[] = t.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			if (map1.containsKey(sArry[i]))
				map1.put(sArry[i], map1.get(sArry[i]) + 1);
			else
				map1.put(sArry[i], 1);
		}

		System.out.println(map1.values());

		return true;
	}
}
