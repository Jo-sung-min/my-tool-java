package day14;

import java.util.Scanner;
/*
	Scanner 주요메서드
	리턴타입 	메서드명 	설명
	-----------------------------------------------------------------
	String 		nextLine()	콘솔에 입력한 한줄 전부 가져와 문자열로 리턴
	
	String 		next()		콘솔에 입력한 토큰하나 문자열로 리턴
	int 		nextInt()		콘솔에 입력한 토큰 정수 리턴
	double		nextDouble()	콘솔에 입력한 토큰 double 로 리턴



*/
public class ClassEx35 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3줄 입력하세요");
		String s1 = sc.next();	// 엔터를 버퍼에 남겨놓고 대려옴
		String s2 = sc.next();
		String s3 = sc.next();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("주소를 입력");	
		sc.nextLine(); // 버퍼를 비우듯이 한번 그냥 실행
		String addr = sc.nextLine();
		System.out.println(addr);
		sc.close();
	}

}
