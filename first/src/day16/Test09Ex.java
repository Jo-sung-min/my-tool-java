package day16;
/*
	Test08Ex문제를 ArrayList<StudentClass>대신 HashMap<String, StudentClass> 을 이용하여 다시 작성해보세요. 
	해쉬맵에서 키는 학생 이름으로 한다.
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test09Ex {
	Scanner sc = new Scanner(System.in);
	HashMap<String, StudentClass> map = new HashMap<String, StudentClass>();
	StudentClass stu;
	public void run() {
		addData();
		printList();
		printAyg();
	}
	public void addData() {
		while(true) {
			System.out.println("학생이름, 학과, 학번, 학점평균 입력하세요.");
			String name = sc.nextLine();
			if(name.equals("그만")){System.out.println("입력종료"); break;}
			{
			String[] split= name.split(" ");
			String name1 = split[0];
			String sub = split[1];
			String schoolNum = split[2];
			double avg = Double.parseDouble(split[3]);
			map.put(name1, new StudentClass(name1, sub, schoolNum, avg));
			System.out.println("입력완료");
			}
		}
	}
	public void printList() {
		Set<String> keys =map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			StudentClass stu = map.get(it.next());
			System.out.println("---------------------");
			System.out.println("이름 :"+stu.name );
			System.out.println("학과 :"+stu.sub );
			System.out.println("학번 :"+stu.schoolNum );
			System.out.println("학점평균 :"+stu.avg );
		}
		
	}
	public void printAyg() {
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
				System.out.println("---------------------");
				System.out.println("이름 :"+stu.name );
				System.out.println("학과 :"+stu.sub );
				System.out.println("학번 :"+stu.schoolNum );
				System.out.println("학점평균 :"+stu.avg );
			}
		}//while
	}// search()
	
	public static void main(String[] args) {
		Test09Ex ex = new Test09Ex();
		ex.run();
	}
}