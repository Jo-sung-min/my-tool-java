package day03;
import java.util.Scanner;
public class Test28 {

	public static void main(String[] args) {
/*
		int a= 20;
		if(a>10){
			System.out.println("a는 10보다 크다.");

		}

		
		//a-10 하고 10이랑 비교
		//연산자 우선순위에 따라 산술연산 먼저 계산됨.
		if(a-10>=10) {
			System.out.println("안녕하세요");
			
			
		}
		*/
	/*	
		//문제 score 변수에 드어있는 점수가 60점 이상이면 "합격" 출력 아니면 " 불합격" 출력
		boolean c = score >= 60;
		
		
		if(score >= 60) {
			System.out.println("합격");
		
		}
		else {
			System.out.println("불합격");
		}
		System.out.println(score > 60 ? "합격": "불합격");//3항 연산자.
		
		*/
		
		//문제 점수: 점수하나를 입력받고, 90점 이상이면 "수", 80점이상이면"우"
		//									70점이상이면"미", 그 이하는 " 재시험" 출력
		Scanner sm = new Scanner(System.in);
		System.out.println("점수를 입력하시오");
		
		String score = sm.nextLine();
		
		int score1 = Integer.parseInt(score);
		if(score1>=90) { 
			System.out.println("수");
			
		}else if(score1 >= 80){
			System.out.println("우");
			
		}else if(score1 >= 70){
			System.out.println("미");
		
		}else {
			System.out.println("재시험");
		}
		

		
		sm.close();
		
		
		
		
		
		
		

	}

}
