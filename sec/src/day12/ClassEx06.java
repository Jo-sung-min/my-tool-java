package day12;
class A1 {
	A1() {
		System.out.println("생성자 A");
	}
	A1(int x){
		System.out.println("생성자 A-param : " + x);
	}
}
class B1 extends A1{
	B1() {
		super(100); 
		System.out.println("생성자 B");
	}
	B1(int x) {
		super(x); // 부모의 매개변수있는 생성자 호출 
		System.out.println("생성자 B-param : " + x);
	}
}
public class ClassEx06 {
	public static void main(String[] args) {
		
		B1 b = new B1(); 
		
		
	}
}
