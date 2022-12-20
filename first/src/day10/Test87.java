package day10;
//default 클래스 : 같은 패키지

class Sample{
	public int a;// public
//	package day10;
	//private int b;	// private
	int c ; // default
	protected int d ; // 같은 패키지 + 자식 클래스
	
	
}


//public 클래스 : 전체 공개 
public class Test87 {

	public static void main(String[] args) {

		Sample s = new Sample();
		s.a = 10;
		//s.b = 100;
		
		s.c = 100;
		s.d = 300;
		
	}

}
