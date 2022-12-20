package day12;
//생성자를 물려받지 못함
/*
	2) 서브클래스에서 수퍼클래스 생성자 선택
		부모클래스의 생성자가 여러개 있는경우, 개발자가 부모생성자를 명시적으로
		지정하지 않는 경우 부모의 기본생성자를 호출하도록 컴파일러가 실행시킴
*/

class A1{
	A1(){
		System.out.println("생성자 A");
		
	}
	A1(int a){
		System.out.println("pram >>>"+a);
	}
	
}
class B1 extends A1{
	B1(){
		super(100);
		System.out.println("생성자 B");
	}
	B1(int a){
		System.out.println("pram >>>"+a);
	}
	
}


public class ClassEx06 {

	public static void main(String[] args) {

		B1 s = new B1(1);
		
		
	}

}
