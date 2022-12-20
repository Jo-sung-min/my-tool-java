
package day09;
/*
 	1. 아래와 같은 클래스를 만들고.
 	class Ex01{
 		String str = "hello java";
 		int year = 2022;
 	}
 	str 변수값을 출력하는 인스턴스 메서드 1개
 	year 변수값을 출력하는 인스턴스 메서드 1개
 	총 두개의 메서드를 추가해 보세요.
 */

	class Ex01{
 		String str = "hello java";
 		int year = 2022;
 		
 		void printStr() {
 			System.out.println(str);
 		}
 		void printyear() {
 			System.out.println(year+"년");
 		}
 		
 	}

	
	
	
	
	
	
	





public class Test74 {
	
	public static void main(String[] args) {

	//	2. 1번에서 만든 Ex01 클래스로 객체 생성 2개하고 각각 메서드를 호출해보세요. 
		Ex01 test = new Ex01();
		Ex01 test2 = new Ex01();
		test.printStr();
		test.printyear();
		test2.printStr();
		test2.printyear();
		
		
		
		
		

	}

}
