package chap_2;

public class _Quizz_02 {
	//키가 120cm인 놀이기구 제한
	
	public static void main(String[] areg) {
		int high = 121;
		int limit =120;
		
		
		//boolean(limit <= high);
		System.out.println((high>=limit)? high + "로 탑승 가능!" :high +  "로 탑승 불가능!!" );
		high = 100;
		System.out.println((high>=limit)? high + "로 탑승 가능!" :high +  "로 탑승 불가능!!" );
	}
	
} 
