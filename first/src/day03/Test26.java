package day03;

public class Test26 {

	public static void main(String[] args) {

		
		// 비교연산자 : < <= > >= == !=
		int a = 10;
		int b = 5;
		
		boolean result = a != b;// 참 거짓은 boolean 으로 담는다.
		
		System.out.println(result);
		
		// 논리 연산자 
		// a $$ b : a, b 둘다 참이여야 참 
		// a || b : a, b 둘중 하나만 참이면 참
		
//		result = a > b || b > 0;		
		result = a < b || b < 0;		
		System.out.println(result);
		
		
		result = a > b && a < 0;
		System.out.println(result);
		
		//삼항 연산자
		//true / false 의 결과식 ? 참일때 결과값 : 거짓일때 결과값;
		
		System.out.println(a > b ? a : b );// 둘중에 큰값을 돌려주는 공식
		
		int res = a > b ? a : b ;
		
		char resCh = a < b ? 'o' : 'x';
			System.out.println(resCh);
		
		
		
		
		
	}

}
