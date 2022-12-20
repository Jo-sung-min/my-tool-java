package exam;

public class Person {

	String id; 
	String name; 
	
	Person(String id, String name){
		this.id = id; this.name = name;
	}
	
	public void print() {
		System.out.println("(ID)" + id + "  (이름)" + name);
	}
	
}
