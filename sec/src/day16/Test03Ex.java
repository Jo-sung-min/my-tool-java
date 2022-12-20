package day16;

import java.util.HashMap;
import java.util.Scanner;

public class Test03Ex {
	public static void main(String[] args) {
		// 영한 사전 만들기 
		// : HashMap을 이용하여 10개의 단어를 영어,한글의 쌍으로 저장하고 
		// 영어로 한글을 검색하는 프로그램을 만들어보세요.
		// 단, exit가 입력되면 프로그램 종료!
		
		HashMap<String, String> dict = new HashMap<String, String>();
		
		dict.put("apple", "사과");
		dict.put("paper", "종이");
		dict.put("book", "책");
		dict.put("car", "자동차");
		dict.put("pants", "바지");
		dict.put("bottle", "병");
		dict.put("chair", "의자");
		dict.put("extend", "확장하다");
		dict.put("implement", "실행하다");
		dict.put("banana", "바나나");
		
		Scanner sc = new Scanner(System.in); 
		while(true) {
			System.out.print("찾고싶은 단어 >> ");
			String eng = sc.nextLine(); 
			if(eng.equals("exit")) {
				System.out.println("프로그램 종료!");
				break;
			}
			String kor = dict.get(eng);
			if(kor == null) {
				System.out.println(eng + "는 사전에 없는 단어입니다.");
			}else {
				System.out.println(kor);
			}
		}
		
		
		sc.close();
		
		
		
		
	}
}