package exc_testcode;

public class _3D_Array {
	
	public static void main(String[] args) {
		int the3D[][][] = new int[3][3][3];
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
			System.out.println(" ");
			}
		}			System.out.println(" ");

		
	}
}
