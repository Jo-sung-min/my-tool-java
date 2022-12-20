package day06;

import java.util.Scanner;

public class Test54 {
	public static void main(String[] args) {

		// 문제1. 아래와같이 2차원 배열 arr을 출력하는 프로그램을 작성하세요. 
		/*
			1
			1 2 3
			1
			1 2 3 4
			1 2 
		*/
		/*
		String str = "hello";
		// 문자열의 인덱스 번호를 주면 글자 한개를 char타입으로 꺼내줌
		char ch = str.charAt(1); 
		System.out.println(ch);
		*/
		// 문제2. Scanner로 소문자 알파벳 하나 입력받고, 
		//		아래와 같이 출력하는 프로그램을 작성하세요. 
		/*
			소문자 알파벳 하나를 입력하세요 >>    f  <- 콘솔에 입력 
			abcdef
			abcde
			abcd
			abc
			ab
			a
		
		Scanner sc = new Scanner(System.in);
		System.out.println("소문자 알파벳 하나를 입력하세요 >>");
		// 문자열 입력받기 
		String input = sc.nextLine();  
		// 문자열 0번인덱스에 있는 글자 한개 char타입으로 꺼내기
		char ch = input.charAt(0);  
		for(int i = ch; i >= 97; i--) {
			for(int j = 97; j <= i; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
		sc.close(); */
		// 문제3. 양의 정수 10개를 입력받아 배열에 저장하고, 
		//		 3의 배수만 출력하는 프로그램을 작성하세요. 
		
		
		// 문제4. 4x4의 2차원 배열(총16개방)을 만들고, 
		//		1 ~ 10 까지 범위의 정수를 10개만 
		//		랜덤하게 생성하여 임의의 위치에 저장하세요. 
		//		동일한 정수가 있어도 상관없으나, 
		//		나머지 6개의 숫자는 모두 0으로 만들고 
		//		4x4의 형태로 출력하세요. 
		/*
			출력예시)
			3	0	7	2
			0	9	1	4
			2	4	0	5
			0	8	0	0
		*/
		int [][] board = new int [4][4]; 
		int [] randNum = new int[10];
		// board 판 모두 0으로 초기화 
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = 0; 
			}
		}
		// 10개 랜덤 뽑아서 randNum 저장 
		for(int i = 0; i < randNum.length; i++) {
			randNum[i] = (int)(Math.random() * 10) + 1; 
		}
		// 10개 랜덤을 board에 넣어야 하니
		// 반복문 10번만 돌려서 board에 대입 
		//int count = 0; 
		for(int i = 0; i < randNum.length; i++) {
			// board안, 임의의 위치에 대입시켜야하니 
			// board의 위치를 가르키는 행,열 인덱스 번호 두개 
			// 임의의 숫자가 필요 
			// 행 : 0 ~ 3 열 : 0 ~ 3
			int x = (int)(Math.random() * 4); // 행 인덱스 랜덤 
			int y = (int)(Math.random() * 4); // 열 인덱스 랜덤 
			// 중복체크 : 같은 자리가 다시 뽑히면 안된다. 
			if(board[x][y] != 0) {
				//System.out.println("자리 중복!!! ");
				//count++; 
				i--; 
			}else {
				board[x][y] = randNum[i]; 
			}
		}
		//System.out.println("중복횟수 : " + count);

		// board 출력 
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + "  ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
