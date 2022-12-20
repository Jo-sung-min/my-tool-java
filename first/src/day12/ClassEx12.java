package day12;
//오버라이딩 다형성
class Shape {
	public void draw() {
		System.out.println("Shape");
	}
	
}
class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("Rec");
	}
	
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("cc");
	}
}
public class ClassEx12 {
	
	static void paint(Shape s ) { //매개변수의 다형성
		s.draw(); 		// 오버라이딩 다형성
	}					// 자식들이 드로우를 오버라이딩 해서 다 바뀌어서 출력댄다
	
	
	public static void main(String[] args) {

		
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		
		
		
		
	}

}
