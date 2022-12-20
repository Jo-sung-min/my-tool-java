package day11;
/*final class SuperClass{
	
	
	
}
class SubClass extends SuperClass{
	
} */
class SuperClass{
	final void add() {System.out.println("aaaaa");};
}
class SubClass extends SuperClass {
	/*
	void add() {System.out.println("aaaaa");
	
				System.out.println("aaaaa");};
			// 자식이 내용물을 수정하면 오버라이딩*/
}

class Test {
	//명시적으로 초기화를 한 경우 그대로 사용
	//final static int x = 10;
	//final	int y = 20;
	//이렇게 바꿀수있다.
	final int x;
	Test(int x){
		this.x = x;
	}
	
}
public class ClassEx03 {

	public static void main(String[] args) {
		
		/*
	//SubClass sm = new SubClass();
	//sm.add();
		System.out.println(Test.x);
		//Test.x = 100;
		Test sm = new Test();
		//sm.y = 100;
		System.out.println(sm.y);
*/
	}

}
