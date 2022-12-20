package day15;

public class ClassEx44 {
	public static void main(String[] args) {

		// 문자 1개 가져오기 
		String str = "hello";
		char ch = str.charAt(0);
		System.out.println(ch);
		
		// 문자열 연결 : concat()
		String str2 = str.concat("java");
		System.out.println(str2);
		// 문자열 연결 : + 연산자
		String str3 = str + "java"; 
		
		// 문자열 사전순으로 비교 
		String java = "Java"; 
		String cpp = "C++"; 
		int res = java.compareTo(cpp);
		System.out.println(res);
		
		// 문자열 앞뒤 공백 제거 : trim() 
		String a = "        abcd   efg         "; 
		String b = "        xyz\t"; 
		String c = a.trim(); 
		String d = b.trim();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		// 문자열의 길이 
		String str4 = "hello";
		System.out.println(str4.length());
		
		// 문자열 바꾸기 
		String str5 = "Apple Tree"; 
		String str6 = str5.replace("Apple", "Lemon");
		System.out.println(str6);
		
		System.out.println(str6.toLowerCase());
		System.out.println(str6.toUpperCase());
		
		// substring() 
		String str7 = str6.substring(4); 
		System.out.println(str7);
		//					(beginIndex, endIndex) 
		String str8 = str6.substring(4, 7); // 끝번호 포함X (끝번호 전까지 잘라줌)
		System.out.println(str8);
		
		
		String [] words = {new String("hello"), new String("java"), new String("spring")}; 
		
		// 정수 -> 문자열 
		int value = 100; 
		String strValue = String.valueOf(value);
		
		// 정수 -> 문자열
		String strVal = value + ""; 
		
		// substring() : 파일명 나누기 
		String fullName = "Hello.java"; 
		int index = fullName.lastIndexOf(".");
		String name = fullName.substring(0, index); 
		String ext = fullName.substring(index);
		System.out.println("파일명 : " + name);
		System.out.println("확장자명 : " + ext);
		
		
		
		
		
		
		
	}
}
