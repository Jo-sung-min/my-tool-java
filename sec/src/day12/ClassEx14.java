package day12;
//추상클래스
abstract class  SuperClass{
	// 뼈대를 만들어 주기 위함이다
	int x ;
	String name;
	abstract void name ();
	
}


class SubClass extends SuperClass{

	@Override
	void name() {
		System.out.println("송민이");
		
	}
	
	
	
}
public class ClassEx14 {

	public static void main(String[] args) {

		SubClass sub = new SubClass();
		sub.name();
		System.out.println(sub.x);
		
		
	}

}
