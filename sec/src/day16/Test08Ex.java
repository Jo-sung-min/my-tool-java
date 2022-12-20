package day16;

import java.util.ArrayList;
import java.util.Scanner;

/*
	하나의 학생 정보를 나타내는 StudentClass에는 
	이름, 학과, 학번, 학점 평균을 저장하는 필드가 있다. 
	학생마다 StudentClass 객체를 생성하고 4명의 학생정보를 
	ArrayList<StudentClass> 컬렉션에 저장한 후에,
	ArrayList<StudentClass>의 모든 학생(4명) 정보를 출력하고 
	학생 이름을 입력받아 해당 학생의 학점 평균을 출력하는 프로그램을 작성하세요.
	실행예시:
		학생이름, 학과, 학번, 학점평균 입력하세요.
		>> 호크아이,모바일,1,4.1
		>> 데드풀,안드로이드,2,3.9
		>> 헐크,웹개발,3,3.5
		>> 아이언맨,빅데이터,4,4.25
		---------------------------
		이름:호크아이
		학과:모바일
		학번:1
		학점평균:4.1
		---------------------------
		이름:데드풀
		학과:안드로이드
		학번:2
		학점평균:3.9
		---------------------------
		이름:헐크
		학과:웹개발
		학번:3
		학점평균:3.5
		---------------------------
		이름:아이언맨
		학과:빅데이터
		학번:4
		학점평균:4.25
		---------------------------
		학생 이름 >> 아이언맨 
		아이언맨, 빅데이터, 4, 4.25
		학생 이름 >> 데드풀
		데드풀, 안드로이드, 2, 3.9
		학생 이름 >> 그만 
		프로그램 종료!
*/
class StudentClass {
	private String name; // 이름
	private String dept; // 학과 
	private String id;   // 학번
	private double grade; // 학점평균 
	StudentClass(String name, String dept, String id, double grade){
		this.name = name; this.dept = dept; this.id = id; this.grade = grade;
	}
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public String getDept() { return dept; }
	public void setDept(String dept) { this.dept = dept; }
	public String getId() { return id; }
	public void setId(String id) { this.id = id; }
	public double getGrade() { return grade; }
	public void setGrade(double grade) { this.grade = grade; }
}

public class Test08Ex {
	// 학생 정보 저장할 ArrayList 인스턴스로 만들어 모든 메서드에서 접근할 수 있게..
	ArrayList<StudentClass> list = new ArrayList<StudentClass>(); 
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
			list.add(new StudentClass(name, dept, id, grade)); 
		}
		System.out.println("---------------------------");
	}
	// 학생정보 출력 
	void printAll() {
		for(int i = 0; i < list.size(); i++) {
			StudentClass stu = list.get(i); 
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
			// list에 저장된 정보에 모두 접근 
			for(int i = 0; i < list.size(); i++) {
				StudentClass stu = list.get(i);
				if(stu.getName().equals(input)) {
					System.out.print(stu.getName() + ", " + stu.getDept() + ", ");
					System.out.println(stu.getId() + ", " + stu.getGrade());
					break; // 먼저 찾으면 for문 끝까지 돌릴필요없이 for문 종료
				}
			}
		}
	}
	
	public void run() {
		setList(); 	// 학생정보 입력받아 저장해라~
		printAll(); // 전체 학생정보 출력해라~ 
		search();	// 학생 검색 하는 기능 실행해라~ 
	}
	
	public static void main(String[] args) {
		Test08Ex ex = new Test08Ex();
		ex.run();
		System.out.println("프로그램 종료!");
	}
}