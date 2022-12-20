package day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
	"그만"이 입력될 때까지 나라이름과 인구를 입력받아 저장하고, 
	다시 나라이름을 입력받아 인구를 출력하는 프로그램을 작성하세요. 아래 해쉬맵을 이용하세요.
	HashMap<String, Integer> nations = new HashMap<String, Integer>();
	실행예시 :
		나라 이름과 인구를 입력하세요.(예: Korea 5000)
		나라 이름, 인구 >>  Korea 5000
		나라 이름, 인구 >>  USA 1000000
		나라 이름, 인구 >>  Swiss 2000
		나라 이름, 인구 >>  France 3000
		나라 이름, 인구 >>  그만
		인구 검색 >> France
		France의 인구는 3000
		인구 검색 >> 스위스
		스위스 나라는 없습니다.
		인구 검색 >> 그만
		프로그램 종료!
*/
public class Test06Ex {
	HashMap<String, Integer> nations = new HashMap<String, Integer>();
	Scanner sc = new Scanner(System.in);
	public void run(){
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000) 그만 입력시 종료");
		
		while(true) {
			
			System.out.println("나라 이름, 인구 >> ");
			String name = sc.nextLine();
			if(name.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}else {
				String [] name1 = name.split(" ");
				nations.put(name1[0], Integer.parseInt(name1[1]));
			}
			
		}
		//인구검색
		while(true) {
			System.out.println("검색할 나라 이름을 입력해주세요");
			String name = sc.nextLine();
			
			Set<String> keys = nations.keySet();
			
			if(name.equals("그만")) {
				System.out.println("종료합니다.");
				sc.close();
				break;
			}else if(keys.contains(name)) {
				System.out.println(name+"의 인구는"+nations.get(name));
			}else {System.out.println("그런이름은 없습니다.");}
			
		}
		
	}//run
	
	public static void main(String[] args) {
		Test06Ex sm = new Test06Ex();
		sm.run();
		
		
	}
}