package exam;

import java.util.ArrayList;

class Student extends Person { // id, name, print()
	String ban; 
	Student(String id, String name, String ban){
		super(id, name);
		this.ban = ban;
	}
	@Override
	public void print() {
		System.out.println("(ID)" + id + "  (이름)" + name + "  (반)" + ban);
	}
}
class Gangsa extends Person {// id, name, print()
	String subject; 
	Gangsa(String id, String name, String subject){
		super(id, name);
		this.subject = subject;
	}
	@Override
	public void print() {
		System.out.println("(ID)" + id + "  (이름)" + name + "  (과목)" + subject);
	}
}
class Staff extends Person {// id, name, print()
	String department;
	Staff(String id, String name, String department){
		super(id, name);
		this.department = department; 
	}
	@Override
	public void print() {
		System.out.println("(ID)" + id + "  (이름)" + name + "  (부서)" + department);
	}
}
public class Main {
	public static void main(String[] args) {

		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Student("A01", "나학생", "JAVA반"));
		list.add(new Student("A02", "홍길동", "C++반"));
		list.add(new Staff("S01", "나직원", "교무팀"));
		list.add(new Staff("S02", "나도요", "취업지원팀"));
		list.add(new Gangsa("G01", "나선생", "프로그래밍"));
		
		for(int i = 0; i < list.size(); i++) {
			list.get(i).print();
		}
		System.out.println("-----------------------");
		
		for(Person p : list) {
			p.print();
		}
		
		/* 일반버전 
		Student stu1 = new Student("A01", "나학생", "JAVA반"); 
		stu1.print();
		Student stu2 = new Student("A02", "홍길동", "C++반"); 
		stu2.print();
		Staff staff1 = new Staff("S01", "나직원", "교무팀"); 
		staff1.print();
		Staff staff2 = new Staff("S02", "나도요", "취업지원팀"); 
		staff2.print();
		Gangsa gang = new Gangsa("G01", "나선생", "프로그래밍");
		gang.print();
		*/
		/*
		(ID)A01   (이름)나학생    (반)JAVA반
		(ID)A02   (이름)홍길동    (반)C++반
		(ID)S01   (이름)나직원    (부서)교무팀
		(ID)S02   (이름)나도요    (부서)취업지원팀
		(ID)G01   (이름)나선생    (과목)프로그래밍
		*/
		
		// 1 ~ 45 
		// 0 ~ 44  +  1
		
		int randomNum = (int)(Math.random() * 45) + 1; 
		System.out.println(randomNum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
