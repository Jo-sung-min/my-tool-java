package day13;
// 상속, 생성자
/*
 	Point2를 상속받아 3차원의 점을  나타내는 Point3D 클래스를 작성하세요. 
 	main()메소드 적힌 코드들을 포함하고 아래와 같은 실행결과 출력되게 만드세요. 
 	실행결과:
		(1,2,3)의 점입니다.
		(1,2,4)의 점입니다. 
		(10,10,3)의 점입니다.
		(100,200,300)의 점입니다.
*/
class Point2 {
	private int x, y;
	public Point2(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}
class Point3D extends Point2 { 
	// [ x, y], getX(), getY(), move()
	private int z; 
	Point3D(int x, int y, int z){
		super(x, y);
		this.z = z; 
	}
	void moveUp() {
		z++; 
	}
	void moveDown() {
		z--; 
	}
	// 오버 로딩!!! 
	void move(int x, int y, int z) {
		move(x, y);
		this.z = z; 
	}
	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + "," + z + ")의 점";
	}
	
}

public class ClassEx24 {
	public static void main(String[] args) {
		
		Point3D p = new Point3D(1,2,3);		// 1,2,3은 각각 x,y,z축의 값.
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp();		// z 축으로 위쪽 이동
		System.out.println(p.toString() + "입니다.");
		
		p.moveDown();	// z 축으로 아래쪽 이동
		p.move(10, 10);	// x,y 축으로 이동
		System.out.println(p.toString() + "입니다.");
		
		p.move(100,200,300);	// z, y, z 축으로 이동
		System.out.println(p.toString() + "입니다.");
		
	}
}