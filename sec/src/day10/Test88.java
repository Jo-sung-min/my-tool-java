package day10;
// 캡슐화로 클래스 만들어보자. 
class Person {
	//String name = "";
	//int age = 0; 
	private String name; 
	private int age; 
	public String getName() {
		return name; 
	}
	public void setName(String name) {
		if(name == null) {
			System.out.println("null은 저장할 수 없습니다.");
		}else {
			this.name = name; 
		}
	}
	public int getAge() {
		return age; 
	}
	public void setAge(int age) {
		// 검증처리, 유효성검사, 가공하고
		if(age > 0  && age < 150) {
			this.age = age; // 대입 
		}else {
			System.out.println("이상한 나이 입력....");
		}
	}
}

public class Test88 {
	public static void main(String[] args) {

		Person p = new Person(); 
		//p.name = "피카츄";
		p.setName("피카츄");
		//System.out.println(p.name);
		System.out.println(p.getName());
		p.setAge(-100);
		//p.age = -100000; 
		
		
		
	}
}
