package day02;

import java.util.Scanner;


public class Test09 {

	public static void main(String[] args) {
	
		Scanner sa= new Scanner(System.in);
		
		System.out.println("이름을 입력하세요"+"\n"+">>");
		
		String name = sa.nextLine();
		System.out.println("당신의 이름은 \"" + name + "\" 입니다");
		
		System.out.println("나이를 입력해주세요 >>");
		String age = sa.nextLine();
		int numage = Integer.parseInt(age);
		
		System.out.println("당신의 나이는" + age + "살입니다.");
		//	int numage = (int)age;
		// 참조형 String 과 기본형 타입은 형변환 공식으로 호환 불가능!!

		
		System.out.println("당신의 내년 나이는"+(numage +1 ) + "살입니다.");
		
		
		/*
	 * 
	 * 
	 * 	String >> int 
	 * Integer.parseInt(String타입변수 or "값");
	 	문자열이 껴있는 숫자값은 변환 불가능
	 	ex) "abc" 이런거나 "av10" 요런거
	 		"012" 이런것은 된다
	 		
	 * String > double
	 * Double.parseDouble(String 타입변수 or "값");
	 * 
	 * float 변수명 = Float.parseFloat(String 타입변수 or "값");
	 * 
	 * boolean 변수명 = Boolean.parseBoolean();
	 *
	 *
	 */
		
		
		
		sa.close();
		
	}

}
