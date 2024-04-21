package chap_6;

public class chap_6_5_pakage {
    public static String getHiddenData(String data, int index) {
        StringBuilder hiddenData = new StringBuilder(data.substring(0, index));
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData.append("*");
        }
        return hiddenData.toString();
    }
	
	public static void main(String[] asdf){
		String name = "김푸앙";
		String id = "190101-9324553";
		String phone = "010-2344-2222";
		
		
		System.out.println("이름: " + getHiddenData(name,1));
		System.out.println("주민등록 번호: " + getHiddenData(id, 8));
		System.out.println("전화번호 " + getHiddenData(phone, 9 ));
		
		
		
		
	}
	
}
