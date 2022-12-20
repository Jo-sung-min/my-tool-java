package day12;
// 상속과 접근제어자 
class Person{
	private int weight; 
	int age; 
	protected int height; 
	public String name; 
	
	public void setWeight(int weight) { this.weight = weight; }
	public int getWeight() { return weight; }
}
class Student extends Person { // (weight), get/setWeight(), age, height, name, set()
	void set() {
		age = 30; 
		name = "홍길동"; 
		height = 170; 
		//weight = 100; // private : 부모 클래스 안에서만 접근 가능.
		setWeight(100); // 물려받았기 때문에 바로 사용가능 
		System.out.println(getWeight());
	}
}
public class ClassEx05 {
	public static void main(String[] args) {

		Student s = new Student(); 
		s.set();
		
	}
}
