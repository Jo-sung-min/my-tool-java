package day09;

public class Test73 {
		//갯수가 다른거
		int getSum(int a, int b) {
			return a+b;
		}
		int getSum(int a, int b, int v) {		//받는 변수의 개수 즉 매개변수의 개수가 서로 달라야함
			return a+b+v;
		}
		//타입이 다른것
		int getMul(int a , int b) {
			return a*b;
		}
		int getMul(int a , double d) { // 매개변수의 갯수 또는 타입이 다르면 오버로딩 가능
			return a*(int)d;
		}
		
		//안되는 것들
		//매개변수 개수와 타입 동일 : 리턴타입은 오버로딩 조건에 포함안됨.
	/*	int getSub(int a, int b) {
			return a - b ;
		}
		double getSub(int a, int b) {
			return a - b ;
		}
		// 매개변수 이름은 상관없다. 타입이나 갯수가 달라야함
		int getDiv(int a, int b) {
			return a / b;
		}
		int getDiv(int c, int d) {
			return c / d;
		}
		*/
		
		
	public static void main(String[] args) {
		
		Test73 sm =new Test73();
		System.out.println(sm.getSum(10, 20,30));
		
		
		
	}
}