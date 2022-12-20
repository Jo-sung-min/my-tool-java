package day07;

import java.util.Scanner;

public class Test64 {
	
	// 문자열의 인덱스 번호를 주면 글자 한개를 char타입으로 꺼내줌
	
	public static void main(String[] args) {
		// 문제4. 4x4의 2차원 배열(총16개방)을 만들고, 
				//		1 ~ 10 까지 범위의 정수를 10개만 
				//		랜덤하게 생성하여 임의의 위치에 저장하세요. 
				//		동일한 정수가 있어도 상관없으나, 
				//		나머지 6개의 숫자는 모두 0으로 만들고 
				//		4x4의 형태로 출력하세요. 
	
		int [] [] arr = new int [4] [4];
		int [] random = new int [10];
		
		for(int i = 0 ; i<arr.length; i++) {
			for(int j = 0 ; j<arr[i].length; j++) {
			           arr[i][j]=0;			
	          	}
		}	
	
		for(int i = 0 ;i<10 ; i++) {
			random[i]=(int)(Math.random()*10)+1;
			}
		for(int i = 0 ;i<10 ; i++) {
			int x = ((int)(Math.random()*4));
			int y = ((int)(Math.random()*4));
				
				if(arr[x][y] != 0) {
					i--;
				}else {
					arr[x][y]=random[i];
				}
		}
		
		for(int i = 0 ; i<arr.length; i++) {
			for(int j = 0 ; j<arr[i].length; j++) {
			           System.out.print(arr[i][j]+" ");			
	          	}System.out.println();
		}	
		
		
		
		
		
	/*
		int [][] board = new int [4][4]; 
		int [] randNum = new int[10];
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = 0; 
			}
		}
		for(int i = 0; i < randNum.length; i++) {
			randNum[i] = (int)(Math.random() * 10) + 1; 
		}
		for(int i = 0; i < randNum.length; i++) {
			int x = (int)(Math.random() * 4); // 행 인덱스 랜덤 
			int y = (int)(Math.random() * 4); // 열 인덱스 랜덤 
			if(board[x][y] != 0) {
				i--; 
			}else {
				board[x][y] = randNum[i]; 
			}
		}
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + "  ");
			}
			System.out.println();
		}
		
		*/
	}

}
