package day13;
// 상속, 생성자
/*
 	Point1를 상속받아 색을 가진 점을 나타내는 ColorPoint1 클래스를 작성하세요. 
 	main()메소드 적힌 코드들을 포함하고 아래와 같은 실행결과 출력되게 만드세요. 
 	실행결과:
 		BLACK색의 (0,0)의 점입니다. 
 		RED색의 (5,5)의 점입니다.
*/
class Point1 {
	private int x, y;
	public Point1(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint1 extends Point1{
	private String color= "black" ; 
	
	
	ColorPoint1(){
		super(0,0);
	}
	@Override
		public String toString() {
	
			return "("+getX()+" "+getY()+") 위치의"+color+" 색점";
		}
	
	ColorPoint1(int a , int b){
		super(a,b);
		
	}
	
	
	public void setXY(int a , int b){
		move(a, b);
		
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
}


public class ClassEx23 {
	public static void main(String[] args) {
		
		ColorPoint1 zeroPoint = new ColorPoint1();	// (0,0) 위치의 BLACK 색 점
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint1 cp = new ColorPoint1(10,10);	// (10,10) 위치의 BLACK 색 점
		cp.setXY(5,5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
		
	}
}