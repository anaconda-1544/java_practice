package chap_4;

public class chap_4_2 { //else
	public static void main(String[] args) {
		
		//조건문 if
		int hour = 19;
		
		if(hour < 18) {
			System.out.println("도서관 가서 공부해야겠다");
		} else {
			System.out.println("집가서 자야겠다.. numpy곤해..");
		}
		
		System.out.println("내ㅏㄱ 오늘 이걸 한다고!!");

		
		hour = 20;
		
		//numpy = 파이썬 아님!	
		boolean numpy = true;
		if(hour > 18 && numpy == true) {
			System.out.println("얼른 집가서 씻고 자야겠다");
		}
		else
			System.out.println("어림도 없지, 그냥 시험공부 해야지~!");
		
	}
	
	
}
