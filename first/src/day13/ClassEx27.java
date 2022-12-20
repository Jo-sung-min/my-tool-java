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
		//힌트 : 문자열 자르기
		String str = "5,7,+";
		str.split(",");// "(여기 들어간 문자)"지금은 쉼표로 싹짤라서 배열에 넣어줌
*/
abstract class Calc{
	private int a , b ;
	void set (int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	int getX() {
		return a;
	}
	int getY() {
		return b;
	}
	public abstract void setValue(int a, int b) ;
	public abstract int calculate();
	
	
}


class Add extends Calc{

	@Override
	public void setValue(int a, int b) {
		set(a,b);
	}

	@Override
	public int calculate() {
		return getX()+getY();
	}
}	
	
class Sub extends Calc{

	@Override
	public void setValue(int a, int b) {
		set(a,b);
		
	}

	@Override
	public int calculate() {
		return getX()-getY();
	}
	
}
class Mul extends Calc{

	@Override
	public void setValue(int a, int b) {
		set(a,b);
	}

	@Override
	public int calculate() {
		return getX()*getY();
	}
	
}
class Div extends Calc{

	@Override
	public void setValue(int a, int b) {
		set(a,b);
		
	}

	@Override
	public int calculate() {
		return getX()/getY();
	}
	
}


public class ClassEx27 {
	public static void main(String[] args) {
		/*실행 예시 :
			두 정수와 연산자를 입력하세요 >> 5 7 +
			12
			//힌트 : 문자열 자르기
			String str = "5,7,+";
			str.split(",");// "(여기 들어간 문자)"지금은 쉼표로 싹짤라서 배열에 넣어줌
		 */
		int x , y;
		String [] arr = new String [3];
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하세요 >>>");
		for(int i = 0 ;i<arr.length ;i++) {
			arr[i]= sc.nextLine();
		}
		if(arr[2].charAt(0)=='-') {
		Sub sb = new Sub();
		x = Integer.parseInt(arr[0]);
		y = Integer.parseInt(arr[1]);
		sb.setValue(x,y);
		System.out.println(sb.calculate());
		
		}
		if(arr[2].charAt(0)=='+') {
			Add sb = new Add();
			x = Integer.parseInt(arr[0]);
			y = Integer.parseInt(arr[1]);
			sb.setValue(x,y);
			System.out.println(sb.calculate());
			}
		if(arr[2].charAt(0)=='*') {
				Mul sb = new Mul();
				x = Integer.parseInt(arr[0]);
				y = Integer.parseInt(arr[1]);
				sb.setValue(x,y);
				System.out.println(sb.calculate());
				}
		if(arr[2].charAt(0)=='/') {
			Div sb = new Div();
			x = Integer.parseInt(arr[0]);
			y = Integer.parseInt(arr[1]);
			sb.setValue(x,y);
			System.out.println(sb.calculate());
		}
		
		
		
		
	}
}