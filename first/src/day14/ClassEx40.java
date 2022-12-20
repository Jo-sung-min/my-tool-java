package day14;

public class ClassEx40 {

	static void method1() throws
	Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외처리!!");	//try에서 생성을 시켰음
					throw e;					//예외 하나를 던져줌
			
		}
		
	}
	
	public static void main(String[] args) {
			try {
				method1();
				
				
			} catch (Exception e) {
				System.out.println("main 에서도 잡기");
				}
		
	}

}
