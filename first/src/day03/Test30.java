package day03;
import java.util.Scanner;
public class Test30 {

	public static void main(String[] args) {
		
		/*
	      // 문제4. 숫자하나를 입력받고, "음수"인지 "양수"인지 "0"인지 출력해보세요.
		
		System.out.println("정수를 입력해주세요");
		Scanner sm = new Scanner(System.in);

		int num = Integer.parseInt(sm.nextLine());
	
		
		
		if(num>0){
			System.out.println("양수");
		}else if(num<0) {
			System.out.println("음수");
			
		}else {
			System.out.println("0");
		}
		*/
		
	
		 // 문제5. 1 ~ 99 사이 숫자를 입력받고, "짝수"인지 "홀수"인지 출력해보세요.
	/*	
		System.out.println("1~99사이 숫자를 입력해주세요");
		Scanner sm = new Scanner(System.in);

		int num = Integer.parseInt(sm.nextLine());
	
		int tnum = num%2;
		
		if(tnum==0){
			System.out.println("짝수");
		}else if(tnum!=0) {
			System.out.println("홀수");
			
		}
		
		*/
		
		
		 // 문제6. 정수 3개를 입력받고, 3개의 숫자중 가장 큰 수를 출력하세요.
		
/*
		System.out.println("비교하고싶은 3가지 수를 입력하세요");
		Scanner sm = new Scanner(System.in);
		

		int num = Integer.parseInt(sm.nextLine());
		int num1 = Integer.parseInt(sm.nextLine());
		int num2 = Integer.parseInt(sm.nextLine());
	
		
		
		if(num>num1) {
			if(num>num2) {
					System.out.println(num+"가장큽니다.");				
			}
					else {System.out.println(num2+"가장큽니다.");}
			}
		
			else if(num1>num2){
			System.out.println(num1+"가장큽니다.");
			}
			
			else{System.out.println(num2+"가장큽니다.");}
		

		
		/*
		if(num>num1 && num>num2){
			System.out.println(num+"왕");
		}else if(num1>num && num1>num2) {
			System.out.println(num1+"왕");
		}else if(num2>num && num2>num1) {
			System.out.println(num2+"왕");
		}*/


		
		/* 문제7. 2차원 평면에서 직사각형은 
        왼쪽 상단 모서리와 오른쪽 하단 모서리 두점으로 표현한다. 
      (100,100) 과 (200, 200) 의 두점으로 이루어진 사각형이 있을때,
      정수 x, y 값을 입력받고 점(x, y)가 이 직사각형안에 
      있는지 판단하는 프로그램을 작성하세요. 
*/
		

		
		System.out.println("좌표를 입력해주세요");
		Scanner sm = new Scanner(System.in);
		

		int x_po = Integer.parseInt(sm.nextLine());
		int y_po = Integer.parseInt(sm.nextLine());
	

		
		if(x_po<=200 && x_po>=100){
			if(y_po<=200 && y_po>=100) {
				System.out.println("안에 있습니다.");}
				else{System.out.println("안에 없습니다.");}
		}
		    else{
				System.out.println("안에 없습니다.");}		
		
		
		// 선생님 풀이			if(x_po<=200 && x_po>=100&&y_po<=200 && y_po>=100){
		//System.out.println("안에 있습니다.");
		//} else{
		//System.out.println("안에 없습니다.");}		
		
		
		sm.close();
	}

}
