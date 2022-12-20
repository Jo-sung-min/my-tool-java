package day16;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassEx57 {

	public static void main(String[] args) {
		//영문 이름 4개를 입력받아 ArrayList 에 저장하고 모두 출력한후
		//	제일 기 이름을 출력하세요
		
		
		ArrayList<String> s = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0 ; i<4; i++) {
			System.out.println("영문이름을 입력해 주세요");
			String name = sc.nextLine(); 
			s.add(name);
			
		}System.out.println(s);
		
		// 제일 긴 이름을 출력
		// 가장긴놈의 인덱스번호를 들고있을껏
		int longestIdx  = 0;
		
		for(int i = 0 ;i<s.size() ;i++) {
				if(s.get(longestIdx).length()<s.get(i).length()) {
					longestIdx = i;
				} 
				}
		System.out.println(s.get(longestIdx));
			
				sc.close();
				
				
		
	
		
		
		
		
	}

}
