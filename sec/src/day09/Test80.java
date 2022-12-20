package day09;
// 기본생성자 자동으로 만들어지는 예시 
class Circle {
	int radius; 
	
	// Circle(){ }
	
	void set(int r) {
		radius = r; 
	}
	double getArea() {
		return radius * radius * 3.14; 
	}
}
public class Test80 {
	public static void main(String[] args) {

		Circle pizza = new Circle(); 
		//pizza.set(15);
		System.out.println(pizza.getArea());
		
		
		
		
		
	}
}
