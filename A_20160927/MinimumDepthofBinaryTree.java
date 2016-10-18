package A_20160927;

import java.util.Scanner;

class TreeNode2 {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode2(int x) {
		val = x;
	}
}

public class MinimumDepthofBinaryTree {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int nums[] = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = input.nextInt();
		}

		input.close();

	}

	static int minDepth(TreeNode root) {

		return 0;
	}
}
