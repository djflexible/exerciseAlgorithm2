package A_20160822;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WordPattern {

	public static void main(String[] args) {
		// https://leetcode.com/problems/word-pattern/

		String pattern = "abba";
		String str = "dog cat cat fish";

		Solution sol = new Solution();
		System.out.println(sol.wordPattern(pattern, str));

	}

}

class Solution {
	public boolean wordPattern(String pattern, String str) {

		HashMap<Character, String> map = new HashMap<>();
		String[] strs = str.split("\\s+");

		if (pattern.length() != strs.length)
			return false;

		Set<String> values = new HashSet<>();

		for (int i = 0; i < pattern.length(); i++) {
			char key = pattern.charAt(i);
			String value = strs[i];
			if (map.containsKey(key)) {
				if (!map.get(key).equals(value)) {
					return false;
				}
			} else {
				if (values.contains(value)) {
					return false;
				}
				map.put(key, value);
				values.add(value);
			}
		}
		return true;

	}
}
