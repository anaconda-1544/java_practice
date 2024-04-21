package chap_5;

public class chap_5_1_array {
	public static void main(String[] asdf) {
		//배열: 같은 자료형의 값을 여러 개를 연속된 것으로 저장
		
		String[] coffee = new String[] 	{"나", "너", "우리", "그거"};
		
		for(int i=0; i<coffee.length; i++) {
		System.out.println(coffee[i]);
		}
		System.out.println("--------------------------");

		for (String coffees : coffee ) { //for each 반복문
			System.out.println(coffees + "   이거");
		}
	}
}
