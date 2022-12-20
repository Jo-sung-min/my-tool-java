package day12;


class A{
	A(){
		//super () 생략 돼있는것
		System.out.println("생성자 A");
	}
}
class B extends A{
	B(){
		System.out.println("생성자 B");
	}
}
class C extends B{
	C(){
		System.out.println("생성자 C");
	}
}

public class ClassEx04 {

	public static void main(String[] args) {
		
		C c = new C();
		
		
	}

}
