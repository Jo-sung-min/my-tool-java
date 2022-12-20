package day09;
/*
3. 아래와 같은 클래스를 만들고, 
class Ex02 {
   int a; 
   boolean isPlay; 
   double d; 
}
Ex02 클래스안에 변수에 해당하는 메서드를 총 3개 만든다. 
각 메서드는 외부로부터 데이터를 전달받아, 변수에 대입하는 처리를 한다. 
4. 3번에서만든 Ex02 클래스로 객체생성 한개 하고 
메서드들을 호출하여 변수에 값대입시키고, 출력해서 확인해보세요. 
*/

class Ex02 {
	   int a; 
	   boolean isPlay; 
	   double d; 
	   
	   
	   int add(int c) {
		   a = c+10;
		   return a;
	   }
	   double div(double a) {
		   d = 15/a;
		   return d;
	   }
	  void power(boolean a) {
		   isPlay =  a;
		
	   }  
	   
	   
	   
	   
	   
	   
	}





public class Test75 {

	public static void main(String[] args) {
		boolean k = true;
		
		
		Ex02 sm = new Ex02();
		System.out.println(sm.add(10));
		System.out.println(sm.div(5));
		System.out.println(sm.isPlay);
		
	
			
		
		
		
		
	}

}
