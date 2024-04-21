package chap_5;

public class chap_5_2_multiArray { //다차원 배열
	//영화관
	public static void main(String[] asdf) {
		
		String[] seatA = {"A1", "A2", "A3", "A4"};
		String[] seatB = {"B1", "B2", "B3", "B4"};		
		String[] seatC = {"C1", "C2", "C3", "C4"};
		
		String[][] seats = new String[][] {
			{"A1", "A2", "A3", "A4"},
			{"B1", "B2", "B3", "B4"},
			{"C1", "C2", "C3", "C4"}
		};
		System.out.println(seats[1][2]);
		
		
	}
}
