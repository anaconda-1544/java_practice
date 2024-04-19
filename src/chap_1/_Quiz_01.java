package chap_1;

public class _Quiz_01 {
	//버스 도착 프로그램 제작
	public static void main(String[] arga) {
		String busNo = "동작01";
		int leftTime1 = 5;
		int leftTime2 = 0;
		double leftDistance1 = 1.5;
		double leftDistance2 = 0.8;
		
		System.out.println(busNo + "의 도착까지 남은 시간은 " + leftTime1 + "분 입니다. " + "남은 거리는 " + leftDistance1 + "km 입니다." );
		System.out.println(busNo + "의 도착까지 남은 시간은 " + leftTime2 + "분 입니다. " + "남은 거리는 " + leftDistance2 + "km 입니다." );
		
		//이건 버스 전광판으로 보여줌
		System.out.println(busNo);
		System.out.println(leftTime1 + "분");
		System.out.println(leftDistance1 + "km 남음");
		
		
	}
}
