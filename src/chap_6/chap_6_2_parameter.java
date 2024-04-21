package chap_6;

public class chap_6_2_parameter {

	public static void power(int num) {
		int result = num * num;
		System.out.println(num + "의 제곱승은 " + result + "입니다!");
		
		
	}
	
	
	public static void powerByExp(int num, int exp) {
		int result = 1;
		for (int i=0; i < exp; i++) {
			result *= num;
		}
		System.out.println(num + "의 " + exp + "승은 " + result + "입니다!");
	}
	
	public static void main(String[] asdf) {

		power(2);
		power(3);
		power(4);
		powerByExp(2, 12);
	}
	
}
