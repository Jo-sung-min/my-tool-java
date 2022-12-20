package day14;

public class ClassEx39 {
	
	static void method1() throws Exception {
		method2(); 
	}
	static void method2() throws Exception {
		throw new Exception(); 
	}
	
	public static void main(String[] args) {
		try {
			method1(); 
		}catch(Exception e) {
			System.out.println("처리할게");
			e.printStackTrace();
		}
		
	}
}
