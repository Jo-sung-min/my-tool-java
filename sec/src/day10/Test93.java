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
	// 캡슐화 
	private String name;	// 플레이어 이름 
	private String word;	// 이 플레이어가 입력한 단어 저장해놓을 변수 
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	String getWordFromUser(Scanner sc) {
		System.out.print(name + " >> ");
		word = sc.nextLine(); 
		return word;
	}
	boolean checkSuccess(String lastWord) { // 맞았는지 체크 : 방금입력한단어, 이전단어 
		boolean check = false; 
		// lastWord 끝 글자 찾기 
		int lastIdx = lastWord.length() - 1;  // 마지막 글자의 인덱스번호 찾기
		char lastChar = lastWord.charAt(lastIdx); // 마지막글자 꺼내오기
		// 입력한 word의 첫글자 찾기 
		char firstChar = word.charAt(0);
		// 두개비교 
		if(lastChar == firstChar) { // 두개가 같으면 
			check = true; // 결과 true로 변경
		}
		return check; // 결과 담고있는 변수의 값 리턴 
	}
}
class WordGameApp {
	Player[] p = null; 	// 플레이어들을 객체로 생성해서 저장시켜놓을 배열변수
	Scanner sc; 
	
	WordGameApp() {
		sc = new Scanner(System.in);
	}
	
	// 참가인원 세팅 
	void setPlayers() {
		System.out.print("게임에 참가하는 인원 >> ");
		int num = Integer.parseInt(sc.nextLine()); 
		p = new Player[num];	// 참가인원수 만큼 방크기 만들기 (빈방)
		for(int i = 0; i < p.length; i++) { // 방크기 만큼 반복 
			// Player 객체생성해, 
			p[i] = new Player(); 
			// 참가자 이름 입력받아, 해당 배열안 객체에 바로 이름 저장
			System.out.print("이름 >> ");
			p[i].setName(sc.nextLine()); 
		}
	}
	// 게임을 전체적으로 진행시킬 메서드 
	void run() {
		System.out.println("끝말잇기 게임시작!!!");
		setPlayers();
		// 게임 진행 
		String lastWord = "자동차";
		System.out.println("시작 단어는 " + lastWord + "입니다.");
		int idx = 0; // while 안에서 인덱스번호 처럼 사용할 변수 
		while(true) {
			// 단어 입력받고 
			String newWord = p[idx].getWordFromUser(sc);
			// 맞았는지 검사 -> 맞으면 계속 돌고, 틀리면 누가 졌는지 출력하고while 종료! 
			boolean result = p[idx].checkSuccess(lastWord);
			if(!result) {
				System.out.println("게임오버!!" + p[idx].getName() + "님이 졌습니다.");
				sc.close(); // 더이상 입력받을거 없을때 닫아주기 
				break;
			}
			idx++; 
			idx %= p.length; 
			// 다음 회차를 위해 lastWord를 방금 입력받은 단어로 변경
			lastWord = newWord; 
		}
	}
}
public class Test93 {
	public static void main(String[] args) {
		// main 작성 완료!! 
		WordGameApp game = new WordGameApp(); 
		game.run(); 
		
	}
}
