package day10;
//캡슐화로 클래스 만들어보자.
class Person {
	//String name = "";
	//int age = 0;
	private String name ; 
	
	private int age;
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		// 검증처리 , 유효성 검사 , 가공하고 이것들을 하려고 쓰는것
		this.age =  age;
	}
	
	public int getAge() {
		return age;
	}
	
	
}

public class Test88 {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("피까츄");
		System.out.println(p.getName());
		p.setAge(10);
		System.out.println(p.getAge());
		
		

	}

}
