package day13;

import java.util.Scanner;

// 추상클래스
/*
	텍스트로 입출력하는 간단한 그래픽 편집기 만들기. 
	아래 추상클래스 ShapeAbst를 상속받은 Line, Rect, Circle 클래스를 만들고, 
	실행 예시처럼 "삽입", "삭제", "모두보기", "종료"의 4가지 그래픽 편집 기능을 가진 
	클래스 GraphicEditor를 작성하세요.
	실행예시 : 
		그래픽 에디터를 실행합니다. 원하는 기능의 번호를 눌러주세요.
		1.삽입  2.삭제  3.모두보기  4.종료 >>  1 (사용자 입력)
		1.Line  2.Rect  3.Circle >>  2
		1.삽입  2.삭제  3.모두보기  4.종료 >>  1
		1.Line  2.Rect  3.Circle >>  3
		1.삽입  2.삭제  3.모두보기  4.종료 >>  3
		Rect
		Circle
		1.삽입  2.삭제  3.모두보기  4.종료 >>  2
		삭제할 도형의 위치 >> 3
		삭제할 수 없습니다.
		1.삽입  2.삭제  3.모두보기  4.종료 >>  4
		에디터를 종료합니다.
*/
abstract class ShapeAbst {
	private ShapeAbst next;
	public ShapeAbst() { next = null; }
	public void setNext(ShapeAbst obj) { next = obj; }	// 링크 연결
	public ShapeAbst getNext() { return next; }
	abstract public void draw();						// 추상메서드 : 도형이름 출력하는 기능을 갖고 있다.
}
class GraphicEditor{
	private Scanner sc; 
	private ShapeAbst start, last, tmp, s; 
	private int count; // 도형 개수 저장 
	
	GraphicEditor() {
		sc = new Scanner(System.in);
		count = 0; 
	}
	void insert() {
		System.out.print("1.Line  2.Rect  3.Circle >> ");
		int sel = Integer.parseInt(sc.nextLine());
		if(start == null) { // 도형 처음 추가 
			if(sel == 1) { start = new Line(); last = start; }
			else if(sel == 2) { start = new Rect(); last = start; }
			else if(sel == 3) { start = new Circle(); last = start; }
			else { System.out.println("잘못된 도형 선택...."); return; }
		}else { // 이미 추가된거 뒤에 추가 
			if(sel == 1) { tmp = new Line(); last.setNext(tmp); last = tmp;}
			else if(sel == 2) { tmp = new Rect(); last.setNext(tmp); last = tmp;}
			else if(sel == 3) { tmp = new Circle(); last.setNext(tmp); last = tmp;}
			else { System.out.println("잘못된 도형 선택...."); return; }
		}
		count++; 
		System.out.println("count : " + count);
	}
	void remove() {
		ShapeAbst lastTmp = null;
		System.out.print("삭제할 도형의 위치 >> ");
		int sel = Integer.parseInt(sc.nextLine());
		if(sel > count) {
			System.out.println("삭제할 수 없습니다.");
		}else {
			s = start; 				// 시작점 잡기 
			lastTmp = start;		// 이전 도형 임시로 복사 
			int i = 1; 				// 도형 번호 
			while(s != null) {
				if(sel == 1) {		// 첫번째 도형 삭제 
					if(s.getNext() != null) { // 뒤에 뭐가 있다 
						start = s.getNext(); // 다음도형이 start가 되고 
						start.setNext(s.getNext().getNext());
					}else { // 첫도형뒤에 아무것도 없다! 
						last = null; start = null;
					}
					break;
				}else if(sel == i) { // 첫번째가 아닌 도형 삭제 
					lastTmp.setNext(s.getNext());
					if(s.getNext() == null) { // 현재도형이 마지막 도형이면
						last = lastTmp;	// 마지막도형 들고있는것을 이전거로 바꾸기
					}
					break;
				}
				lastTmp = s;		// 루프를 돌면서 현재 도형을 이전도형으로 변경 
				s = s.getNext();	// 다음 도형이 현재 도형이 되게 
				i++; 				// 도형 순서값 올리기 
			}//while
		}// else
	}
	void show() {
		if(start == null) {
			System.out.println("그린 도형이 없습니다.");
		}else {
			s = start; 
			while(s != null) {
				s.draw();
				s = s.getNext(); 
			}
		}
	}
	void run() {
		System.out.println("그래픽 에디터를 실행합니다. 원하는 기능의 번호를 눌러주세요.");
		while(true) {
			System.out.print("1.삽입  2.삭제  3.모두보기  4.종료 >> ");
			int sel = Integer.parseInt(sc.nextLine());
			if(sel == 1) {
				insert(); 
			}else if(sel == 2) {
				remove(); 
			}else if(sel == 3) {
				show(); 
			}else if(sel == 4) {
				System.out.println("에디터를 종료합니다.");
				break; 
			}else {
				System.out.println("잘못된 메뉴 번호.. 다시 눌러주세요.");
			}
		}//while
	}//run
}
class Line extends ShapeAbst { // (next), setNext(), getNext(), @draw();
	@Override
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends ShapeAbst {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends ShapeAbst {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}
public class ClassEx28 {
	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor(); 
		ge.run(); 
	}
}