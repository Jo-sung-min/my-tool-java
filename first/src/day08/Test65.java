package day08;
/*
	클래스 기본형변수 : 클래스명.변수명 : static 키워드 붙음. 메서드 밖
	클래스 참조형변수 :
	
	인스턴스 기본형 변수 : 무조건 new 로 객체생성한 후 참조변수명.변수명 메서드 밖
	인스턴스 참조형 변수
	
	지역 기본형 변수 : 변수명 : 메서드 안에서 만들어짐, 메서드 끝나면 소멸
	지역 참조형 변수

*/


class Tvtest{
	boolean power = false;
	int ch =1, vol =0;
	
}



public class Test65 {
	//-------------------------static Tvtest tv1 ;  클래스가 만들어져있어야 static을 붙일수 있다.---------------------------------
	static int a; // 클래스 기본형 선언만 했을때
	static String s; // 클래스 참조형변수 자동초기화 null
	
	//static 붙은 아이는 프로그램 시작시 " 한번만 " 로딩된다. 11111111
	static Test64 t1 = new Test64(); // 클래스 참조형변수 자동초기화 null // 미리 객체생성도 해보기
	
	static Tvtest tv1 ; // 타입이 만들어져있어야 static을 붙일수 있다. 
						// 생각해보면 참조형 클래스가 안만들어져있는데 지정해줄게 없으니까 에러 나는듯 
	
	
	int x=10 ; 		//인스턴스도 자동초기화 0
	Tvtest t2 ; // 인스턴스 참조형 자동초기화 null
	//내 클래스 안에 내 타입으로 인스턴스 객체생성하며 선언하면 안된다!!!!!!!!111111111 두개 대입해서 생각
	//선언할 때 객체생성 해버리면 안된다.
	Test64 test64 ;  // 인스턴스 참조형 변수 자동초기화 null
	

	public static void main(String[] args) {
		

	/*	Test64 test = new Test64();//test64 변수를 쓰고 싶어서 객체 생성   문열고 들어가는거라고 상상해바바 
		System.out.println(test.a);
			
		
*/
		
		System.out.println(Test65.t1); // 클래스변수와 인스턴스 변수는 초기화 안해도 선언만해도 자동 초기화 된다.
		Test65 test =new Test65();
		System.out.println(test.t2);
		Test65.a = 100;
		System.out.println(Test65.a);
		Test65.s = "hello";
				System.out.println(Test65.s);
				
		Test65.tv1 =new Tvtest(); //참조형변수에 값 대입하려면 객체생성 하는방법밖에 없다.
		System.out.println(Test65.tv1);
		System.out.println(Test65.tv1.ch); // 객체생성 후에 Tvtest 클래스 값들을 불러 올 수 있다.
		
		
		System.out.println(Test65.t1.i); // 미리 객체생성 해서 선언해줄 필요가 없다 
		
	
		
		
		
		
		
		
		
		
		
				
				
	}

}
