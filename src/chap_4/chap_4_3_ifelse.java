package chap_4;

public class chap_4_3_ifelse {
	public static void main(String[] numpy) {
		System.out.println("오늘은 좀 쉴까?");

		//조건문 if else
		boolean Ap = true; //A+가 있다
		boolean F = false; //F가 있는경우
		boolean S = true; //전과목이 A+임!
		
		if(F == true)
			System.out.println("어딜 F가 있는 놈이 쉬려 가는거야?");
		
		else if(Ap||S)
			System.out.println("넌 장학생이니 쉬어야지!");
		
		if (S)
			System.out.println("넌 전과목 A+이니 당연하지!");

		
	}
		
		
}
