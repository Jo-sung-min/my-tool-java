package day16;

import java.util.HashMap;
import java.util.Scanner;

/*
	id와 tel(전화번호)로 구성되는 Student클래스를 만들고,
	이름을 key로 하고 Student객체를 값으로 하는 해쉬맵을 작성해보세요.
	이름을 검색하면 id와 전화번호 출력되고, exit 입력하면 프로그램 종료. 
*/
class Student {
	private int id; 
	private String tel; 
	Student(int id, String tel){
		this.id = id; this.tel = tel; 
	}
	public int getId() { return id; }
	public String getTel() { return tel; }
}
public class Test05Ex {
	public static void main(String[] args) {
		
		// 해쉬맵 
		HashMap<String, Student> map = new HashMap<String, Student>(); 
		
		// 저장 
		map.put("피카츄", new Student(1, "010-1111-2222"));
		map.put("라이츄", new Student(2, "010-1234-5678"));
		map.put("파이리", new Student(3, "010-9999-9999"));
		
		// 검색 
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("검색할 이름 >> ");
			String name = sc.nextLine(); // 입력받기 -> key값
			if(name.equals("exit")) { break; } // 입력받은게 exit면 while문 종료
			Student stu = map.get(name);  // 입력받은 값(key) 주고 value 꺼내서 변수에 담기 
			if(stu == null) { // stu가 null이면 -> 해당 키값이 map에 없다! 
				System.out.println(name + "은 없는 사람입니다.");
			}else {
				System.out.println("id : " + stu.getId() + ", 전화번호 : " + stu.getTel());
			}
		}
		System.out.println("프로그램 종료...");
		sc.close();
		
	}
}
