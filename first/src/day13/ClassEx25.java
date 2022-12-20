package day13;
// 상속, 생성자
/*
 	Point3를 상속받아 양수의 공간에서만 점을 나타내는 PositivePoint 클래스를 작성하세요. 
 	main()메소드 적힌 코드들을 포함하고 아래와 같은 실행결과 출력되게 만드세요. 
 	실행결과:
		(10,10)의 점입니다.
		(10,10)의 점입니다.
		(0,0)의 점입니다.
*/
class Point3 {
	private int x, y;
	public Point3(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class PositivePoint extends Point3{
	int x;
	int y;
	
	PositivePoint(){
		super(0,0);
		
	}
		@Override
			public String toString() {
				if(getX()>0&&getY()>0) {
						x=getX();
						y=getY();
					return "("+getX()+" "+getY()+")"+"의점";
				} 
				return  x+" "+y ;
			}
		
	PositivePoint(int a , int b){
		super(a,b);
	}
		
		
}
public class ClassEx25 {
	public static void main(String[] args) {
		
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, 5);		// 객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p.toString() + "입니다.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
		
	}
}