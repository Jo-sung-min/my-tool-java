package day10;

// default 클래스 : 같은 패키지 
class Sample {
	public int a; 	// 모두 허용 
	private int b; 	// 같은 클래스에서만 
	int c; 			// 같은 패키지 
	protected int d; // 같은 패키지 + 자식 클래스  
}

// public 클래스 : 전체 공개 
public class Test87 {
	public static void main(String[] args) {

		Sample s = new Sample(); 
		s.a = 10; 
		//s.b = 100; 
		s.c = 200; 
		s.d = 300; 
		
	}
}
