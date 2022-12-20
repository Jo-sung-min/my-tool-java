package day09;

import java.util.Scanner;

//재귀호출 factorial : 1부터 입력받은 수 n 까지 곱한 결과를 돌려주는 메서드
public class Test70 {
	static long factorial(int a) {
		if (a==1) {
			return 1;
		}else {
			return a*factorial(a-1);
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("정수입력>>");
		int n =  Integer.parseInt(sc.nextLine()); //숫자 입력받기
		long result =factorial(n);	
		System.out.println(result);
		// 클래스 없애고 객체생성 후 다시 만들어보기
		
		
		sc.close();
	}

}
