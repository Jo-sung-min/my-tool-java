package day12;

// 오버라이딩 다형성 
class ShapeClass {
	ShapeClass next; // 다음에 올 데이터의 주소 저장할 변수 
	ShapeClass() { next = null; }
	void draw() {
		System.out.println("....");
	}
}
class LineClass extends ShapeClass {
	@Override
	void draw() {
		System.out.println("Line");
	}
}
class RectClass extends ShapeClass {
	@Override
	void draw() {
		System.out.println("Rect");
	}
}
class CircleClass extends ShapeClass {
	@Override
	void draw() {
		System.out.println("Circle");
	}
}
public class ClassEx13 {
	
	static void paint(ShapeClass s) { // 매개변수의 다형성 
		s.draw(); // 오버라딩 다형성 
	}
	
	public static void main(String[] args) {

		ShapeClass start, last, tmp; 
		
		start = new LineClass(); 
		last = start; 
		tmp = new RectClass(); 
		last.next = tmp; 	// 링크 걸기 
		last = tmp; 		// 방금 만든애가 마지막이된다.
		tmp = new LineClass(); 
		last.next = tmp; 
		last = tmp; 
		tmp = new CircleClass(); 
		last.next = tmp; 
		last = tmp; 
		
		// 모든 도형 출력 
		ShapeClass s = start; 
		while(s != null) {
			s.draw(); 
			s = s.next; 
		}
		
		
		
		
		
		
		
	}
}
