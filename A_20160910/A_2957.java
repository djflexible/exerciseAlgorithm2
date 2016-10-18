package A_20160910;

import java.util.Scanner;

public class A_2957 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		int nums[] = new int[T];

		for (int i = 0; i < T; i++) {
			nums[i] = input.nextInt();
		}

		input.close();

	}

	static void bst(int number, Node N) {

	}
}

class Node {
	int value;
	Node left;
	Node right;
}

// class Tree {
//
// public Node root;
//
// public void addNode(int value) {
//
// if (root == null) {
//
// Node node = new Node();
//
// node.setValue(value);
//
// root = node; // root에 값이 없으면, root에 값을 넣는다.
//
// } else {
//
// // root가 존재할 경우, root 변경하기 위한 메소드 호출
//
// addNode(value, root);
//
// }
//
// }
//
// public void addNode(int value, Node root) {
//
// if (value <= root.getValue()) {
//
// if (root.getLeft() == null) {
//
// Node node = new Node();
//
// node.setValue(value);
//
// root.setLeft(node);
//
// } else {
//
// addNode(value, root.getLeft());
//
// }
//
// } else {
//
// if (root.getRight() == null) {
//
// Node node = new Node();
//
// node.setValue(value);
//
// root.setRight(node);
//
// } else {
//
// addNode(value, root.getRight());
//
// }
//
// }
//
// }
//
// }
