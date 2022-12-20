package day10;

class Circle{
	int radius;
	
	Circle(int radius){
		
		this.radius = radius;
		System.out.println(this);
		
	}
	void setRadius(int radius ) {
		this.radius = radius;
	}
	double getArea() {
		return radius*radius*3.14;
	}
}


public class Test82 {

	public static void main(String[] args) {
		
		
		Circle c = new Circle(10);
		System.out.println(c);
		System.out.println(c.getArea());
		
		
			
		
		
	}

}
