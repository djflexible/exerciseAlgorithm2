package A_20160926;

public class Permutation {

	public static void main(String[] args) {
//iterate, recursion으로 풀어보기 
		
		String str = "abc";
		permPrint(str);

	}

	static void permPrint(String str) {

		String strNums[] = str.split(""); // 0,1,2

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < strNums.length; j++) {
				System.out.print(strNums[j]);
			}
			//인덱스가 빠뀌어야 함
			
			System.out.print(", ");
		}
	}
	
	
	static void perm(String str) {

	}


}
