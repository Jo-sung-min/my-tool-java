package day12;
// 인터페이서 !! 클래스로 만들지 않는다
interface Test{
	public static final int NUM = 1;	//상수
	public abstract void add(); 	//추상메서드
	
	//int x = 100; 	// 앞에 생략한 상수 public static final 생략
	//void sub(); 	//추상메서드 : 뒤에 중괄호 붙이면 안댄다 public abstract void 생략된것
	
	
	
	
}
//인터페이스를 구현한 클래스
class Hello{
	int x = 10;
}

class Inter extends Hello implements Test,Test2{

	@Override
	public void add() {
			System.out.println("imp!");
	}

	@Override
	public void func() {
		System.out.println("func");
		
	}

	
}
interface Test2{
	void func();
}


public class ClassEx16 {

	public static void main(String[] args) {

		Inter i = new Inter();
		i.add();
		System.out.println(i.NUM);
		
		
		
		
		Test t =new Inter();
		t.add();
		Test2 tt = new Inter();
		tt.func(); // Test2 가 가지고있는 func 하나 사용가능
		
		
	}

}
