package day07;

class Tv{
	boolean power = false;
	int vol =0,  ch = 1;
	
}


public class Test61 {
	//변수
	//메서드
	//메인메서드 생성가능
	public static void main(String[] args) {
		
		Tv t= new Tv();
		System.out.println(t.power);
		System.out.println(t.vol);
		System.out.println(t.ch);
		Tv t1= new Tv();
		Tv t2= new Tv();
		Tv t3= new Tv();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		t1.ch = 10;
		t2.ch = 20;
		System.out.println(t1.ch);
		System.out.println(t2.ch);
		System.out.println(t3.ch);
		
		
		t1 = t2; //같은 타입끼리는 대입가능 tv 타입
		
		t1.ch = t2.ch;
		
		
		
	}

}
