package day02;

public class Test04 {

	public static void main(String[] args) {
		
		int a = 100;
		long l = 100L; //int 값이 아닌 long 타입의 값을 long 변수에 넣겠다
		double d = 3.14;
		float f = 3.14F;//  실수쓰면 기본적으로 8byte를 차지하려고함 그래서 오류가뜬다.
						// double이 아니라 float 타입이라고 값에 명시
		
		
		System.out.println(10+3);
		System.out.println("a"+"b"+"c");
		System.out.println("A"+(10+20));
		
		System.out.println('0'+10);
		//'0' = 48 
		
		System.out.println("hello\n java\t \"hello\" java \\nice");
		System.out.println("\n");
	}

}

