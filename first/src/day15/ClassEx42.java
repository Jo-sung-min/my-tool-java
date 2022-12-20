package day15;

class Point {
	int x, y; 
	Point(int x, int y){
		this.x = x; this.y = y; 
	}
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	@Override
	public boolean equals(Object obj) {
		boolean result = false; 
		Point p = null;
		if(obj instanceof Point) { // obj가 들고있는 실제 객체가 Point의 객체라면 
			p = (Point)obj; // 형변환해서 담고 
		}
		if(x == p.x && y == p.y) { // 형변환 한 p와 현재 메서드를 부른 객체와 비교 
			result = true;
		}
		return result;
	}
}

public class ClassEx42 {
	public static void main(String[] args) {

		Point p1 = new Point(1,3); 
		Point p2 = new Point(1,3);
		// 오버라이딩해서 equals는 x,y 좌표 비교로 변경 
		System.out.println(p1.equals(p2)); // 주소 비교 false , 좌표비교 true
		Point p3 = p1; 
		System.out.println(p1.equals(p3)); // 주소 비교 true 
		
		// 객체 주소 비교 
		if(p1 == p2) {
			System.out.println("p1 == p2");
		}
		if(p1 == p3) {
			System.out.println("p1 == p3");
		}
		
	}
	static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		System.out.println(obj);
	}
}
