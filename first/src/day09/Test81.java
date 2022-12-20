package day09;

// 기본생성자 자동으로 만들어 주는 예시
class Circle{
	
	int radius;
	//잘 실행되는 이유
	// Circle(){} 이생성자를 자동으로 생성해준것
	void set(int r) {
		radius =r;
		
	}
	double getArea() {
		return radius*radius*3.14;
	}
	
	
}

public class Test81 {
	
	public static void main(String[] args) {

		
		Circle pizza = new Circle();
		System.out.println(pizza.radius);
		
		pizza.set(15);
		System.out.println(pizza.getArea());
		
		
		
	}

}
