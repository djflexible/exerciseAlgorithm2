package A_20160910;

public class BinarySearchTree_Test {

	public static void main(String[] args) {

		BinarySearchTree bst = new BinarySearchTree();
		bst.insertBST(3);
		bst.insertBST(5);
		bst.insertBST(1);
		bst.insertBST(6);
		bst.insertBST(899);
		bst.insertBST(7);
		bst.insertBST(2);
		bst.insertBST(4);
		

		System.out.println("이진 탐색 트리");
		System.out.print("이진 트리 :");
		bst.printBST();

		System.out.print("탐색 -> ");
		TreeNode p1 = bst.searchBST(899);

		if (p1 != null) {
			System.out.println("탐색 성공 : " + p1.data);

		} else {
			System.out.println("탐색 실패 데이터가 존재하지 않음");

		}
		System.out.println(BinarySearchTree.cnt);
	}

}
