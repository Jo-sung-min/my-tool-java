package day16;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassEx57 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 입력 툴 준비완료 
		ArrayList<String> list = new ArrayList<String>(); // 저장소 준비완료 
		
		// 입력받아 저장 
		for(int i = 0; i < 4; i++) {
			// 영문 이름 4개를 입력받아 -> Scanner 
			System.out.print("이름 입력 >> ");
			// ArrayList에 저장하고 -> ArrayList 객체 생성 
			list.add(sc.nextLine()); 			
		}
		// 모두 출력한 후
		System.out.println(list); // #1안
		for(int i = 0; i < list.size(); i++) { //#2안 저장된 요소의 개수만큼 반복해라~~
			String s = list.get(i);
			System.out.println(s);
		}
		// 제일 긴 이름을 출력하세요. 
		int longestIdx = 0; 
		for(int i = 0; i < list.size(); i++) {
			if(list.get(longestIdx).length() < list.get(i).length()) {
				longestIdx = i; 
			}
		}
		System.out.println("가장 긴 이름은 : " + list.get(longestIdx));
		
		sc.close();
		
		
	}
}
