package day09;
// 메서드 오버로딩 
public class Test73 {
	// 되는 것들 
	// 개수 차이 
	int getSum(int a, int b) {
		return a + b; 
	}
	int getSum(int a, int b, int c) {
		return a + b + c; 
	}
	// 타입 차이 
	int getMul(int a, int b) {
		return a * b; 
	}
	int getMul(int a, double d) {
		return a * (int)d;
	}
	// 순서+타입 차이 
	double getTest(double a, int b) {
		return a * b; 
	}
	double getTest(int a, double b) {
		return a * b;
	}
	
	// 안되는 것들 
	/* 매개변수 개수와 타입 동일 : 리턴타입은 오버로딩 조건에 포함 안됨. 
	int getSub(int a, int b) {
		return a - b; 
	}
	double getSub(int a, int b) {
		return (double)a - b; 
	}
	// 매개변수 이름은 상관없다!! 타입이나 개수가 달라야함.
	int getDiv(int a, int b) {
		return a / b; 
	}
	int getDiv(int c, int d) {
		return c / d; 
	}*/
	
	public static void main(String[] args) {

		Test73 test = new Test73(); 
		System.out.println(test.getSum(10, 20, 30)); 
		
		
		
	}
}
