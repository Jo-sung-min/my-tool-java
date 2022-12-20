package day16;

import java.util.ArrayList;
import java.util.Scanner;

/*
	나라와 수도 맞추기 게임을 만들어 보세요. 
	1) 나라이름(country)과 수도(capital)로 구성된 Nation클래스를 작성하고,
		ArrayList<Nation> 컬렉션을 이용하여 
		아래 실행 예시와 같이 작동되도록 프로그램을 작성하세요.
		
	실행예시:
		** 수도 맞추기 게임을 시작합니다 **
		입력:1, 퀴즈:2, 종료:3 >> 1 (사용자가 입력)
		
		현재 8개의 나라와 수도가 입력되어 있습니다. (input())
		나라와 수도 입력9>> 한국 서울
		나라와 수도 입력10>> 그리스 아테네
		그리스는 이미 있습니다!!
		나라와 수도 입력10>> 호주 시드니
		나라와 수도 입력11>> 이탈리아 로마
		나라와 수도 입력12>> 그만
		
		입력:1, 퀴즈:2, 종료:3 >> 2
		
		호수의 수도는? 시드니 (quiz())
		정답!!
		독일의 수도는? 하얼빈
		아닙니다!!
		멕시코의 수도는? 하얼빈
		아닙니다!!
		이탈리아의 수도는? 로마
		정답!!
		한국의 수도는? 서울
		정답!!
		영국의 수도는? 그만
		
		입력:1, 퀴즈:2, 종료:3 >> 3
		게임을 종료합니다.
*/
class Nation {
	private String country;
	private String capital;
	Nation(String country, String capital){
		this.country = country; this.capital = capital;
	}
	public String getCountry() {
		return country;
	}
	public String getCapital() {
		return capital;
	}
}
class CapitalGame {
	Scanner sc; 			//       0						1 .....
	ArrayList<Nation> list; // [N(멕시코, 멕시코시티), N(스페인, 마드리드)...]
	
	CapitalGame() {
		sc = new Scanner(System.in);
		list = new ArrayList<Nation>();
		// 나라 정보 초기값으로 미리 추가 
		list.add(new Nation("멕시코", "멕시코시티"));
		list.add(new Nation("스페인", "마드리드"));
		list.add(new Nation("프랑스", "파리"));
		list.add(new Nation("영국", "런던"));
		list.add(new Nation("이탈리아", "로마"));
		list.add(new Nation("그리스", "아테네"));
		list.add(new Nation("중국", "베이징"));
		list.add(new Nation("우크라이나", "키이우"));
	}// 생성자
	
	void input() {
		int n = list.size(); // 8
		System.out.println("현재 "+ n +"개의 나라와 수도가 입력되어 있습니다.");

		while(true) {
			n++; 
			System.out.print("나라와 수도 입력" + n + ">> ");
			String txt = sc.nextLine(); 
			if(txt.equals("그만")) {
				break; // while true 종료 
			}
			String[] split = txt.split(" ");
			String country = split[0]; // 나라이름 
			String capital = split[1]; // 수도 
			// 나라가 존재하는지 체크 -> 메서드 
			if(isExists(country)) { // true 리턴받았을 경우 
				// 있으면 예외 메세지 
				System.out.println(country + "는 이미 있습니다!");
				n--; 
			}else { // false 리턴받았을 경우 
				// 없으면 list에 Nation으로 객체 만들어 추가 
				list.add(new Nation(country, capital));
			}
		}// while
	}// input()
	private boolean isExists(String country) {
		boolean result = false; // 마지막에 리턴해줄 결과 변수 미리 선언 
		
		// 리스트 저장된 개수만큼 전체 돌면서 나라이름 같은지 결과 리턴  
		for(int i = 0; i < list.size(); i++) {
			Nation nation = list.get(i);
			String ctr = nation.getCountry(); // 이미 저장된 나라이름 하나 꺼냄 
			if(ctr.equals(country)) {
				result = true; 
				break; // 한번 걸리면 나머지는 안돌아도 ok 
			}
		}
		return result; // 최종 boolean변수에 남은 결과 리턴 
	}
	void quiz() {
		// 반복해서 문제내고 (그만을 입력할때까지) 
		while(true) {
			//	 문제는 랜덤으로 뽑아서 내보자 (중복 문제는 무시) 
			// 	 문제를 내려면 list에서 나라하나 뽑아야되고 -> list.get(인덱스);
			//		=> 인덱스 번호를 랜덤으로 하나 받아서 
			//			범위 : 0 ~ 마지막 방번호 (list.size()-1)
			int index = (int)(Math.random() * list.size()); // 0 ~ 9 = 10 0 ~ 5 = 6 
			Nation nation = list.get(index); // country=나라이름, capital=수도
			//	  ->나라 뽑은거에서 나라이름 검색해서 문제로 내고 
			String question = nation.getCountry(); 
			String answer = nation.getCapital(); 
			System.out.print(question + "의 수도는?"); // 문제 지문
			String capAsw = sc.nextLine(); // 정답받기 
			// 그만을 입력했는지 먼저 체크
			if(capAsw.equals("그만")) {
				break; // while문 종료! 
			}
			//	  ->나라 뽑은거와 수도이름이 같은지 체크 
			if(capAsw.equals(answer)) {
				// 맞으면 정답!! 
				System.out.println("정답!!");
			}else {
				// 틀리면 틀렸다고 출력 
				System.out.println("아닙니다!!!!!");
			}
		}
	}// quiz() 
	
	// main 대신 전체 프로그램을 돌려주는 메서드 
	void run() {
		System.out.println("** 수도 맞추기 게임을 시작합니다 **");
		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3 >> ");
			int menu = Integer.parseInt(sc.nextLine());
			if(menu == 1) { // 입력
				input(); 
			}else if(menu == 2) { // 퀴즈 
				quiz(); 
			}else if(menu == 3) {
				System.out.println("게임을 종료합니다.");
				sc.close();
				break;
			}else {
				System.out.println("메뉴 번호 오류... 다시 입력해보세요.");
			}			
		}//while
	}//run()
}

public class Test11Ex {
	public static void main(String[] args) {
		
		CapitalGame game = new CapitalGame();
		game.run();
		
	}
}