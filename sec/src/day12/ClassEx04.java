package day12;

class A {
	A() {
		System.out.println("생성자 A");
	}
}
class B extends A {
	B() {
		//super(); 
		System.out.println("생성자 B");
	}
}
class C extends B {
	C() {
		//super(); 
		System.out.println("생성자 C");
	}
}
public class ClassEx04 {
	public static void main(String[] args) {

		C c = new C(); 
		
		
		
	}
}
