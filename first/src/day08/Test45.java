package day08;
class Tell{
	int y ;
	static int kk = 1;
	Tell tv  ;
	String sm ;
	Add plus ;
	
	
}
class Add{
	int add(int a ) {
		int c = a *100;
		System.out.println(c+"연습입니다.");
		return c ; 
	}
	void kk() {
		System.out.println(" 아궁");
	}
	
}




public class Test45 {

		
		
		
	public static void main(String[] args) {

		Add sm = new Add();
		sm.kk();

		Tell k2 = new Tell();
		k2.plus = new Add();
		k2.plus.kk();
		
		
		
		
		
	}

}
