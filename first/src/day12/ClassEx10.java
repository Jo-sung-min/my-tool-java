package day12;

class Person1{
	int x ; 
}
class Student1 extends Person1{
	void print() {
		System.out.println("나는 학생이고");
	}
}
class Teacher1 extends Person1{
	
}
class Professor1 extends Teacher1{
	
}
public class ClassEx10 {
	// 다형성 - 매개변수 다형성
	static void print(Object s) {
		if(s instanceof Person1) 	{// s가 Person1 의 형을 가지고 있으면 //그래서 여기에 부모변수 or 처음 파생나온 객체가들어간다
			System.out.println("Person1");
		}
		if(s instanceof Student1) {
		//	s.print(); // 이거는 안된다 형변환을 해줘야함 부모가 가지고있는타입만 실행할 수 있기때문
			Student1 stu = (Student1)s;
			stu.print(); // 이렇게 형변환을 해서 자식옷을 입혀주면 실행가능
			System.out.println("Student");
		}
		if(s instanceof Teacher1) {
			System.out.println("Teacher1");
		}
		if(s instanceof Professor1) {
			System.out.println("Professor1");
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("newStudent1");
		print(new Student1());
		System.out.println("newTeacher1");
		print(new Teacher1());
		
	}

}
