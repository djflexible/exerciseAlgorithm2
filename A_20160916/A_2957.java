package A_20160916;

//https://www.acmicpc.net/problem/2957
// red black tree
// 배열로 풀어보기

import java.util.Scanner;

public class A_2957 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();

		BinarySearchTree tree = new BinarySearchTree();

		for (int i = 0; i < T; i++) {

			int input = sc.nextInt();
			tree.insert(tree.getRoot(), input);
			System.out.println(tree.getCount());
		}

		sc.close();
	}
}

class BinarySearchTree {

	private BinarySearchNode root;
	private int count = 0;

	public BinarySearchNode getRoot() {
		return root;
	}

	public int getCount() {
		return count;
	}

	public void insert(BinarySearchNode node, int insertValue) {
		if (node == null) {
			root = new BinarySearchNode(insertValue, null, null);
			return;
		}
		count++;

		if (node.getValue() > insertValue) {
			if (node.getLeft() == null) {
				node.setLeft(new BinarySearchNode(insertValue, null, null));
			} else
				insert(node.getLeft(), insertValue);

		} else {

			if (node.getRight() == null) {
				node.setRight(new BinarySearchNode(insertValue, null, null));
			} else
				insert(node.getRight(), insertValue);
		}
	}

	public boolean search(BinarySearchNode node, int searchValue) {

		if (node.getValue() == searchValue) {
			return true;
		}

		if (node.getValue() > searchValue && node.getLeft() != null) {
			return search(node.getLeft(), searchValue);
		}
		return node.getRight() != null && search(node.getRight(), searchValue);
	}
}

class BinarySearchNode {

	private int value;
	private BinarySearchNode left;
	private BinarySearchNode right;

	public BinarySearchNode() {

	}

	public BinarySearchNode(int value, BinarySearchNode left, BinarySearchNode right) {

		this.value = value;
		this.left = left;
		this.right = right;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {

		this.value = value;
	}

	public BinarySearchNode getLeft() {

		return left;
	}

	public void setLeft(BinarySearchNode left) {

		this.left = left;
	}

	public BinarySearchNode getRight() {

		return right;
	}

	public void setRight(BinarySearchNode right) {

		this.right = right;
	}
}
