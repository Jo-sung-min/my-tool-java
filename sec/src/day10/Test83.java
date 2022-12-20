package day10;
// 같은이름의 변수 우선순위 : 지역 > 인스턴스 > 클래스 
public class Test83 {

	int x = 10; 
	void add(int x) {
		// 인스턴스보다 지역변수가 우선순위가 높으므로, x는 모두 매개변수만 가르키게됨. 
		//x = x; 
		this.x = x; 
	}
	
	public static void main(String[] args) {

		
		
		
		
	}
}
