package day06;

import java.util.Scanner;

public class Test56 {

	public static void main(String[] args) {
		/* Up & Down 게임 
		0 ~ 99 사이의 임의의 수를 받아 (사용자로부터) 숨기고, 그수를 맞추는 게임. 
		임의의 수보다 낮게 입력하면 "Up" 출력, 
		높게 입력하면 "Down" 출력하면서 범위 좁혀가며 수를 맞춘다. 
		게임을 반복하기 위해 y/n묻고, n 입력시 프로그램 종료. 
		콘솔예시) 
		숫자가 정해졌습니다. 맞춰보세요! 
		
		0 ~ 99 
		1 >>  55   (사용자 입력) 
		"Up"
		
		55 ~ 99 '
		2 >>  70
		"Up"
		
		70 ~ 99 
		3 >>  85
		"Down"
		
		70 ~ 85 
		4 >>  80
		"Down"
		
		70 ~ 80
		5 >>  75
		"Up"
		
		75 ~ 80
		6 >>  77
		맞았습니다.
		 
		다시 하시겠습니까?(y/n) >>  y  
		
		숫자가 정해졌습니다. 맞춰보세요! 
		0 ~ 99 
		1 >>  30    
		"Up"
		30 ~ 99 
		2 >>  45
		맞았습니다. 
		다시 하시겠습니까?(y/n) >>  n 
		게임 종료!!  
*/
		int num = 0;
		int min = 0;
		int max = 99;
		int count = 1;
		int ran = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		boolean game = true; 
		
		while(game) { // 무한 반복문
			
		System.out.println("숫자를 입력해 주세요");
		System.out.println(min+"~"+max);
		num = Integer.parseInt(sc.nextLine());
		while(true) {
		if(num<ran) {
			min=num;
			System.out.println(min+"~"+max);
			System.out.println(count+">>"+num);
			System.out.println("Up");
		}else if(num>ran) {
			max=num;
			System.out.println(min+"~"+max);
			System.out.println(count+">>"+num);
			System.out.println("Down");
		}else if (num==ran) {
			System.out.println("맞았습니다");
			System.out.println("다시하시겠습니까? y/n");
			System.out.println(sc.nextLine().charAt(0));  
			if(sc.nextLine().charAt(0)=='n') {
				System.out.println("게임종료!!");
				game = false;
			}else if(sc.nextLine().charAt(0)=='y') {
				
			}
		}
		}
		
		}
		
		
		
		
		sc.close();
	}

}
