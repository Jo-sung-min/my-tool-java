package day16;

import java.util.HashMap;
import java.util.Scanner;

/*
	"그만"이 입력될 때까지 나라이름과 인구를 입력받아 저장하고, 
	다시 나라이름을 입력받아 인구를 출력하는 프로그램을 작성하세요. 
	아래 해쉬맵을 이용하세요.
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
	public static void main(String[] args) {
		
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
		
		// 나리이름, 인구 입력받아 저장 (그만이 break 포인트) 
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			String txt = sc.nextLine();
			if(txt.equals("그만")) {
				break; 
			}
			String[] txtSplit = txt.split(" ");
			nations.put(txtSplit[0], Integer.parseInt(txtSplit[1]));
		}
		
		// 나라이름 입력받아 인구 출력 
		while(true) {
			System.out.print("인구 검색 >> ");
			String n = sc.nextLine(); 
			if(n.equals("그만")) {
				break;
			}
			// map의 get(key값) 은 해당 키벨류가 없으면 null 리턴 
			Integer popul = nations.get(n); // 저장하는 변수를 Integer로 받은 이유 : null 체크하려고 
			if(popul == null) {
				System.out.println(n + " 나라는 없습니다.");
			}else {
				System.out.println(n + "의 인구는 " + popul);
			}
		}
		
		System.out.println("프로그램 종료! ");
		sc.close();
		
		
		
		
		
		
		
		
	}
}