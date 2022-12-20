package day14;

public class ClassEx38 {

	static void add() throws Exception {// 예외 발생하는것 부른쪽으로 토스
		System.out.println("add 실행");
		
		throw new Exception();
		
	}
	
	
	public static void main(String[] args) {

		
		
		try {
			add();
		} catch (Exception e) {
			
		}
		
		
		
		
		
		
		
		
	}

}
