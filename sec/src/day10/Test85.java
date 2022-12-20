package day10;

class Car {
	String color = ""; 
	Car(String color){
		this.color = color;
	}
	String drive() {
		return color + "색 차가 지나갑니다~ 비키세요~~~"; 
	}
}
public class Test85 {
	public static void main(String[] args) {
		
		Car [] garage = new Car[5];	// 자동차 5개 저장가능한 주차장 
		String [] colors = {"빨간", "노란", "검정", "회", "초록"}; 
		
		//garage[0].drive(); NullPointerException 발생!!!! -> 객체생성잘했는지
		
		for(int i = 0; i < garage.length; i++) {
			garage[i] = new Car(colors[i]);
		}
		
		for(int i = 0; i < garage.length; i++) {
			System.out.println(garage[i].drive());
		}
		
		
		
		
	}
}
