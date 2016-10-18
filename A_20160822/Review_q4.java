package A_20160822;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Review_q4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String str = input.nextLine();
		String strArry[] = str.split("");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		int len = 0;

		for (int i = 0; i < strArry.length; i++) {
			map.put(strArry[i], i);
		}
		if (map.isEmpty() == true) {
			len = 0;
		}

		else {
			Iterator<String> iterator = map.keySet().iterator();

			StringBuffer br = new StringBuffer();
			while (iterator.hasNext()) {
				String key = (String) iterator.next();
				br.append(key);
			}
			System.out.println(br);
			len = br.length();
	
			if (map.get(strArry[0]) == 0) {
				len = len - 1;
			}

		}

		System.out.print(len);

		input.close();
	}
}
