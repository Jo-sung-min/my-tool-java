package day12;
// 매개변수 다형성
class Product{
	int money ;
	double bonusPoint ;
	 Product(int money) {
		this.money = money;
		bonusPoint = money /10.0;
		
	}
}

class Tv extends Product{
	Tv(){
		super(100);}
	@Override
	public String toString() {
	
		return "Tv";
	}
}
class Computer extends Product{
	Computer(){
		super(200);
	}
	@Override
	public String toString() {
		return "computer";
	}
}
class Buyer{
	int  money= 10000;
	int bonusPoint= 0;
	
	void Buy(Product p ){
		money -= p.money;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"는");
	}
	
	
}

public class ClassEx11 {

	
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		b.Buy(tv);
		System.out.println("남은돈은"+b.money+"입니다");
		b.Buy(com);
		System.out.println("남은 포인트는 "+b.bonusPoint + "입니다.");
		
		
		
		
	}

}
