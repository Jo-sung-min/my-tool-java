package day16;

import java.util.HashMap;
import java.util.Scanner;

public class Test03Ex {
	public static void main(String[] args) {
		// 영한 사전 만들기 : HashMap을 이용하여 10개의 단어를 영어,한글의 쌍으로 저장하고 영어로 한글을 검색하는 프로그램을 만들어보세요.
		// 단, exit가 입력되면 프로그램 종료!
		Scanner sc= new Scanner(System.in);
		HashMap<String, String> list = new HashMap<String, String>();
		String key = "";
		String value = "";
		boolean sm = true;
		String find =""; 
				
		
		
		for(int i = 0 ; i<2 ; i++) {
			System.out.println("10개의 단어를 입력해 주세요");
			key = sc.nextLine();
			value = sc.nextLine();
			list.put(key, value);
			System.out.println("저장 되었습니다.");
		}
		while(sm) {
		System.out.println("찾고싶은 단어의 영어를 입력해 주세요");
		find = sc.nextLine();
		if(list.get(find) == null) {
			System.out.println("그런 단어는 없습니다.");
		}
		
		System.out.println(list.get(find));
		sc.close();
		break;
		
		
		}
		
		
		
		
		
		
		
	}
}