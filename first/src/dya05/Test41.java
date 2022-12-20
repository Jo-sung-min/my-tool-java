package dya05;

import java.util.Scanner;

public class Test41 {

	public static void main(String[] args) {
		//문제 1. 구구단 2단 출력
		//출력형태
		//2 * 1 = 2 
		//2 * 2 = 4 
		//2 * 3 = 6
		//........ 
		
		//문제 2 .구구단의 단수를 입력받아 , 해당 단을 출력
		//문제 3 .구구단 전처 출력 (2단 ~9단)
		/*
		
		for(int a = 0 ;a<10;a++) {
			System.out.println(2+" * "+a+ " = " +a*2);
		}
	*/
			
		//문제 2 .구구단의 단수를 입력받아 , 해당 단을 출력
	/*
		Scanner sm = new Scanner(System.in);
		System.out.println("출력받길 원하는 단수를 입력해주세요");
		
		int num = Integer.parseInt(sm.nextLine());
	
		
			for (int a = 0 ; a<10; a ++) {
				System.out.println(num+" * "+a+ " = " +a*num);
		}
		sm.close();
		*/
		//문제 3 .구구단 전체 출력 (2단 ~9단)
		
		
/*	
		for(int a = 2;a<10;a++) {
			System.out.println("**********"+ a +"단"+"*************");
			for(int b = 1;b<10; b++) {
			System.out.println(a+" * "+b+ " = " +a * b);
			}

			
		}
	*/	
	
		
		// 문제3-1. 구구단 격자형태로 출력 (1단 ~ 9단)
/*
		for(int a = 2; a<10; a+=3) {
			System.out.println(
					"****"+ a +"단"+"****"+"     "+
					"****"+ (a+1) +"단"+"****"+"     "+
					"****"+ (a+2) +"단"+"****" );
		for(int b = 1;b<10;b++) {
			System.out.print(a+" * "+b+ " = " +a * b+"\t");
			System.out.print((a+1)+" * "+b+ " = " +(a+1) * b+"\t");
			System.out.println((a+2)+" * "+b+ " = " +(a+2) * b+"\t");
			
			}
		}	
	*/	
		
		
		// 문제4. 별찍기 : 아래 형태가 출력되도록 코드를 작성해보세요. 

	/*
		Scanner sm = new Scanner(System.in);
		System.out.println("별찍기");
		
		int num = Integer.parseInt(sm.nextLine());
	
		switch(num) {
		case 4 : System.out.println("*"); 
		case 3 : System.out.println("**");
		case 2 : System.out.println("****");
		case 1 : System.out.println("**");
		*/
		
		
		
		for (int i = 0; i<5; i++) {
			for(int j =0; j<=i; j++) {
				System.out.print("*");
			}
		System.out.println();
		
		
		
		}
		
		
		
		
		
		
		
		
		
		}

		

	

}
