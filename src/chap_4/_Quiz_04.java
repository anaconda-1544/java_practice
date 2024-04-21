package chap_4;

public class _Quiz_04 {
	public static void main(String[] asdf) {
		int total = 0;
		int i = 4000;
		boolean disablity = false;
		boolean smallCar = false;

		
		for(int hour = 0; hour <= 24 ; hour++ ) {
			total = i * hour;
			
			if(disablity||smallCar) {
			total =	total / 2;
			System.out.println("당신은 장애인 또는 경차입니다. 주차 할인이 가능합니다.");
			}
			
			if(total >= 30000)
				total=30000;
			
			System.out.println("주차요금은 원입니다" + total);
			if(total >= 30000)
				break;
			
		}
		
	}
}
