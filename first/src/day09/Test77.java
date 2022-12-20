package day09;

public class Test77 {

	//클래스변수
	static int x = 10;
	//클래스 초기화 블럭 프로그램 실행하면 바로실행
	int y ;
	static {
		System.out.println("클래스 초기화 블럭");
		x=200;
		//y = 300;
	}
	//인스턴스 초기화 블럭  객체생성하면 자동실행
	int a = 10;
	{a = 20; 
	System.out.println("인스턴스 초기화 블럭");
	System.out.println(a);
	y=200;
	}
	
	
	
	public static void main(String[] args) {
		//클래스 변수 출력
		System.out.println(Test77.x);
		//인스턴스 변수 출력
		Test77 sm = new Test77(); 
		System.out.println(sm.y);
		
		
		
	}

}
