package day08;

class Test{
	int b = 11; // 인스턴스 변수
	static int x = 10;// 클래스 변수
	String str; // 인스턴스 참조형 변수
	Test te ; // 인스턴스 참조형 변수 

	
		int abc; // 지역변수 메서드 안에 만들어져서
		
	
}


public class Test64 {
	static int a = 100;
	int i = 20;
	
	
	public static void main(String[] args) {
	
		System.out.println(Test.x); // 클래스변수 접근법 클래스이름. 변수명
		Test t = new Test();		// 인스턴스변수 접근법 객체생성 후 
		System.out.println(t.b);	//	참조변수명.인스턴수변수
		
		System.out.println(Test64.a);
		
		Test t1 = new Test();
		System.out.println(t1.b);
		
		//위의 2개식 줄이기
		System.out.println(new Test().b); // 자주 사용하는 문법은 아니다
		
		
	}

}
