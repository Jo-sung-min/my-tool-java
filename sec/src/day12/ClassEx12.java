package day12;
// 오버라이딩 다형성 
class Shape {
	void draw() {
		System.out.println("....");
	}
}
class Line extends Shape {
	@Override
	void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape {
	@Override
	void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Circle");
	}
}
public class ClassEx12 {
	
	static void paint(Shape s) { // 매개변수의 다형성 
		s.draw(); // 오버라딩 다형성 
	}
	
	public static void main(String[] args) {

		Line line = new Line(); 
		paint(line);
		paint(new Shape()); 
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		
		
		
		
		
	}
}
