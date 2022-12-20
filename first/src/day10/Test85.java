package day10;
class Car{
	String color = "";
	
	Car(String color){
		this.color = color;
	}
	String drive() {
		return color + "색차가 지나갑니다.";
	}
	
	
}
public class Test85 {

	public static void main(String[] args) {
		Car[] garage = new Car[5]; //자동차  5개 저장가능한 주차장
		String [] colors = {"빨간","노랑","검정","회","초록"};
		
		
		for(int i = 0 ;i< garage.length ;i++ ) {
			garage[i] =new Car (colors[i]);
			// 객체생성을 해야함 안하면 널포인터 익셉션 이라고 뜬다
		}
		for(int i = 0 ;i< garage.length ;i++ ) {
			System.out.println(garage[i].drive());
		}
		
		
		
		
		
		
		
	}

}
