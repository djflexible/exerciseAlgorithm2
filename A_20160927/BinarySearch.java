package A_20160927;

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
}

public class BinarySearch {

	TreeNode TN = new TreeNode();
	private TreeNode root = new TreeNode();

	public TreeNode insertKey(TreeNode root, int input) {

		TreeNode p = root; // 참조 변수
		TreeNode newNode = new TreeNode();
		newNode.data = input;
		newNode.left = null;
		newNode.right = null;

		if (p == null) {
			return newNode;
		} else if (newNode.data < p.data) {
			p.left = insertKey(p.left, input);
			return p;
		} else if (newNode.data > p.data) {
			p.right = insertKey(p.right, input);
			return p;
		} else
			return p; // 값이 같을 경우
	}

	public void addNode(int input) {
		root = insertKey(root, input);
	}

	public void inorder(TreeNode root) { // 중위 순회, 오름차순 정렬
		if (root != null) {
			inorder(root.left);
			System.out.printf(" %d", root.data);
			inorder(root.right);
		}
	}

	public void printBST() {
		inorder(root);
	}

	TreeNode tn = new TreeNode();
	
	public void printBT() {
		// System.out.println(tn.data + ", " + tn.left + ", " + tn.right);
	}

}
