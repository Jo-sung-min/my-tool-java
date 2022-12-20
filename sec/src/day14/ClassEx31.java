package day14;

class SingleT {
	
	static int b = 1; 
	int a = 100; 
	
	// 싱글턴 
	private static SingleT instance = new SingleT(); 
	private SingleT() { }
	public static SingleT getInstance() {
		return instance;
	}
	void func() {
		System.out.println("싱글턴!!!!");
	}
}

public class ClassEx31 {
	public static void main(String[] args) {

		//SingleT sing = new SingleT(); 
		SingleT sing = SingleT.getInstance(); 
		SingleT sing2 = SingleT.getInstance(); 
		
		sing.func();
		
		System.out.println(sing.a);
		sing.a = 123;
		System.out.println(sing.a);
		System.out.println(sing2.a);
		
		System.out.println(SingleT.b);
		
		
		
		
		
	}
}
