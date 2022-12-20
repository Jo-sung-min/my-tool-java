package day12;


class AClass{
	int x=99 ;
	int z = 10 ;
}
class BClass extends AClass{
	int x= 20;
	int y=0 ;
}



public class ClassEx08 {

	
	
	
	
	
	public static void main(String[] args) {
		//기본 객체 생성하던 방식
		//AClass a = new AClass();
		//BClass b = new BClass();
		
		// 다형성 : 조상의 참조변수로 자식의 실 객체를 담아주는것
		AClass a = new BClass();
		//BClass b = new AClass(); // 부모객체가 자식변수를 들어갈 수 없다.
		System.out.println(a.x);		// 자식변수가 부모변수에 대입되어도 자식객체에서 생성한 변수는 못들어감
		//System.out.println(a.y); // 
		BClass bbb = (BClass)a;
		System.out.println(bbb.x);
		System.out.println(bbb.y);
		
		/*int a = 10;	// 정수 10
		double d = 10.14; //정수 10 실수부 . 14 가지고 있음
		a =( int )d;*/
		
		
		
		
		
	}

}
