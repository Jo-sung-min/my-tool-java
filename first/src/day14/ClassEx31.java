package day14;

class SingleT{
	static int b = 1;
	int a = 100;
	
	
	private static SingleT instance = new SingleT(); //1번
	private SingleT() { }							//2번
	public static SingleT getInstance () {			//3번
		return instance;
	}
	//SingleT sing = new SingleT(); // 무한로딩
	void func() {
		System.out.println("싱글턴!!");
	}
	
	
}

public class ClassEx31 {

	public static void main(String[] args) {

		//SingleT sing = new SingleT();
		SingleT sing = SingleT.getInstance();
		SingleT sing2 = SingleT.getInstance();

		sing.func();
		System.out.println(sing.a);
		sing.a = 200;
		System.out.println(sing.a);
		System.out.println(sing2.a);
		
		
		
		
	}

}
