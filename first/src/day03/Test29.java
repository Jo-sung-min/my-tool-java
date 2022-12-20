package day03;
import java.util.Scanner;
public class Test29 {

	public static void main(String[] args) {
		   // 문제1. 정수 두개를 입력받고, 몫과 나머지를 출력하세요
	
	/*
		Scanner sm = new Scanner(System.in);
		System.out.println("정수 2개를 순차적으로 입력해주세요");
		
		String num =	sm.nextLine();
			int num1 = Integer.parseInt(num);
		
		String numb =	sm.nextLine();
			int num2 = Integer.parseInt(numb);
			
			System.out.println("몫은\n"+(num1/num2)+"\n나머지는\n"+(num1%num2));
			
		
	*/
		
		 // 문제2. 일(day)수 입력받고, 몇개월 몇일인지 출력해보세요
		
		/*
	
		Scanner sm = new Scanner(System.in);
		System.out.println("당신이 일할 일수를 입력해주세요"+ " 하루에 7만원의 일당이 있습니다.");
		
		String day = sm.nextLine();
		int factDay = Integer.parseInt(day);
		
		System.out.println(factDay/30+"개월"+factDay%30+"일 입니다.");
		System.out.println(factDay*7+"만원을 버실수 있습니다.");
	
		
	*/
	
		
		// 문제3. 점수 3개를 입력받고, 총점과 평균을 구하여 출력해보세요.
	
		Scanner sm = new Scanner(System.in);
		
		System.out.println("수학 영어 국어의 점수를 입력해주세요");

		String first = sm.nextLine();
		String sec = sm.nextLine();
		String th = sm.nextLine();
		
		int first1 = Integer.parseInt(first);
		int sec1 = Integer.parseInt(sec);
		int th1 = Integer.parseInt(th);
	
		double avg = (first1 +sec1+th1)/ 3.0;
		
		
		System.out.println("당신의 총점은"+(first1+sec1+th1)+"입니다.");
		System.out.println("당신의 평균은"+(avg)/3+"입니다.");
		
		
	
		
		
		sm.close();

	}

}
