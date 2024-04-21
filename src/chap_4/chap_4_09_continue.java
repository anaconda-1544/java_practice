package chap_4;

public class chap_4_09_continue {
	public static void main(String[] asdf) {
		int max = 20;
		int sold = 0;
		int noshow = 17; //17번이 노쇼
		
		for (int i=1; i<=50; i++) {
			System.out.println(i+"번 나왔다.");
			
			if(i== noshow) {
				System.out.println(i+"번이 노쇼라 제외됩니다.");
			continue;
			}
			
			sold++;
			
			if(sold==max) {
				System.out.println("판매완료!");
				break;
				}

		}
	}
}
