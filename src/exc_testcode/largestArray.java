package exc_testcode;

public class largestArray {

	public static void main(String[] areg) {
		int[][][] anyArray = new int[][][] {
			{
				{2, 321, 53223, -3224, 435, 3900, 324, 65535},
				{3432, 322, 4452, 9999999, 212},
				{4324, 4233, 4325, 321122}
			},
			{
			{2, 321, 53223, -3224, 435, 3900, 324, 65535},
			{3432, 322, 4452, 9999999, 212},
			{4324, 4233, 4325, 99223112}
			}
		};
		
		int largest = anyArray[0][0][0];
		
		for(int i = 0; i<anyArray.length; i++) {
			for(int j = 0; j<anyArray[i].length; j++) {
				for(int k = 0; k<anyArray[i][j].length; k++) {
				//	for(int m = 0; m<anyArray[i][j][k].length; m++) {
			
			if(anyArray[i][j][k] > largest) {
				largest = anyArray[i][j][k];
			}
			}
		}
		
 		
		System.out.println(largest);
		
	}
	
	
}
}