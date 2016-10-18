package A_20160909;

import java.util.Scanner;

public class BinarySearchTree_Test {

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();

		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		for (int i = 0; i < T; i++) {
			bst.insertBST(input.nextInt());

		}
		bst.printBST();
		TreeNode p1 = bst.searchBST(4);

		if (p1 != null) {
			System.out.println("탐색 성공 : " + p1.data);

		} else {
			System.out.println("탐색 실패 데이터가 존재하지 않음");

		}

		System.out.println("count값 : " + bst.countPrint());
		input.close();

	}

}
