package day12;

class AClass2 { // x, add()
	int x; 
	void add() {
		System.out.println("AAA");
	}
}
class BClass2 extends AClass2 { // x, @add(), y, func()
	int y; 
	void add() {	// 오버라이딩 
		System.out.println("BBB");
	}
	void func() {
		System.out.println("subsub");
	}
}
public class ClassEx09 {
	public static void main(String[] args) {

		
		AClass2 a = new BClass2();
		Object obj = new BClass2(); 
		
		Object obj2 = new AClass2(); 
		
		
		
		
		
		
		
		
		
		
	}
}
