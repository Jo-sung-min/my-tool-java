package day12;

class Person1 { }
class Student1 extends Person1 {
	void test() {
		System.out.println("hhhhhhh");
	}
	
}
class Teacher1 extends Person1 { }
class Professor1 extends Teacher1 { }

// 다형성 - 매개변수 다형성 
public class ClassEx10 {
	
	static void print(Person1 s) {
		if(s instanceof Person1) { System.out.println("Person1"); }
		if(s instanceof Student1) { 
			Student1 stu = (Student1)s;
			stu.test();
			System.out.println("Student1"); 
		}
		if(s instanceof Teacher1) { System.out.println("Teacher1"); }
		if(s instanceof Professor1) { System.out.println("Professor1"); }
	}
	
	public static void main(String[] args) {

		System.out.print("new Student -> ");
		print(new Student1()); 
		System.out.print("new Teacher -> ");
		print(new Teacher1());
		System.out.print("new Professor ->");
		print(new Professor1());
		
		
	}
}
