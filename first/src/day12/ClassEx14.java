package day12;
//추상클래스
abstract class SuperClass{
	// 추상메서드 : 구현부가 없는 메서드를 말함
	abstract void add();	// 선언부, 헤드
	/*
	 	void add(){
	 	// 구현부, 바디
	 	}
	 
	 */
	//추상 클래스에 일반 멤버들도 같이 포함 가능
	int a = 10;
	void aaa() {
		
	}
	
}
class SubClass extends SuperClass{
	@Override
	void add() {
		// 내용이 없어도 일단 에러는 안뜸 // add (추상메서드 ) 컨트롤 스페이스 하면댐
		
		
	}
}


public class ClassEx14 {

	public static void main(String[] args) {
		//SuperClass s = new SuperClass();//객체 생성 안댐
		//SuperClass s; // 이거는 댐
		SubClass s = new SubClass();
		s.add();
		
	}

}
