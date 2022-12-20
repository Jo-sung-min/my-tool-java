package day14;

public class ClassEx37 {
	public static void main(String[] args) {

		try {
			System.out.println("hello");
			// 에러 메세지 지정하고 Exception 객체 생성해서 예외 던짐!! 
			throw new Exception("고의로 예외 발생시킨거야"); 
			//System.out.println("java");
		}catch(Exception e) {
			System.out.println("에러메세지 : " + e.getMessage());
			e.printStackTrace();
		}
		//System.out.println("Exception 발생!!!!!!");
		
		
	}
}
