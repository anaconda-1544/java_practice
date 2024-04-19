package chap_2;

//연산자
public class chap_2_1 {
	public static void main(String[] arga) {
		System.out.println(5 > 3);
		System.out.println(5 >= 3);
		System.out.println(5 < 3);

		
		boolean 김밥 = true;
		boolean 김치찌개 = true;
		boolean 김치볶음밥 = true;
		boolean 민초김밥김치찌개볶음밥 = false;
		boolean 나는민초를좋아한다 = false;

		
		System.out.println(김밥 || 김치찌개); //or
		System.out.println(김밥 && 김치찌개 && 김치볶음밥 ); //and
		System.out.println(!나는민초를좋아한다);
		
		System.out.println((나는민초를좋아한다)?"그는민초를정말좋아해":"그는민초를끔직하게싫어해");
		System.out.println(!(나는민초를좋아한다)?"그는민초를정말좋아해":"그는민초를끔직하게싫어해");
		
		
		
		
	}
	
	
	
	
}
	
