package day10;
/*
	직사각형을 표현하는 Rectangle 클래스를 작성하세요. 
	v- int 타입의 x, y, width, height 변수 : 사각형을 구성하는 점과 크기 정보 
		x,y는 사각형 왼쪽 위 점의 좌표를 말함. 
		0,0은 왼쪽 위, x는 오른쪽으로 늘어나고 y는 밑으로 늘어난다. 
	v- x, y, width, height 값을 매개변수로 받아 변수를 초기화 하는 생성자 
	- int squareArea()	: 사각형의 너비를 리턴 
	- void show()		: 사각형의 좌표와 가로세로 출력 
	- boolean contains(Rectangle r) : 매개변수로 받은 r이 현 사각형 안에 있으면 true리턴 
	- 콘솔 출력 결과 :
		(2,2)에서 크기가 8x7인 사각형 
		b의 면적은 36
		c는 a를 포함합니다. 
*/
class Rectangle{
	int x, y; 
	int width, height; 
	Rectangle(int x, int y, int width, int height) {
		this.x = x; this.y = y; 
		this.width = width; this.height = height;
	}
	int squareArea() {
		return width * height;
	}
	void show() {
		System.out.println("("+ x +","+ y +")에서 크기가 " +width+"x"+ height +"인 사각형");
	}
	boolean contains(Rectangle r) {
		if(x < r.x && y < r.y && (x + width) > (r.x + r.width) && (y + height) > (r.y + r.height)) {
			return true;
		}
		return false;
	}
}
public class Test92 {
	public static void main(String[] args) {

		// main은 작성 완료. 주석해제해서 실행 
		Rectangle a = new Rectangle(2,2,8,7);  // x, y, width, height
		Rectangle b = new Rectangle(5,5,6,6); 
		Rectangle c = new Rectangle(1,1,10,10); 
		
		a.show(); 
		System.out.println("b의 면적은 " + b.squareArea());
		if(c.contains(a)) { System.out.println("c는 a를 포함합니다."); }
		if(c.contains(b)) { System.out.println("c는 b를 포함합니다."); }
		
		
		
	}
}
