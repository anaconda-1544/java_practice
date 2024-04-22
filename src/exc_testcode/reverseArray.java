package exc_testcode;

public class reverseArray {

	public static void main(String[] args) {
		int[][][] the3D = new int[3][3][3];
		int [][][] reverse = new int[3][3][3];
		int num = 1;
		
		for(int i = 0; i<the3D.length; i++) {
			for(int j = 0; j<the3D[i].length; j++ ) {
				for(int k = 0; k<the3D[i][j].length; k++) {
					the3D[i][j][k] = num;
					num++;

					
				}
				
			}
			
			
			
		}
		
		
		for(int i = 0; i<the3D.length; i++) {
			for(int j = 0; j<the3D[i].length; j++ ) {
				for(int k = 0; k<the3D[i][j].length; k++) {
		System.out.print(the3D[i][j][k] + " ");	
				}
				System.out.println();
			
			}
			System.out.println();

		}
		
		System.out.println("---------------리버스---------------");
		System.out.println(" ");
        reverse(the3D, reverse);
		
		for(int i = 0; i<reverse.length; i++) {
			for(int j = 0; j<reverse[i].length; j++ ) {
				for(int k = 0; k<reverse[i][j].length; k++) {
		System.out.print(reverse[i][j][k] + " ");	
				}
				System.out.println();
			
			}
			System.out.println();

		}

	}
	
	
	
	
	public static void reverse(int[][][] the3D, int[][][] reverse) { //1차원 배열 리버스
			for(int i = 0; i<the3D.length; i++) {
				for(int j = 0; j<the3D[i].length; j++) {
					for(int k=0; k<the3D[i][j].length; k++) {
						reverse[i][j][k] = the3D[the3D.length - 1 - i][the3D[i].length - 1 -j][the3D[i][j].length-1-k];
						
					}
				}
			}
	

	}
}







/*
public static void reverse(int[][][] arr) {
	for(int i = 0; i < arr.length/2; i++) {
		int[][] temp1 = arr[i];
		arr[i] = arr[arr.length - 1 - i];
		arr[arr.length - 1 - i] = temp1;
		
		for(int j = 0; j<arr[i].length; j++) {
			for(int k = 0; k< arr[i][j].length; k++) {
				int temp2 = arr[i][j][k];
				arr[i][j][k] = arr[arr.length - 1- i][j][k];
				arr[arr.length - 1 - i][j][k] = temp2;
			}
		}
	}
	
} */
