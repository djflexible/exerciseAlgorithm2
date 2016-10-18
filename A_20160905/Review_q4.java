package A_20160905;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Review_q4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String str = input.nextLine();
		String strArry[] = str.split("");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

		for (int i = 0; i < strArry.length; i++) {
			map.put(strArry[i], i);
		}
		for (int i = 0; i < map.size(); i++) {
			System.out.println(map.get(strArry[i]));
		}

		Iterator<String> iterator = map.keySet().iterator();
		ArrayList<String> dup = new ArrayList<>();

		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			dup.add(key);
			System.out.print(key);
		}
		System.out.println();

		Collections.sort(dup, new Comparator<String>() {

			public int compare(String obj1, String obj2)

			{
				return obj1.compareToIgnoreCase(obj2);
			}
		});

		for (int i = 0; i < dup.size(); i++) {
			System.out.print(dup.get(i));
		}

		input.close();
	}
}
