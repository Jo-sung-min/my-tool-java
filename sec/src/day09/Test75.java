package day09;

import java.util.Scanner;

class Ex01{
	String str = "hello java"; 
	int year = 2022; 
	void printStr() {
		System.out.println(str);
	}
	void printYear() {
		System.out.println(year);
	}
}
class Ex02 {
	int a; 
	boolean isPlay; 
	double d; 
	void setA(int num) {
		a = num; 
	}
	void setIsPlay(boolean val) {
		isPlay = val;
	}
	void setD(double data) {
		d = data;
	}
}

/*
1. 아래와 같은 클래스를 만들고, 
	class Ex01{
		String str = "hello java"; 
		int year = 2022; 
	}
	str 변수값을 출력하는 인스턴스 메서드 1개 
	year 변수값을 출력하는 인스턴스 메서드 1개
	총 두개의 메서드를 추가해보세요.
	
2. 1번에서 만든 Ex01 클래스로 객체 생성 2개하고 각각 메서드를 호출해보세요. 

3. 아래와 같은 클래스를 만들고, 
	class Ex02 {
		int a; 
		boolean isPlay; 
		double d; 
	}
	Ex02 클래스안에 변수에 해당하는 메서드를 총 3개 만든다. 
	각 메서드는 외부로부터 데이터를 전달받아, 변수에 대입하는 처리를 한다. 
4. 3번에서만든 Ex02 클래스로 객체생성 한개 하고 
	메서드들을 호출하여 변수에 값대입시키고, 출력해서 확인해보세요. 
	
5. 모바일 폰 클래스 만들기 
	MobPhone 클래스를 만들고, 
	브랜드 이름, 폰의 가로크기, 세로크기, 무게를 저장할 변수를 만드세요. 
	그리고, 전화걸기, 전화받기, 문자 보내기, 문자받기 메서드도 추가하세요. 
	(메서드 안에는 실행되었는지 확인하기 위해 단순히 출력문 하나만 작성) 
6. 5번에서 만든 MobPhone을 이용하여 폰을 하나 생성하고, 
	폰의 모든값을 출력하고, 값도 변경한후, 다시 출력해서 확인해보세요. 
7. 위 모바일 폰 클래스에 만들어둔 메서드중 전화걸기 메서드를 수정하세요. 
	전화걸기 메서드에 전화번호를 던져주면 (예: "010-1111-2222") 
	메서드에서는 해당 전화번호로 전화를 걸고 있다는 출력문 작성. 
	(출력예: 010-1111-2222로 전화를 걸고 있습니다.)
*/
public class Test75 {
	public static void main(String[] args) {
		
		Ex02 ex = new Ex02(); 
		Scanner sc = new Scanner(System.in); 
		
		
		ex.setA(100);
		ex.setIsPlay(true);
		ex.setD(3.14);
		
		System.out.println(ex.a);
		System.out.println(ex.isPlay);
		System.out.println(ex.d);
		
		
		
		
	}
}
