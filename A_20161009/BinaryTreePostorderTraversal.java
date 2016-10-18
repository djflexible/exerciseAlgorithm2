package A_20161009;

import java.util.ArrayList;

class TreeNode3 {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode3(int x) {
		val = x;
	}
}

public class BinaryTreePostorderTraversal {

	public static void main(String[] args) {

	}

	public ArrayList<Integer> postorderTraversal(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<>();
		postorderTraver(root, res);
		return res;
	}

	public void postorderTraver(TreeNode root, ArrayList<Integer> res) {
		if (root == null)
			return;

		postorderTraver(root.left, res);
		postorderTraver(root.right, res);
		res.add(root.val);
	}

}
