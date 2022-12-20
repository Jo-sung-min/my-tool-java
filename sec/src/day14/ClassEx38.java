package day14;

import java.io.IOException;

public class ClassEx38 {
	
	static void add() throws IOException, Exception { // 예외 발생하는것 부른쪽으로 토스 
		System.out.println("add실행!!");
		
		throw new Exception();  // 0/0
		
	}
	
	public static void main(String[] args) {

		try {
			add(); 
		}catch(Exception e) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
