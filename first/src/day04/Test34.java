package day04;

import java.util.Scanner;

public class Test34 {

	public static void main(String[] args) {
/*
		//while /*
		int a= 0; // 초기식
		
		while(a<5) {// 조건식 : 반복할 때마다 먼저 검사하고 ture 면 실행
			//반복시킬 명령
			System.out.println("안녕사세요");
		a++; // 증감식
			
		}
		
		//0~ 5 출력   ****중요
		
		int n = 0;
		while(n<6) {
			System.out.println(n);
			n++;
			//n = 20; // 이렇게 다른값을 대입하면 안됨 
		}	
			*/
			
		
		// while 무한반복
		// 숫자 0을 입력받을때까지 계속 정수를 입력받아 출력하세요.
		
		Scanner sm = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 :");
		while(true) {
		int num = Integer.parseInt(sm.nextLine());
		if(num==0) {
			System.out.println();
			break;
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
