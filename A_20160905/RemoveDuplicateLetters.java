package A_20160905;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class RemoveDuplicateLetters {
//https://leetcode.com/problems/remove-duplicate-letters/
	public static void main(String[] args) {

		String s = "cbacdcbc";
		System.out.print(removeDuplicateLetters(s));
	}

	static String removeDuplicateLetters(String s) {

		char[] charArray = s.toCharArray();
		
		for(int i=0 ; i<charArray.length ; i++){
		if (charArray[i] != ' ' && (charArray[i] < 'a' || charArray[i] > 'z'))
			throw new IllegalArgumentException(
					"only lowercase characters['a'-'z']");
		}
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < charArray.length; i++) {
			map.put(charArray[i], i);
		}

		Iterator<Character> iterator = map.keySet().iterator();
		ArrayList<Character> dup = new ArrayList<>();

		while (iterator.hasNext()) {
			char key = (char) iterator.next();
			dup.add(key);
		}

		Collections.sort(dup, new Comparator<Character>() {
			public int compare(Character obj1, Character obj2) {
				return obj1.compareTo(obj2);
			}
		});

		
		StringBuilder builder = new StringBuilder(dup.size());
	    for(Character ch: dup)
	    {
	        builder.append(ch);
	    }
	    return builder.toString();

	

	}

}
