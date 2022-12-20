package day03;

public class Test21 {

	public static void main(String[] args) {
		
		//대입연산자 : 대입해야 변수안의 값이 변경된다.
		/*
		int a =10;
		System.out.println(a+10);
		System.out.println(a);
		*/
		
		int i = 5, j =5;
		
		System.out.println(i++); // 출력후 1 더하기 출력후에는 6이다
		System.out.println(++j); // 더한 후 출력
		System.out.println("i = " + i + " , j = " + j ); 
		
		
		// 문제 1. 출력결과를 먼저 주석으로 적어보고 실행해서 맞는지 확인해보세요.
		// 증감 연산자는 값에 변화를 주고 저장까지 시킨다.
		int k =10;			
		System.out.println(k++); //10
		System.out.println(++k); //12
							++k; //13
		System.out.println(++k); //14
		System.out.println(k++); //14
		System.out.println(k);   //15
		
		//문제 2. r 의 결과를 주석으로 적어보세요.
		//증감 연산자는 값에 변화를 주고 저장까지 시킨다.
		int a = 10;
		int b = 10;
		int r = ++a + ++b; //22
		r = ++a + b++;		// 12 + 11  b =12				    r = 23
		r = ++a + a;		// 13 + 13						    r = 26
		r = ++a + a++;		// 14 + 14   a=15		  	 		r = 28
		r = ++a + ++a; //	16 + 17		33	      a = 17 b = 12 r = 33
		
		System.out.println(r);
		
		
		
		
		
		
		
		
		
		
		

	}

}
