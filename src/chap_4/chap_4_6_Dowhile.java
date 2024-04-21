package chap_4;

public class chap_4_6_Dowhile {
	public static void main(String[] asdf) {
	
		int ans = 0;
		int dist = 25;
		while(ans < dist) {
			System.out.println("발차기를 합니다.");
			System.out.println("지금 이동 거리: " + ans);
			ans += 3;
		}
		System.out.println("도착!");
		
		ans = 0;
		int high = 25;
		while(ans + high < dist) {
			System.out.println("발차기를 합니다.");
			System.out.println("지금 이동 거리: " + ans+high);
			ans += 3;
		}
		System.out.println("도착!");
		
		
	do {
		
		System.out.println("발차기를 합니다.");
		System.out.println("지금 이동 거리: " + ans+high);
		ans += 3;
		
	
	}while(ans + high < dist);
	
	
	}
	
	
}
