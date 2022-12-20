package day07;

// z클래스 정의
class Person{
	/*
	속성 + 기능
	속성과 기능을 통틀어 멤버라고 부른다.
	속성: 멤버변수, 필드
	기능 : 메서드
	
	//속성(변수)
	*/String name = "홍길동";
	int age = 10;
	//기능 (메서드)
	void breathing() {
		System.out.println("숨");
	}
	void sleep() {
		System.out.println("자기");
	
	
	}
}
public class Test60 {

	
	
	public static void main(String[] args) {

		
	// 객체생성
		Person p = new Person();
		p.name = "피카츄";
		System.out.println(p);
		System.out.println(p.name);
		System.out.println(p.age);
		p.breathing();// 기능을 실행하라
		p.sleep();
		Person p2 = new Person(); // 항상 new 를 쓰면 새롭게 heap 메모리를 하나 가져오는것
		System.out.println(p2);
		System.out.println(p2.name);
		System.out.println(p2.age);
		
		
		
		
		
		
		
		
		

	}

}
