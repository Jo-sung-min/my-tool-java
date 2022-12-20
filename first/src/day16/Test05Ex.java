package day16;

import java.util.HashMap;
import java.util.Scanner;

/*
	id와 tel(전화번호)로 구성되는 Student클래스를 만들고, 이름을 key로 하고 Student객체를 값으로 하는 해쉬맵을 작성해보세요.
	이름을 검색하면 id와 전화번호 출력되고, exit 입력하면 프로그램 종료. 
*/
class Student{
	String id = "";
	String tel = "";
	public Student(String id, String tel) {
		this.id = id;
		this.tel = tel;
	}
	public String getId() {return id;}
	public String getTel() {return tel;}
}// Student 클레스종료

public class Test05Ex {
	
	public static void main(String[] args) {
	String name ;
	boolean sm = true;
	HashMap<String, Student> map = new HashMap<String, Student>();
	
	map.put("피카츄", new Student("1", "010-2700-1761"));
	map.put("라이츄", new Student("1", "010-3810-1761"));
	map.put("파이리", new Student("1", "010-5800-1761"));
	Scanner sc = new Scanner(System.in);
	while(sm) {
		
		System.out.println("검색할 이름을 입력해주세요");
		name = sc.nextLine();
		if(name.equalsIgnoreCase("exit")) {
			System.out.println("프로그램을 종료합니다");
			sc.close();
			break;
		}else {
		Student list = map.get(name);
		System.out.println("id :"+list.id+"번호 : "+list.tel);
		
		
		
		
		}
	}
	
		
		
		
	}
}
