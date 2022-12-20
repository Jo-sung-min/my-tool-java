package day08;
/*
 	리턴타입 메서드명(타입 파라미터. ....){
 		실행코드들..
 		리턴값
 	}
 */
class Hello{
	//메서드 조건 4가지 
	// 입력 x 리턴 x
	void printHello() {
		System.out.println("hellw method");
		System.out.println("hellw method");
	}
	// 입력 o 리턴 x
	void helloName(String name) {
		System.out.println(name + "님 안녕하세요");
	}
	// 입력 x 리턴 o  // 리턴타입에 맞는 값으로 void 를 변경 하는 순서로 하면댐
	int getTen() {
		return 10;
	}
	// 입력 o 리턴 o
	//정수 두개 받고 더하는거 만들자
	int sum(int a, int b) {
		int c = a+b;
		return c;
	}
	
	
}



public class Test67 {

	public static void main(String[] args) {

		Hello h = new Hello();
	    //h.printHello();
		
		// h.helloName("피카츄");
		int result = h.getTen();
		System.out.println(h.getTen());
		h.sum(55,1 );
		System.out.println(h.sum(55,1 ));
		
		
	}

}
