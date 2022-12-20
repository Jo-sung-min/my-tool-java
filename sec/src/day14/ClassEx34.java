package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassEx34 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력하세요.");
		int sum = 0; 
		int num = 0; // try안에 선언하면 try안에서만 사용가능해짐. 밖에서 사용불가.
		for(int i = 0; i < 3; i++) {
			System.out.print(">> ");
			try {
				num = sc.nextInt();  // InputMismatchException
			}catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다.");
				sc.nextLine(); 		// nextInt()로 입력받았는데 문제가 있어서 
				//입력받는 버퍼를 비워줘야한다. 
				i--;			// 반복문 이번회차 다시 돌기위해 미리 감소시키기 
				continue;		// 아래 출력과 누적합계 코드실행하지말고 
				//	바로 for문 다음단계로 건너뛰어 실행하게 하기
			}
			System.out.println(num);
			sum += num;
		}
		System.out.println("총 합 : " + sum);
		
		sc.close();
		
		/*
		int number = 100; 
		int result = 0; 
		for(int i = 0; i < 10; i++) {
			try {
				result = number / (int)(Math.random() * 10); 
				System.out.println(result);
			}catch(ArithmeticException e) {
				System.out.println("0 발생!!!!");
			}
		}*/
		
		
	}
}
