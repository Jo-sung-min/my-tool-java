package day08;
class Student{
	String name = "이상";
	int age= 10;
}

class MobilePhone{
	double x = 5.5;
	double y = 8.5;
	double thick= 3;
	String color ="red"; 
	String PhoneName = "gell"; 
	
	
}

public class Test47 {

	public static void main(String[] args) {
		//3. 학생의 이름과 나이를 저장할 Student 클래스를 만들어보세요. 

		//4. 3번에서 만든 Student 클래스를 이용하여 학생 한명을 만들고,
		 // 이름과 나이를 저장한 후 출력해서 확인해 보세요. 
			Student sm = new Student();
			System.out.println(sm.name);
			System.out.println(sm.age);
		
		/*	
			5. 아래와 같은 속성을 저장할 수 있는 멤버변수를 갖는 MobilePhone 클래스를 정의하세요. 
			   - 가로사이즈 (실수 ex: 7.5) 
			   - 세로사이즈 (실수)
			   - 두께    (실수) 
			   - 폰색상
			   - 폰 브랜드 이름 
			6. 5번에서 만든 MobilePhone 클래스를 이용하여 폰을 하나만들고, 
		   		모든 속성을 변경하고 출력해보세요. 
	*/
			MobilePhone gell1 = new MobilePhone();
			gell1.x = 6.5; 
			gell1.y = 9.5; 
			gell1.thick = 3.5; 
			gell1.color = "green"; 
			gell1.PhoneName = "gell2"; 
			
			System.out.println(gell1);
			
			
			
			
	}

}
