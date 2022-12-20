package day10;

import java.util.Scanner;

/*
	n명이 참가하는 끝말잇기 게임을 만들어보자. 
	처음단어는 "자동차"이다. 
	몇명(n)이 참가하는지 입력받고, n명의 참가자들은 순서대로 자신의 단어를 입력하면된다. 
	끝말잇기에서 틀리면 게임오버 -> 진사람 이름 출력하고 프로그램 종료. 
	WordGameApp 클래스와 각 선수를 나타내는 Player 클래스로 구성하세요. 
	WordGameApp : 게임을 전체적으로 진행하는 run() 메서드, 
				run()에서 플레이어 수만큼 Player 객체 배열 생성 
	Player : 플레이어 이름 저장, 단어 입력받는 getWordFromUser()메서드, 
			끝말잇기 성공여부와 게임계속할지 판별하는 checkSuccess() 메서드 
	# 힌트 
		* 문자열 첫번째 문자 알아내는 방법 
			String word = "자동차"; 
			char ch = word.charAt(0); 
		* 문자열의 길이 알아내는 방법 
			word.length(); --> 3 
*/
class Player {
	private String player ;
	private String word ;
	Scanner sc ;
	public String get() {
		return player;
	}
	boolean result;
	public void setPlayer(String player){
		this.player = player;}
	
	public String getWordFromUser(Scanner sc) {
		System.out.println(player+">>>");
		word = sc.nextLine();
		return word;
	}
	
	boolean checkSuccess(String lastWord) {
		boolean result;
		if(this.word.charAt(this.word.length())!=word.charAt(0)) {
			System.out.println("게임에서 지셨습니다.");
			result = false;
			sc.close();
			return result;
			
		}else {
			System.out.println("성공하셨습니다 다음 단어를 입력해 주세요");
			result = true;
		}return result;
	}
	
	
	
}

class WordGameApp {
	Player [] p = null;
	Scanner sc;
	int num ;
	 WordGameApp() {
		 sc = new Scanner(System.in);
		}
	 
	 void run(){
		 System.out.println("게임을 시작합니다.");
		 System.out.println("시작인원수를 입력해 주세요");
		 num = Integer.parseInt(sc.nextLine());
		 	p = new Player [num];  
		 for(int i = 0 ; i<num ;i++) {
			 p[i] = new Player();
			 System.out.println("이름을 입력해 주세요");
			 p[i].setPlayer(sc.nextLine());
		 }
		 int Idx = 0 ;
		 String firstWord = "김치전";
		 System.out.println("첫번째 단어는 김치전 입니다.");
		 while(true) {
			String newWord = p[Idx].getWordFromUser(sc);
			boolean result = p[Idx].checkSuccess(firstWord);
			if(!result) {
				System.out.println("게임오버"+ p[Idx].get()+"님이 졌습니다.");
				sc.close();
			}
			System.out.println("성공");
			Idx++; 
			Idx %= p.length; 
			// 다음 회차를 위해 lastWord를 방금 입력받은 단어로 변경
			firstWord = newWord; 
		 }	 
		 
	 }
	}
	 
public class Test93 {
	public static void main(String[] args) {
		WordGameApp game = new WordGameApp();
		game.run();
		
	}
}
