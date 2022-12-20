package day12;


class Person{
	private int weight ;
	int height;
	protected String name;
	public int age;
	void setWeight(int weight) {
		this.weight = weight;
	}
	int getWeight () {
		return weight;
	}
	
}
class Student extends Person{//( weight) 물려받았지만 접근을 못함 , age , height , name , set()
	void set() {
	age = 17;
	height = 180;
	name = "김똑";
	setWeight(70);
	System.out.println(getWeight());
		
	}
	
	
}



public class ClassEx05 {

	public static void main(String[] args) {
		Student s = new Student();
		s.set();
	}

}
