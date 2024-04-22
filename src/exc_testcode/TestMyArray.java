package exc_testcode;

//java.util.Arrays 사용 불가

public class TestMyArray {
	public static void main(String[] args) {
        // 1) {1,5,3,9,7}에 해당하는 array로 MyArray object를 생성
        MyArray array1 = new MyArray(new int[]{1, 5, 3, 9, 7});

        // 2) get으로 3번째 element '3' 값을 가져오기
        int thirdElement = array1.getElement(2);
        System.out.println("3rd Element: " + thirdElement);

        // 3) {2,4}로 MyArray object를 하나 더 생성
        MyArray array2 = new MyArray(new int[]{2, 4});

        // 4) numOfArrayCreated() 확인
        System.out.println("Number of Arrays Created: " + MyArray.numOfArrayCreated());

        // 5) 두 object가 같은지 equals 테스트
        System.out.println("Are arrays equal: " + array1.equals(array2));
    }
			
		
		
	
}
