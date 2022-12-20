package day13;

import java.util.Scanner;

// 추상 클래스 
/*
	아래와 같이 4개의 멤버(변수와 메소드)를 가진, 4개의 클래스 Add,Sub,Mul,Div 를 작성하세요. 
	- int타입의 a, b 변수 : 2개의 피연산자 저장할 변수
	- void setValue(int a, int b) : 피연산자 값을 객체 내에 저장
	- int calculate() : 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴한다.

	그런데, 각각의 클래스마다 공통된 필드와 메소드가 존재하는 구조이므로, 
	Calc라는 이름의 추상클래스를 작성하여 Calc를 상속받아 각 4개의 클래스를 작성해보세요.
	그리고, main()메소드에서 실행예시와 같이 2개의 정수와 연산자를 입력받은 후,
	4개의 클래스중 적합한 연산을 처리할 수 있는 객체를 생성하고 메서드 호출하여 그 결과 값을 화면에 출력하게 작성 해보세요. 
	실행 예시 :
		두 정수와 연산자를 입력하세요 >> 5 7 +
		12
		
	힌트 : 문자열 자르기 String의 기능중 split() 메서드 사용 
		String str = "5,7,+"; 
		String[] arr = str.split(","); 
		for(String s : arr) {
			System.out.println(s);
		}
*/
abstract class Calc {
	protected int a; 
	protected int b; 
	protected void setValue(int a, int b) {
		this.a = a; 
		this.b = b; 
	}
	abstract int calculate(); 
}
class Add extends Calc { // a, b, setValue(), @calculate()
	@Override
	int calculate() {
		return a + b;
	}
}
class Sub extends Calc {
	@Override
	int calculate() {
		return a - b;
	}
}
class Mul extends Calc {
	@Override
	int calculate() {
		return a * b;
	}
}
class Div extends Calc {
	@Override
	int calculate() {
		return a / b;
	}
}
public class ClassEx27 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하세요 >> ");
		String str = sc.nextLine(); 
		String[] splited = str.split(" "); 
		int result = 0; 
		Calc calc = null; 
		
		if(splited[2].equals("+")) {
			calc = new Add(); 
		}else if(splited[2].equals("-")) {
			calc = new Sub(); 
		}else if(splited[2].equals("*")) {
			calc = new Mul(); 
		}else if(splited[2].equals("/")) {
			calc = new Div(); 
		}
		calc.setValue(Integer.parseInt(splited[0]), Integer.parseInt(splited[1]));
		result = calc.calculate();
		System.out.println(result);
		
		sc.close();
		
		
	}
}