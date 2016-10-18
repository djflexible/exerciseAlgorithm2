package A_20160912;

import java.util.ArrayList;

public class CompareVersionNumbers {
	// https://leetcode.com/problems/compare-version-numbers/
	public static void main(String[] args) {
		String version1 = "1.000.00.0.0000";
		String version2 = "1.00000.00.";
		System.out.println(compareVersion(version1, version2));

	}

	static int compareVersion(String version1, String version2) {

		String[] ver1 = version1.split("\\.");
		String[] ver2 = version2.split("\\.");
		ArrayList<Integer> check = new ArrayList<>();
		int size = 0;

		if (ver1.length < ver2.length) {
			size = ver1.length;
		} else {
			size = ver2.length;
		}

		for (int i = 0; i < size; i++) {
			int k1 = Integer.parseInt(ver1[i]);
			int k2 = Integer.parseInt(ver2[i]);

			if (k1 > k2)
				check.add(1);

			if (k1 < k2)
				check.add(-1);

			if (k1 == k2) {
				check.add(0);
				if (k1 > k2)
					check.add(1);
				if (k1 < k2)
					check.add(-1);
			}

		}

		for (int i = 0; i < check.size(); i++) {
			System.out.print(check.get(i) + ", ");
		}
		System.out.println();

		for (int i = 0; i < check.size(); i++) {
			if (check.get(i) != 0)
				return check.get(i);

			if ((check.get(check.size() - 1) == 0) && (ver1.length > ver2.length)) {

				int k = Integer.parseInt(ver1[ver1.length - 1]);
				if (k == 0) {
					return 0;
				} else {
					return 1;
				}
			}

			if ((check.get(check.size() - 1) == 0) && (ver1.length < ver2.length)) {
				int k = Integer.parseInt(ver2[ver2.length - 1]);
				if (k == 0)
					return 0;
				else
					return -1;
			}

		}

		return 0;

	}
}
