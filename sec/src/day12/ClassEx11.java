package day12;
// 매개변수 다형성 
class Product {
	int price; 		// 제품의 가격
	int bonusPoint; // 제품 구매시 제공하는 보너스 포인트 
	Product(int price){
		this.price = price; 
		bonusPoint = (int)(price / 10.0); 
	}
}
class Tv extends Product { // price(100), bonusPoint(10)
	Tv() {
		super(100); // 부모 생성자를 통해 각 변수 초기화 
	}
	@Override
	public String toString() {
		return "Tv";
	}
}
class Computer extends Product { // price(200), bonusPoint(20)
	Computer() {
		super(200);
	}
	@Override
	public String toString() {
		return "Computer";
	}
}
class Buyer { // 고객님
	int money = 1000; 	// 지갑 
	int bonusPoint = 0; // 고객 소유의 보너스 포인트 
	
	void buy(Product p) { // 제품 산다~~~  매개변수의 다형성 
		money -= p.price; 
		bonusPoint += p.bonusPoint; 
		System.out.println(p + "를 구매하셨습니다.");
	}
}
public class ClassEx11 {
	public static void main(String[] args) {

		Buyer b = new Buyer(); 
		Tv tv = new Tv(); 
		Computer com = new Computer();
		//System.out.println(tv);
		// 참조변수 출력하면 참조변수의 toString() 메서드가 호출되서 
		//	메서드가 돌려주는 값을 출력하게 된다.
		//  출력형태가 마음에 안들면 Object로 부터 물려받은 
		//  toString() 메서드를 오버라이딩해서 원하는 문자열을 리턴해주게 변경하면 된다. 
		//  나 또는 부모가 오버라이딩을 안했으면 Object 클래스가 만들어놓은 형태로 사용
		//	Object가 만들어놓은 형태는 "패키지명.클래스명@레퍼런스16진수" 이와 같다.
		//System.out.println(tv.toString());
		
		b.buy(tv);
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 포인트는 " + b.bonusPoint + "점입니다.");

		b.buy(com);
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 포인트는 " + b.bonusPoint + "점입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
