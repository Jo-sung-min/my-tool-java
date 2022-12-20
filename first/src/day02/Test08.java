package day02;
//#1. import 문 작성

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		
		
		
		//#2 Scanner 객체생성
		Scanner sc = new Scanner(System.in);
		
		
		//#3 입력받기
		// 사용자가 어떤 입력을 해야하는지 힌트를 줄 메세지 출력
		System.out.println("지금 많이 졸린가요 ??");
		//입력받아, 받은 값 가져와 msg 변수에 저장
		// (입력받아오는 값의 타입은 무조건 String 타입이다.)
		String msg =	sc.nextLine();
		System.out.println("msg:"+msg);// 잘 가져왔는지 확인용 출력문
		
		
		
		
		//#4 Scanner 닫기
		sc.close();
		
		
		
		
		
		
		
		
	}//main 닫힌괄호

}// class 닫힌괄호
