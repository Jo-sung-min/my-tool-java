package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
	Test08Ex문제를 ArrayList<StudentClass>대신 
	HashMap<String, StudentClass> 을 이용하여 다시 작성해보세요. 
	해쉬맵에서 키는 학생 이름으로 한다.
*/
public class Test09Ex {
	// ArrayList<StudentClass> 컬렉션에 저장
	// 학생 정보 저장할 HashMap 인스턴스로 만들어 모든 메서드에서 접근할 수 있게..
	HashMap<String, StudentClass> map = new HashMap<String, StudentClass>(); 
	Scanner sc = new Scanner(System.in);
	
	// 학생정보 저장 
	void setList() {
		System.out.println("학생이름, 학과, 학번, 학점평균 입력하세요.");
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String data = sc.nextLine(); // 호크아이,모바일,1,4.1
			String[] splited = data.split(","); // 쉼표를 구분자로 분할하여 문자열배열로받기 
			String name = splited[0]; 
			String dept = splited[1]; 
			String id = splited[2]; 
			double grade = Double.parseDouble(splited[3]); // 꺼내서 형변환 
			//list.add(new StudentClass(name, dept, id, grade)); 
			map.put(name, new StudentClass(name, dept, id, grade));
		}
		System.out.println("---------------------------");
	}
	// 학생정보 출력 
	void printAll() {
		
		//Set<String> keys = map.keySet(); 
		//Iterator<String> it = keys.iterator(); // 키들만 뽑음 (이름들) 
		Iterator<String> it = map.keySet().iterator(); 
		while(it.hasNext()) {
			String key = it.next(); // 키값(학생이름) 하나 뽑고 
			StudentClass stu = map.get(key); // 키값주고 벨류값 뽑음 
			System.out.println("이름:" + stu.getName());
			System.out.println("학과:" + stu.getDept());
			System.out.println("학번:" + stu.getId());
			System.out.println("학점평균:" + stu.getGrade());
			System.out.println("---------------------------");
		}
	}
	// 학생 검색 
	void search() {
		while(true) {
			System.out.print("학생 이름 >> ");
			String input = sc.nextLine(); 
			if(input.equals("그만")) {
				break; 
			}
			StudentClass stu = map.get(input);
			if(stu == null) {
				System.out.println(input + " 학생은 없습니다.");
			}else {
				System.out.print(stu.getName() + ", ");
				System.out.print(stu.getDept() + ", ");
				System.out.print(stu.getId() + ", ");
				System.out.println(stu.getGrade());
			}
		}//while
	}// search()
	public void run() {
		setList(); 	// 학생정보 입력받아 저장해라~
		printAll(); // 전체 학생정보 출력해라~ 
		search();	// 학생 검색 하는 기능 실행해라~ 
	}
	public static void main(String[] args) {
		Test09Ex ex = new Test09Ex();
		ex.run();
	}
}