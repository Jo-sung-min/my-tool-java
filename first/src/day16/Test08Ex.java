package day16;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/*
	하나의 학생 정보를 나타내는 StudentClass에는 이름, 학과, 학번, 학점 평균을 저장하는 필드가 있다. 
	학생마다 StudentClass 객체를 생성하고 4명의 학생정보를 ArrayList<StudentClass> 컬렉션에 저장한 후에,
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
class StudentClass{
	String name ;
	String sub;
	String schoolNum;
	double avg;
	public StudentClass(String name, String sub, String schoolNum, double avg) {
	this.name = name;
	this.sub=sub;
	this.schoolNum = schoolNum;
	this.avg = avg;
	}
	
}

public class Test08Ex {
	
	ArrayList<StudentClass> list = new  ArrayList<StudentClass>();
	Scanner sc =new Scanner(System.in);
	void run () {
		while(true) {
		StudentClass stu ; 
		System.out.println("학생이름, 학과, 학번, 학점평균 입력하세요.");
		String name =sc.nextLine();
			if(name.equals("그만")) {System.out.println("종료합니다.");  break; }
			else {
				String[] splited = name.split(","); // 쉼표를 구분자로 분할하여 문자열배열로받기 
				String name1 = splited[0]; 
				String dept = splited[1]; 
				String id = splited[2]; 
				double grade = Double.parseDouble(splited[3]);
				list.add(new StudentClass(name1, dept, id, grade));
			}//else
		}//while
		
			for(int i = 0 ;i<list.size() ;i++) {
			StudentClass stu =	list.get(i);
			System.out.println("---------------------");
			System.out.println("이름 :"+stu.name );
			System.out.println("학과 :"+stu.sub );
			System.out.println("학번 :"+stu.schoolNum );
			System.out.println("학점평균 :"+stu.avg );
			}
		
		
		while(true) {
			System.out.println("검색할 학생이름>>");
			String name=sc.nextLine();
			if(name.equals("그만")) {
				sc.close();
				break;
			}
				for(int i =0;i<list.size() ;i++) {
					StudentClass stu = list.get(i);
					if(stu.name.equals(name)) {
						System.out.println("---------------------");
						System.out.println("이름 :"+stu.name );
						System.out.println("학과 :"+stu.sub );
						System.out.println("학번 :"+stu.schoolNum );
						System.out.println("학점평균 :"+stu.avg );
					
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Test08Ex ex = new Test08Ex();
		ex.run();
		System.out.println("프로그램 종료!");
	}
}