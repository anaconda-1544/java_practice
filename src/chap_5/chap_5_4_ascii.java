package chap_5;

public class chap_5_4_ascii {
	public static void main(String[] asdf) {
	
		String[][] seats3 = new String[26][15];
		char ch = 'A';
		
		for(int i = 0; i<seats3.length; i++) {
			for(int j = 0; j < seats3[i].length; j++) 
				seats3[i][j] = String.valueOf(ch) + (j+1); //아스키 코드로 간편하게 하기!!
		
		ch++;
		}
	
		for(int i=0; i < seats3.length; i++) {
			for(int j=0; j<seats3[i].length; j++) {
			System.out.print(seats3[i][j]+" ");
			}
			System.out.println();

		}
	
	
	
	
	}
}
