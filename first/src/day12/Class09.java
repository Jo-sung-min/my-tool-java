package day12;

class AClass2 {
	int x ;
	void add() {
		System.out.println("AAA");
	}
}
class BClass2 extends AClass2{
	int y;
	void add() {// 오버라이딩
		System.out.println("BBB");
	}
	void func() {
		System.out.println("subsub");
	}

	
}

public class Class09 {

	public static void main(String[] args) {
		// 다형성 조상의 참조변수로 자식의 실 객체를 담아주는것
	/*	AClass2 a = new AClass2();		//기본 객체생성
		AClass2 a2 = new BClass2(); 	// 다형성 객체생성
		
		a.add();
		System.out.println();
		a2.add();*/
		//a [x, add("AAA")]
		//a2 [x,y , @add("BBB"), func()]
		 
		
		/*AClass2 a = null;	
		BClass2 b = new BClass2();// a 에다가 넣었더니 a 에 있는것만 쓸 수 이따
		a = (AClass2)b;
		a.add();*/
		
		/*AClass2 a = new AClass2();
		BClass2 b = null;
		b = (BClass2)a;	//컴파일은 되지만 실행항떄 에러 (Runtime 에러) 왜냐하면 a를 형변환은 해줘도 그릇이 없기때문
		*/
		
		AClass2 a =new AClass2();
		BClass2 b= new BClass2();
		AClass2 b2 = null;
		// a 가 실제 들고있는 객체가 BClass2 의 객체면 true
	/*	if(a instanceof BClass2) {
			b2 = (BClass2)a;
		}*/
		a = (AClass2)b;					//다형성 upcasting : 형변환 생략가능
		b2 = (BClass2)a;
		b2.add();
		// 다형성	dowm 캐스팅 형변환 필수
		
		
		
//		a.add();
//		b.add();
	//	b2.add();
		
	/*	AClass2 a = new BClass2 ();
		Object obj = new BClass2();
		Object obj2 = new AClass2();*/
		// 왜 다형성이 필요할까?
			
		
	}

}
