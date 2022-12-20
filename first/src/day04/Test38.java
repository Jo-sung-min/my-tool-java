package day04;

import java.util.Scanner;

public class Test38 {

	public static void main(String[] args) {
		//for 문으로 풀어보세요
		
		//문제 1. 10~ 30까지 출력
/*		
		for( int a=10; a<=30 ;a++ ) {
		System.out.println(a);
		}
	*/	
	
	   //문제 2. 0~100까지 10단위로 출력
/*
		for( int a=0; a<=100 ;a+=10 ) {
			System.out.println(a);
			}	
	*/
		//문제3. 1~20까지 짝수만 출력.
		/*
		for(int a = 1; a<=20  ; a++ ) {
			if(a%2==0) {
			System.out.println(a);
			}
			
		}
		*/
		//문제4. 1~200까지 홀수의 총합 출력
/*		
		long sum = 0L;
		for(long a = 1L; a<=200L  ; a++ ) {
			if(a%2==1) {
			sum += a;

			}		
		
		}
		System.out.println(sum);
	*/	
		
		// 문제5. 정수 1개를 입력받고, 1부터 입력받은 수까지의 합을 출력. 
		
		Scanner sm = new Scanner(System.in);
		System.out.println("정수 하나를 입력해 주세요");
		
		int num = Integer.parseInt(sm.nextLine());
		int total=0;
		
		if (num>0) {
		for(int i=1; i<=num ;i++ ) {
			total += i;
			}
			
		}else{
			
		for(int i=1; i>=num ;i-- ) {
			total += i;}
			}
	
			System.out.println(total+"입니다.");
		
		
		
		
		
		sm.close();
	}

}
