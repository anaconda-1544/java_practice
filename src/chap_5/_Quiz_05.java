package chap_5;

public class _Quiz_05 {
	public static void main(String[] asdf) {
	
	//String[] sizes = new String[] 	{"250", "255", "260", "265", "270", "275"};
		String[] sizes = new String[10];
		for(int i = 0; i < sizes.length; i++)
		//	sizes[i] = sizes[i] + (i * 5 + 250);   이렇게 하면 null이 같이 출력되는 오류 발생
			sizes[i] = String.valueOf(i*5+250);
		
		
	for(int i = 0; i<sizes.length; i++){

		System.out.println(sizes[i] +"재고 있음");
		
		
	}

			
	
	
	
	}
}
