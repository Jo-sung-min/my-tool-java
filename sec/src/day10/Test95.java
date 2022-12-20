package day10;

import java.util.Scanner;

/*
	콘서트 예약 프로그램 
	- 공연은 하루만 예약 
	- 좌석은 S석, A석, B석으로 나뉘며, 각 10개의 좌석이 있다. 
	- 예약 시스템의 메뉴는 "예약", "조회", "취소", "끝내기" 가 있다. 
	- 예약은 한자리만 가능하고, 좌석타입, 예약자이름, 좌석번호를 입력받아 예약한다. 
	- 조회는 모든 좌석을 출력한다. 
	- 취소는 예약자의 이름을 입력받아 취소한다. 
	- 없는이름, 없는메뉴번호, 없는좌석번호 등 예외가 발생할것들을 미리 처리
		-> 오류 메세지 출력하고 사용자가 다시 시도하도록 한다. 
	실행 예시 : 
		자바콘서트홀 예약시스템입니다. 
		예약:1, 조회:2, 취소:3, 끝내기4 >>   1 
		좌석구분 S(1), A(2), B(3) >>  1 
		S >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
		이름 >>   피카츄 
		번호 >>   1 
		<<예약 완료>>
		
		예약:1, 조회:2, 취소:3, 끝내기4 >>   1 
		좌석구분 S(1), A(2), B(3) >>  2 
		A >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
		이름 >>   꼬북이 
		번호 >>   5 
		<<예약 완료>>
		
		예약:1, 조회:2, 취소:3, 끝내기4 >>   2 
		S >> 피카츄 ___ ___ ___ ___ ___ ___ ___ ___ ___
		A >> ___ ___ ___ ___ 꼬북이 ___ ___ ___ ___ ___
		B >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
		<<조회 완료>>
		
		예약:1, 조회:2, 취소:3, 끝내기4 >>   3 
		좌석구분 S(1), A(2), B(3) >>  2 
		A >> ___ ___ ___ ___ 꼬북이 ___ ___ ___ ___ ___
		이름 >>  꼬북이 
		<<취소 완료>>
		
		예약:1, 조회:2, 취소:3, 끝내기4 >>   2 
		S >> 피카츄 ___ ___ ___ ___ ___ ___ ___ ___ ___
		A >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
		B >> ___ ___ ___ ___ ___ ___ ___ ___ ___ ___
		<<조회 완료>>
		
		예약:1, 조회:2, 취소:3, 끝내기4 >>   4
		<<프로그램 종료>>
*/
class Seat { // 좌석 한개 정보 담을 클래스 
	private String name = "___"; 
	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
}

class Booking { // 예약 프로그램 
	private Scanner sc; 
	private Seat[] seatS = new Seat[10]; 
	private Seat[] seatA = new Seat[10];
	private Seat[] seatB = new Seat[10]; 
	
	Booking() {
		sc = new Scanner(System.in); // Scanner 객체생성해서 사용가능하게 준비 세팅
		for(int i = 0; i < seatS.length; i++) {
			seatS[i] = new Seat(); 
		}
		for(int i = 0; i < seatA.length; i++) {
			seatA[i] = new Seat(); 
		}
		for(int i = 0; i < seatB.length; i++) {
			seatB[i] = new Seat(); 
		}
	}
	
	void showSeats(int sel) {
		if(sel == 1) {
			System.out.print("S >> ");
			for(int i = 0; i < seatS.length; i++) { 
				System.out.print(seatS[i].getName() + "  ");
			}
			System.out.println();
		}else if(sel == 2) {
			System.out.print("A >> ");
			for(int i = 0; i < seatA.length; i++) { 
				System.out.print(seatA[i].getName() + "  ");
			}
			System.out.println();
		}else if(sel == 3) {
			System.out.print("B >> ");
			for(int i = 0; i < seatB.length; i++) { 
				System.out.print(seatB[i].getName() + "  ");
			}
			System.out.println();
		}
	}
	void book() {
		System.out.print("좌석구분 S(1), A(2), B(3) >> ");
		int sel = Integer.parseInt(sc.nextLine());
		showSeats(sel); // 해당 좌석 출력해라 
		System.out.print("이름 >> ");
		String name = sc.nextLine(); 
		System.out.print("번호 >> ");
		int seatNum = Integer.parseInt(sc.nextLine());
		// 좌석 구역 선택한것에 따라 맞는 배열에 저장 
		if(sel == 1) seatS[seatNum-1].setName(name);
		else if(sel == 2) seatA[seatNum-1].setName(name);
		else if(sel == 3) seatB[seatNum-1].setName(name);
		System.out.println("<<예약 완료>>");
	}
	void search() {
		showSeats(1);
		showSeats(2);
		showSeats(3);
		System.out.println("<<조회 완료>>");
	}
	/*
		좌석구분 S(1), A(2), B(3) >>  2 
		A >> ___ ___ ___ ___ 꼬북이 ___ ___ ___ ___ ___
		이름 >>  꼬북이 
		<<취소 완료>>
	 */
	void cancel() {
		System.out.print("좌석구분 S(1), A(2), B(3) >> ");
		int sel = Integer.parseInt(sc.nextLine());
		showSeats(sel); // 해당 좌석 출력해라 
		System.out.print("이름 >> ");
		String name = sc.nextLine(); 
		if(sel == 1) {
			for(int i = 0; i < seatS.length; i++) {
				if(seatS[i].getName().equals(name)) {
					seatS[i].setName("___");
				}
			}
		}else if(sel == 2) {
			for(int i = 0; i < seatA.length; i++) {
				if(seatA[i].getName().equals(name)) {
					seatA[i].setName("___");
				}
			}
		}else if(sel == 3) {
			for(int i = 0; i < seatB.length; i++) {
				if(seatB[i].getName().equals(name)) {
					seatB[i].setName("___");
				}
			}
		}
	}

	void run() {
		System.out.println("자바콘서트홀 예약시스템입니다.");
		while(true) {
			// 반복해서 메뉴 번호 입력받고,
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기4 >> ");
			int menu = Integer.parseInt(sc.nextLine());
			if(menu == 1) { book(); }
			else if(menu == 2) { search(); }
			else if(menu == 3) { cancel(); }
			else if(menu == 4) {
				System.out.println("예약 프로그램 종료!!");
				sc.close();
				break;
			}
			else {
				System.out.println("메뉴 선택 오류!! 다시 입력하세요...");
			}
			// 번호에 해당하는 처리 메서드 호출 
		}// while
	}// run
}// Booking

public class Test95 {
	public static void main(String[] args) {

		Booking book = new Booking(); 
		book.run();
		
	}
}
