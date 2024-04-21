package chap_5;

public class chap_5_3_multiArrayLoop {
	public static void main(String[] asdf) {
		
	//	String[][] seats1 = new String[][];
		String[][] seats = new String[][] {
			{"A1", "A2", "A3", "A4"},
			{"B1", "B2", "B3", "B4"},
			{"C1", "C2", "C3", "C4"}
		};
		
		for (int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(seats[i][j]+" ");

			}
			System.out.println();

		}
				
		
		seats = new String[][] {
			{"A1", "A2", "A3"},
			{"B1", "B2", "B3", "B4"},
			{"C1", "C2", "C3", "C4", "C5"}
		};
		
		for(int i=0; i < seats.length; i++) {
			for(int j=0; j<seats[i].length; j++) {
			System.out.print(seats[i][j]+" ");
			}
			System.out.println();

		}
			
		String[][] seats3 = new String[26][15];
		String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

		for(int i = 0; i<seats3.length; i++)
			for(int j = 0; j < seats3[i].length; j++)
				seats3[i][j] = eng[i] + (j+1);
		
		//표 구매
		seats3[7][9] = "__";
		seats3[7][10] = "__";
		
		for(int i=0; i < seats3.length; i++) {
			for(int j=0; j<seats3[i].length; j++) {
			System.out.print(seats3[i][j]+" ");
			}
			System.out.println();

		}
	}
}
