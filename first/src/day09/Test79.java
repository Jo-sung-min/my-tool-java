package day09;

public class Test79 {

	double d=101;
	Test79(){
		//인스턴스 변수 하나생성
		d= (int)(Math.random()*10);
	}
	Test79(double a ){
		d=a;
	}
	
	
	
	public static void main(String[] args) {
		
			Test79 sm = new Test79();
			Test79 sm1 = new Test79(10.0); //오버로딩 할 수 있어서 뒤에 변수 타입을 맞춰주면 2번째 선언한 
											//초기화가 실행된다.
			System.out.println(sm.d);
			System.out.println(sm1.d);
		
	}

}
