package day10;

import java.util.Scanner;

/*
	하루 할일을 표현하는 클래스 Day는 다음과 같다. (그대로 사용하기) 
	한달의 할일을 표현하는 MonthSchedule 클래스를 작성하세요. 
	MonthSchedule 클래스에는 Day 객체 배열과 적절한 변수, 메서드를 작성하고
	실행 예시처럼 입력,보기,끝내기 등의 3개의 기능을 작성하세요. 
	-> 생성자, input(), show(), finish() 
	콘솔 실행예시 : 
		이번달 스케쥴 관리 프로그램. 
		할일(입력:1, 보기:2, 끝내기:3) >>   1  (사용자 입력) 
		날짜(1 ~ 31)?   1 
		할일?   자바공부 
		
		할일(입력:1, 보기:2, 끝내기:3) >>   2 
		날짜(1 ~ 31)?   1 
		1일의 할 일은 자바공부입니다.
		
		할일(입력:1, 보기:2, 끝내기:3) >>   3 
		프로그램 종료 
*/
class Day {
	private String work; 
	public void setWork(String work) { this.work = work; }
	public String getWork() { return work; }
	public void show() {
		if(work == null) { System.out.println("없습니다."); }
		else {System.out.println(work + "입니다.");}
	}
}
class MonthSchedule {
	private Day [] days; 
	private Scanner sc;	// 메서드들에서 같이 사용하기 위해 인스턴스로 만듬
	private int dayNum; // 다른 메서드에서 필요하면 사용하기 위해 인스턴스로 만듬.
	
	MonthSchedule(int dayNum) {
		this.dayNum = dayNum; 		// 인스턴스에도 저장
		days = new Day[dayNum]; 	// 방크기 만들기 (빈방) 
		for(int i = 0; i < days.length; i++) { // 방마다 Day 객체 생성해 체우기 
			days[i] = new Day(); 
		}
		sc = new Scanner(System.in);
	}
	void input() { // 입력 
		System.out.print("날짜(1 ~ "+ dayNum +")? ");
		int day = Integer.parseInt(sc.nextLine());
		day--;  // 인덱스번호로 변경 
		if(day < 0 || day > dayNum) {
			System.out.println("날짜를 잘못 입력하셨습니다. 다시 입력해주세요.");
			//input(); // 다시 input() 메서드를 실행할것인지...
			return; //메인메뉴쪽으로 빠져나갈것인지 
		}
		System.out.print("할일 ? ");
		String work = sc.nextLine(); 
		days[day].setWork(work); // 달력 해당 날짜에 할일 저장 
	}
	void show() { // 할일 보기 
		System.out.print("날짜(1 ~ "+ dayNum +")? ");
		int day = Integer.parseInt(sc.nextLine());
		day--;  // 인덱스번호로 변경 
		if(day < 0 || day > dayNum) {
			System.out.println("날짜를 잘못 입력하셨습니다. 다시 입력해주세요.");
			//input(); // 다시 input() 메서드를 실행할것인지...
			return; //메인메뉴쪽으로 빠져나갈것인지 
		}
		System.out.print((day+1) + "일의 할 일은 ");
		days[day].show();
	}
	void finish() { // 끝내기 
		sc.close(); 
		System.out.println("프로그램을 종료합니다.");
	}
	// 달력프로그램 전체 진행시키는 메서드 
	void run() {
		 System.out.println("이번달 스케쥴 관리 프로그램.");
		 
		 while(true) {
			 System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
			 int menu = Integer.parseInt(sc.nextLine());
			 switch(menu) {
				 case 1: input(); break;
				 case 2: show(); break;
				 case 3: finish(); return; // run() 메서드 종료!! 
				 default: System.out.println("메뉴번호를 잘못입력하셨습니다. 다시 입력하세요.");
			 }
		 }
	}
	
}
public class Test94 {
	public static void main(String[] args) {

		// main은 작성 완료! 주석해제하고 실행만 
		MonthSchedule may = new MonthSchedule(31); // 5월달 스케쥴 생성 
		may.run();  
		
	}
}
