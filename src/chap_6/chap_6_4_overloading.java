package chap_6;

public class chap_6_4_overloading {
	
	public static int getPower(int number) {
		int result = number * number;
		return result;
	}
	
	public static int getPower(String strNum) {
		int number = Integer.parseInt(strNum);
		return number*number;
				
	}
	
	public static int getPowerExp(int number, int exp) {
		int result = 1;
		for (int  i = 0;  i<exp; i++) {
			result *= number;
		}
		return result;
	}
	
	public static void main(String[] asdf) {
		System.out.println(getPower(3));
		System.out.println(getPower("4"));
		
		
		
	}
	
}
