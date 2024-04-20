package chap_3;

public class _Quizz_03 {
	public static void main(String[] areg) {
		String id = "101010-3485933";
		
		System.out.println(id.substring(0, 8)); //101010-3 출력
		//or 
		System.out.println(id.substring(0, id.indexOf("-")+2)); //101010-3 출력
		
		
		
	}
}
