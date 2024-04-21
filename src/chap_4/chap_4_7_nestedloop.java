package chap_4;

public class chap_4_7_nestedloop {
	public static void main(String[] asdf) {
	//이중반복문
	
		//별 * 로 만들기
		/*
		 *****
		 *****
		 *****
		 *****
		 ***** 
		 이런 모양 */
		
		for(int i = 0; i<5; i++) {
			System.out.println("*****");
		}
		System.out.println("-------------------------------");

		for(int i = 0; i<5; i++) {
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.println();

		}
		System.out.println("-------------------------------");

		for(int i = 0; i< 5; i++) {
			for(int j = 0; j<i; j++) {
			System.out.print("*");
			}
			
			System.out.println();
			

		}
		System.out.println("-------------------------------");
		for(int i = 0; i< 5; i++) {
			for(int j = 0; j<4-i; j++) {
			System.out.print(" ");
			}
			for(int k = 0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
			

		}
	
	
	
	}
	
	
}
