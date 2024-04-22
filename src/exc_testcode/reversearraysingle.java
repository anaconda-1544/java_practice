package exc_testcode;

public class reversearraysingle {
	static void reverse(int[] ar) {
		
		int i = 0, j = ar.length-1;
		
		while(i<j) {
			int t = ar[i];
			ar[i] = ar[j];
			ar[j] = t;
			i++;
			j--;
			
		}
	}
	
	public static void main(String[] args) {
		
		int[] ar = { 12, 31, 321, 443, 423325, 432, 1 ,2};
		
		for(int i = 0; i<ar.length; i++)
			System.out.print(ar[i] + " ");
		
		System.out.println("리버스");

		reverse(ar);
		for (int i = 0; i<ar.length; i++)
			System.out.print(ar[i] + " ");

		
	}

}
