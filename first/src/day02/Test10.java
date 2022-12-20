package day02;

import java.util.Scanner;
public class Test10 {
	
	public static void main(String[] args) {
		
		Scanner sa = new Scanner(System.in);
		
		
		System.out.println("당신의 이름은?");
		
		String name = sa.nextLine();
		
		
		
		//입력받기
		
		
		//이름, 나이 , 혈액형, 주소 , 전화번호, 키 , 
		 
		
		
		System.out.println(" \""+ name +"\" ");

		System.out.println("당신의 혈액형은?");
		
		String bl = sa.nextLine();
		System.out.println("\""+ bl +"\"형 입니다.");
		
		
		System.out.println("나이는?");
		String age = sa.nextLine();
		System.out.println(age+"살입니다.");
		
		sa.close();
		
		 
		
	}

}
