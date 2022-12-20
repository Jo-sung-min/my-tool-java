package day14;

public class ClassEx39 {

	
	static void method2() throws Exception {		// 나도 처리가 힘드니 메서드 2를 사용하는 놈에게 토스 
		method1();
	}
	static void method1() throws Exception {		// 메서드 1 을 사용하는 녀석에게토스
		throw new Exception();						// 예외를 생성
	}
	public static void main(String[] args) {
		
		try {
			method2();
		} catch (Exception e) {
			System.out.println("처리할게");
			e.printStackTrace();
	}
		
		
		
		
	}

}
