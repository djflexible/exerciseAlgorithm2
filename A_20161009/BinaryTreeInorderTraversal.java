package A_20161009;

import java.util.ArrayList;

//https://leetcode.com/problems/binary-tree-inorder-traversal/
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class BinaryTreeInorderTraversal {
	public static void main(String[] args) {

	}

	public ArrayList<Integer> inorderTraversal(TreeNode root) {
		ArrayList<Integer> res = new ArrayList<>();
		inorderTraver(root, res);
		return res;
	}

	public void inorderTraver(TreeNode root, ArrayList<Integer> res) {
		if (root == null)
			return;

		inorderTraver(root.left, res);
		res.add(root.val);
		inorderTraver(root.right, res);
	}

}
