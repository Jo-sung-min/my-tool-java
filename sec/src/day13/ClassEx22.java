package day13;
// 상속, 생성자
/*
 	Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하세요. 
 	main()메소드 적힌 코드들을 포함하고 아래와 같은 실행결과 출력되게 만드세요. 
 	실행결과:
 		RED색의 (10,20)의 점입니다.
*/
class Point {
	private int x, y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}
class ColorPoint extends Point { // [ x, y ], getX(), getY(), move()
	private String color; 
	ColorPoint(int x, int y, String color) {
		super(x, y); 
		this.color = color;
	}
	void setXY(int x, int y) {
		move(x, y);	// x,y가 private이라 접근 불가, 부모가 가진 메서드 이용해서 값변경 
	}
	void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return color + "색의 (" + getX() +","+ getY() + ")의 점";
	}
}

public class ClassEx22 {
	public static void main(String[] args) {

		ColorPoint cp = new ColorPoint(5, 5, "Yellow");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str+"입니다.");
	}
}