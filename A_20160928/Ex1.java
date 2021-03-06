package A_20160928;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex1 {

	public static void main(String[] args) {

		String str = "Cow beef cow chicken cow chicken cow. Checking chicken car dogs. Like dog see chicken.";
		String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s\n]";
		int count = 0;

		str = str.toLowerCase();
		str = str.replaceAll(match, "");

		HashMap<String, Integer> output = new HashMap<String, Integer>();
		ValueComparator bvc = new ValueComparator(output);
		TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>(bvc);

		String strArry[] = new String(str).split(" ");

		for (int i = 0; i < strArry.length; i++) {
			for (int j = 0; j < strArry.length; j++) {
				if (strArry[i].equals(strArry[j]) == true) {
					count++;
					output.put(strArry[i], count);
				} else {
					output.put(strArry[i], count);
				}
			}
			count = 0;
		}

		sorted_map.putAll(output);

		for (int i = 0; i < strArry.length; i++) {
			if (output.containsKey(strArry[i])) {
				System.out.println(strArry[i] + " : " + output.get(strArry[i]));
			}
		}

		for (int i = 0; i < strArry.length; i++) {
			if(strArry[i] == strArry[i+1]){
			System.out.println(strArry[i]);
			}
		}

		// for (Map.Entry<String, Integer> entry : sorted_map.entrySet()) {
		// System.out.println(entry.getKey() + " : " +
		// output.get(entry.getKey()));
		// }
	}
}

class ValueComparator implements Comparator<String> {

	Map<String, Integer> base;

	public ValueComparator(Map<String, Integer> base) {
		this.base = base;
	}

	public int compare(String a, String b) {
		if (base.get(a) >= base.get(b)) {
			return -1;
		} else {
			return 1;
		}
	}
}
