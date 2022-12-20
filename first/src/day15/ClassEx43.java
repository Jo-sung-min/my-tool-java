package day15;

public class ClassEx43 {
	public static void main(String[] args) {

		// 리터럴 방식 
		String a = "hello";
		String b = "hello";
		
		// !!!! 문자열 비교는 equals() 메서드 사용 !!!!
		if(a == b) { // 리터럴방식은 주소 같아서 == 으로 비교해도 같다고 나옴 
			System.out.println("a == b");
		}
		if(a.equals(b)) { // 문자열 값 비교 
			System.out.println("a equals b");
		}
		System.out.println();
		
		// 객체 생성 방식 
		String c = new String("hello");
		String d = new String("hello");
		if(c == d) {
			System.out.println("c == d");
		}
		if(c.equals(d)) {
			System.out.println("c equals d");
		}
		
		System.out.println();
		
		
		
		//System.out.println(System.identityHashCode(a));
	}
}
