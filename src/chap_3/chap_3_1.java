package chap_3;

public class chap_3_1 {
	public static void main(String[] areg) {
		
		String s = "그 나는 아나콘다 abcd ABCD 그";
		System.out.println(s);
		System.out.println(s.length());
		
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		System.out.println(s.contains("아나콘"));
		System.out.println(s.indexOf("아나콘"));
		System.out.println(s.indexOf("그"));
		System.out.println(s.lastIndexOf("그"));
		System.out.println(s.startsWith("그"));
		System.out.println(s.endsWith("."));

		System.out.println(s.replace("나는", ""));
		System.out.println(s.substring(7));
		System.out.println(s.substring(s.indexOf("나는"), s.indexOf("abcd")));
		
		s = "    그    나는     아나콘다  abcd    ABCD                            그";
		System.out.println(s);
		System.out.println(s.trim()); //공백 제거
		
		

		
	}
}
