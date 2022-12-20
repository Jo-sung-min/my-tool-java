package day12;

class Super{
	void add(){
		System.out.println("super");
	}

}
class Sub extends Super{ // add()
	void add() {
		System.out.println(" sub");
		System.out.println(" sub");
		System.out.println(" sub");
		super.add();
		}
	}


public class ClassEx07 {

	public static void main(String[] args) {
		// 부모객체 생성
		Super sup = new Super();
		sup.add();
		
		
		
		// 자식 객체
		Sub s = new Sub();
		s.add();
		System.out.println("-----------------");
		
		
		
	}

}
