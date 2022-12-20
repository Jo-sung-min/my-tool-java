package day09;
// 기본생성자 자동으로 안만들어주는 예시
class Circle1 {
	int radius; 
	
	Circle1() { }
	// 매개변수 있는 생성자를 개발자가 작성하면, 
	// 기본생성자는 안만들어준다. 
	Circle1(int r) {
		radius = r; 
	}
	
	void set(int r) {
		radius = r; 
	}
	double getArea() {
		return radius * radius * 3.14; 
	}
}

public class Test81 {
	public static void main(String[] args) {

		Circle1 c = new Circle1(10); 
		System.out.println(c.getArea());
		
		Circle1 c2 = new Circle1();
		
		
		
	}
}
