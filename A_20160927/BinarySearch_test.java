package A_20160927;

public class BinarySearch_test {

	public static void main(String[] args) {

		BinarySearch bs = new BinarySearch();
		bs.addNode(5);
		bs.addNode(2);
		bs.addNode(12);
		bs.addNode(7);
		
		bs.printBST();
		System.out.println();
		bs.printBT();
		
	}

}
