package day09;

public class Test76 {

	// 클래스 변수 
	static int x = 10; 
	// 인스턴스 변수 
	int y = 20; 
	
	// 클래스 초기화 블럭 : 프로그램 시작하면 자동 실행
	static {
		System.out.println("클래스 초기화 블럭");
		x = 200;  
		//y = 300;  
	}
	// 인스턴스 초기화 블럭 : 객체 생성하면 자동 실행 
	{
		System.out.println("인스턴스 초기화 블럭");
		y = 400; 
	}
	
	public static void main(String[] args) {

		// 클래스 변수 출력 
		System.out.println(Test76.x);
		
		// 인스턴스 변수 출력
		Test76 test = new Test76(); 
		System.out.println(test.y);
		
		
		
		
	}
}
