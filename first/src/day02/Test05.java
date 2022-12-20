package day02;

public class Test05 {

	public static void main(String[] args) {
	
		//문제 : 정수형 변수 a 와 b 에 각각 10, 20을 대입하고, 값을 서로 교환해서 출력해보세요
		
		//변수생성 +값대입하기
		
	int a =10; 
	int b =20;
		
		System.out.println("Hello"+" "+"world"+b); // 10 20
		
		//# 2 . a 변수의 값과 b 변수의 값을 교환해서 저장
		
		int temp=a;    //temp = 10 , a =10 , b=20
		a=b;			//temp= 10 , a= 20 , b =20
		b=temp;			//temp= 10 , a= 20 , b =10
		System.out.println(a+"  "+b); // 20 10

		
	
	}

}


