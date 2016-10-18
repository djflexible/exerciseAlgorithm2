package A_20161009;

import java.util.ArrayList;

//https://leetcode.com/problems/binary-tree-preorder-traversal/
class TreeNode2 {
	int val;
	TreeNode2 left;
	TreeNode2 right;

	TreeNode2(int x) {
		val = x;
	}
}

public class BinaryTreePreorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ArrayList<Integer> preorderTraversal(TreeNode2 root) {
		ArrayList<Integer> res = new ArrayList<>();
		preorderTraver(root, res);
		return res;
	}

	public void preorderTraver(TreeNode2 root, ArrayList<Integer> res) {
		if (root == null)
			return;

		res.add(root.val);
		preorderTraver(root.left, res);
		preorderTraver(root.right, res);
	}

}
