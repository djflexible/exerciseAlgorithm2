package A_20160905;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class RemoveDuplicateLetters_re {
//https://leetcode.com/problems/remove-duplicate-letters/
	public static void main(String[] args) {

		String s = "cbacdcbc";
		
		System.out.println(removeDuplicateLetters(s));
	}

	static String removeDuplicateLetters(String s) {

		String[] strArray = s.split("");
		char[] charArray = s.toCharArray();
		
		for(int i=0 ; i<charArray.length ; i++){
		if (charArray[i] != ' ' && (charArray[i] < 'a' || charArray[i] > 'z'))
			throw new IllegalArgumentException(
					"only lowercase characters['a'-'z']");
		}
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

		for (int i = 0; i < charArray.length; i++) {
			map.put(strArray[i], i);
		}

		Iterator<String> iterator = map.keySet().iterator();
		ArrayList<String> dup = new ArrayList<>();

		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			dup.add(key);
		}

		Collections.sort(dup, new Comparator<String>() {
			public int compare(String obj1, String obj2) {
				return obj1.compareTo(obj2);
			}
		});

		String[] strArray2 = dup.toString().split(", ");
		String str = "";
		str = dup.toString().substring(1, str.length());
		
		return str;

	}

}
