package day08;
// 인자전달방식
class Circle{
	int radius = 30;
	
}

public class Test70 {
// 편의를 위해 static 붙히는거
	static void plus(int num) {
		num +=1;
		
	}
	static void biggerPizza (Circle a) {
		a.radius ++;
	}
	static void increse (int[ ] arr) {
			for(int i = 0 ;i<arr.length ; i++) {
				arr[i]++;
			}
	}
	
	public static void main(String[] args) {
		// #1. 기본형
		int num =10;
		System.out.println(num);
		plus(num);
		System.out.println(num); 		// 10이 출력되는데 이유 각각의 메서드 마다 사용하는 stack영역이 달라서
											// plus 메서드 안에서 선언한 것은 main 에서 쓸 수없다.
		
		// #2.참조형 (객체)				//주소를 공유하기 때문에 영역안의 값을 수정가능
		Circle pizza =new Circle();
		biggerPizza(pizza);
		System.out.println(pizza.radius);
		System.out.println();
		//#3.배열
		int[] arr= {1,2,3,4,5};
		for(int a : arr) System.out.print(a+" ");
		System.out.println();
		increse(arr);
		for(int a : arr) System.out.print(a+" ");
		
		
		System.out.println();
		
		
		
	}

}
