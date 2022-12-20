package day14;

interface MyInter {
	void func(); 
}

class My implements MyInter {
	@Override
	public void func() {
		System.out.println("hello");
	}
}

public class ClassEx32 {
	public static void main(String[] args) {

		My my = new My();
		my.func();
		
		
		// MyInter 인터페이스 규격에 맞는 
		//	구현 익명 클래스 만들어서 객체 생성하고, 메서드 호출! 
		new MyInter() {
			@Override
			public void func() {
				System.out.println("MyInter의 func 구현부~~~");
			}
		}.func();
		
		
	}
}
