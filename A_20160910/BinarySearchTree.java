package A_20160910;

class TreeNode {
	int data; // Object로 선언할 경우 비교 불가능

	TreeNode left;
	TreeNode right;
}

public class BinarySearchTree {
	private TreeNode root = new TreeNode();
	static int cnt = 0;

	public TreeNode insertKey(TreeNode root, int input) {
		cnt++;
		TreeNode p = root; // 참조변수

		TreeNode newNode = new TreeNode();
		newNode.data = input;
		newNode.right = null;
		newNode.left = null;

		if (p == null) {
			return newNode;

		} else if (newNode.data < p.data) {
			p.left = insertKey(p.left, input);
			return p;

		} else if (newNode.data > p.data) {
			p.right = insertKey(p.right, input);
			return p;
		}

		else
			return p;

	}

	public void insertBST(int input) {
		root = insertKey(root, input);
	}

	public TreeNode searchBST(int input) {
		TreeNode p = root;
		while (p != null) {
			if (input < p.data)
				p = p.left;

			else if (input > p.data)
				p = p.right;
			else
				return p;
		}
		return p;
	}

	public void inorder(TreeNode root) { // 중위 순회로 탐색함

		if (root != null) {
			inorder(root.left);
			System.out.printf(" %d", root.data);
			inorder(root.right);
		}

	}

	public void printBST() {
		inorder(root);
		System.out.println(" 출력");

	}

}