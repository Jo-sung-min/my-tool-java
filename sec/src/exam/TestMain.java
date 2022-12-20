package exam;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {

		Friend[] friends = new Friend[3]; 
		
		friends[0] = new Friend("홍길동", "010-9999-9999", "05-22"); 
		friends[1] = new Friend("손석구", "010-1234-5678", "09-12"); 
		friends[2] = new Friend("정우성", "010-1111-2222", "03-01"); 
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 전화번호 뒷자리(단, 종료를 원하시면 x를 입력하시오) : ");
			String txt = sc.nextLine(); 
			if(txt.equalsIgnoreCase("X")) { break;}
			// for문 전체 돌려서 이름 확인 
			boolean check = false;
			for(int i = 0; i < friends.length; i++) {
				Friend f = friends[i];
				// 이름과 입력받은것 비교해서 맞으면 출력.(toString() 활용) 
				String phone = f.phone; // "010-9999-9999" 
				int lastIdx = phone.lastIndexOf("-"); // 8 : '-' 문자의 인덱스번호 뒤에서찾기
				String lastNum = phone.substring(lastIdx + 1); // "9999" 
				if(lastNum.equals(txt)) {
					System.out.println(f.toString()); 
					check = true;
					break;
				}
			}
			
			// for문을 다돌려도 해당 뒷번호가 없으면 
			if(!check) {
				System.out.println("해당 전화번호의 친구는 없습니다");
			}
			
		}
		
		System.out.println("프로그램 종료...");
		
		
	}
}
