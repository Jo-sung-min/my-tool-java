package day12;

class Super {
	void add() {
		System.out.println("Super");
	}
}
class Sub extends Super { // add() 
	void func() {
		super.add(); // 부모 add 실행 
		add(); 		// 내가 오버라이딩한거 실행 
	}
	// 오버라이딩!! 
	@Override	
	void add() {
		System.out.println("Sub");
		System.out.println("Sub");
		System.out.println("Sub");
		super.add(); // 부모가 만든 형태의 add 호출해서 사용가능 
	}
}
public class ClassEx07 {
	public static void main(String[] args) {

		// 부모 객체 생성 
		//Super sup = new Super(); 
		//sup.add();
		
		// 자식 객체 생성 
		Sub s = new Sub(); 
		s.add(); 
		
		
		
		
		
		
		
	}
}
