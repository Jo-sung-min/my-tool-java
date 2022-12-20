package day06;

import java.util.Scanner;

public class Test55 {
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
		Scanner sc = new Scanner(System.in);
		// 게임 전체를 돌리는 반복문 (한판~ 두판~ 세판~) 
		boolean play = true; // 게임을 다시 돌릴지 안돌릴지 정해줄 변수 
		
		while(play) {
			int num = (int)(Math.random() * 100); // 맞춰야되는 랜덤값 
			int count = 1;  	// 입력 회차 
			int guess = -1; 	// 사용자가 입력한 수 저장해둘 변수 
			int low = 0; 		// 낮은 범위값 들고 있을 변수 
			int high = 99; 		// 높은 범위값 들고 있을 변수 
			
			System.out.println("숫자가 정해졌습니다. 맞춰보세요!"); 			
			while(true) {
				// 입력한값과 랜덤값 num이 같을 경우 
				if(guess == num) {
					System.out.println("맞았습니다.");
					System.out.println("다시 하시겠습니까?(y/n) >>");
					String answer = sc.nextLine();
					if(answer.equalsIgnoreCase("n")) {
						System.out.println("게임종료!");
						play = false; // 겉에 while문 반복을 판단하는 값 false 바꾸기 
						// 다음 크게 돌때 검사하러가면 false라서 종료된다!! 
						break; // 숫자 계속 입력받고 검사하는 안쪽 while문 빠져나가기
					}else if(answer.equalsIgnoreCase("y")) {
						break; // 숫자 계속 입력받고 검사하는 안쪽 while문 빠져나가기
					}else {
						System.out.println("잘못 입력하셨습니다.");
						continue;
					}
				}
			
				
				System.out.println(low + " ~ " + high);
				System.out.print(count + " >> ");
				guess = Integer.parseInt(sc.nextLine());
				count++; 
				
				if(guess < num) {
					System.out.println("Up");
					low = guess;
				}
				if(guess > num) {
					System.out.println("Down");
					high = guess;
				}
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
