package day14;

import java.util.Scanner;

public class ClassEx34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개 입력하세요");
		int num = 0;
		int sum = 0;
		for (int i = 0 ;i<3 ;i++) {
			System.out.println(">>");
			try {
			
			 num = sc.nextInt();
			System.out.println(num);
			
			}catch (Exception e) {
					System.out.println("정수가 아닙니다.");
					sc.nextLine();	// 입력받는 버퍼를 비워줘야 한다.
				i--;			// 반복문 이번회차 다시 돌기위해 미리 감소시키기
				continue;		// 아래 출력과 누적합계 코드실행하지말고 바로 for 문 다음단계로 건너뛰어 실행하게 하기
			}
			sum +=num;
			
		}System.out.println("총합: "+ sum);
		}
		
		
		
			
		
		
		
		
		
	}


