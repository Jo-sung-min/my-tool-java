package day08;
/*
  문제 : Calc 라는 클래스를 만들고,
  사칙연산 메서드 4개를 만들어보세요. mySum mySub myMul myDiv
  main 에서 4 가지 모두 실행해보세요
 */
class Calc{
	
	int mySum(int a,int b) {
		int c = a + b;
		return c;
	}
	int mySub(int a,int b) {
		int c = a - b;
		return c;
	}
	int myMul(int a,int b) {
		int c = a * b;
		return c;
		//return a*b; 도 가능
	}
	double myDiv(double a,double b) {
		if(b==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0; // 리턴값이 들어가서 else 사용할 필요가 없다.
		}else {
		double c = a / b;
		return c;
		}
	}
	
}


public class Test68 {

	public static void main(String[] args) {

		
		
		Calc sm = new Calc();
		System.out.println(sm.mySum(10, 10));
		System.out.println(sm.mySub(10, 5));
		System.out.println(sm.myMul(5, 3));
		System.out.println(sm.myDiv(5, 0));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
