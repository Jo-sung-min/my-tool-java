package day14;

public class ClassEx37 {

	public static void main(String[] args) {

			try {
				System.out.println("hello");
				throw new Exception(); // 일부로 예외 발생시킨것
			//	System.out.println("java");	//문법적으로 예외 발생시켰으므로 밑에 빨간줄이뜸
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace(); // 에러 정보를 가져오는 법
				System.out.println("Exception 발생 !!");
			}
		
		
			
			
		
	}

}
