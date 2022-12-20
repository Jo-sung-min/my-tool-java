package day10;
class Circle {
	int radius; 
	
	Circle(int radius) {
		this.radius = radius; 
		System.out.println("this : " + this);
	}
	void setRadius(int radius) {
		this.radius = radius; 
	}
	double getArea() {
		return radius * radius * 3.14; 
	}
}

public class Test82 {
	public static void main(String[] args) {

		Circle c = new Circle(5); 
		System.out.println("c : " + c);
		//Circle c2 = new Circle(5); 
		//System.out.println(c.getArea());
		
		
		
	}
}
