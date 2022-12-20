package day16;

import java.util.ArrayList;
import java.util.Scanner;

/*
	나라와 수도 맞추기 게임을 만들어 보세요. (코드 하나도 없는 문제)
	1) 나라이름(country)과 수도(capital)로 구성된 Nation클래스를 작성하고,
		ArrayList<Nation> 컬렉션을 이용하여 아래 실행 예시와 같이 작동되도록 프로그램을 작성하세요.
	실행예시:
		** 수도 맞추기 게임을 시작합니다 **
		입력:1, 퀴즈:2, 종료:3 >> 1 (사용자가 입력)
		현재 8개의 나라와 수도가 입력되어 있습니다.
		나라와 수도 입력9>> 한국 서울
		나라와 수도 입력10>> 그리스 아테네
		그리스는 이미 있습니다!!
		나라와 수도 입력10>> 호주 시드니
		나라와 수도 입력11>> 이탈리아 로마
		나라와 수도 입력12>> 그만
		입력:1, 퀴즈:2, 종료:3 >> 2
		호수의 수도는? 시드니
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

class CapitalGame {
	Scanner sc = new Scanner(System.in);
	ArrayList<Nation> arr = new ArrayList<Nation>();
	
	public void run () {
		System.out.println("수도 맞추기 게임을 시작합니다.");
		while(true) {
		System.out.println("입력:1, 퀴즈:2, 종료:3 >>");
		int num= Integer.parseInt(sc.nextLine());	
			if(num==3) {System.out.println("종료합니다." ); sc.close(); break;}
			if(num==2) {quiz();}
			if(num==1) {insert();}
			else {System.out.println("잘못된 번호입니다.");}
		}
	}//run
	
	
	public void quiz() {
		
	}	
	public void insert() {
		String name;
		arr.add(new Nation("한국", "서울"));
		arr.add(new Nation("미국", "워싱턴"));
		arr.add(new Nation("중국", "베이징"));
		arr.add(new Nation("우크라이나", "키이우"));
		arr.add(new Nation("일본", "도쿄"));
		arr.add(new Nation("러시아", "소치"));
		arr.add(new Nation("북한", "평양"));
		int n= arr.size();
		System.out.println("현재 7개의 나라와 수도가 입력되어 있습니다.");
		while(true) {
				for(int i = 0 ;i<arr.size() ;i++) {
					Nation na =arr.get(i);
					String sd = na.capital;
					
				}
				
			
				System.out.println("나라와 수도 입력"+n+">>");
				name = sc.nextLine();
				String [] list = name.split(" ");
				String nation = list[0];
				String capital = list[1];
					
		}
	}
	
	
	
}

class Nation{
		String country;
		String capital;
			  Nation(String country, String capital){
				  this.country = country;
				  this.capital = capital;
	  }
}

public class Test11Ex {
	public static void main(String[] args) {
		/*
		CapitalGame game = new CapitalGame();
		game.run();
		*/
	}
}