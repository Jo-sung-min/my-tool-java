package day04;
import java.util.Scanner;
public class Test33 {

	public static void main(String[] args) {
		Scanner sm = new Scanner(System.in);
/*		
		System.out.println("정수를 입력하세요");
	
	
		int num = Integer.parseInt(sm.nextLine());
		
		// 문제 1 정수를 입력받아 3~5 는 " 봄", 6~8은 "여름", 9~11 은 " 가을 ",12 ~2 " 겨울
		 	// 을 출력하세요

		switch(num) {
		
		case 3 : 	case 4 : 	case 5 :
			System.out.println("봄");
			break;
		
		case 6 : 	case 7 : 	case 8 :
			System.out.println("여름");
			break;
			
		case 9 : 	case 10 : 	case 11 :
			System.out.println("가을");
			break;
			
		case 12 : 	case 1 : 	case 2 :
			System.out.println("겨울");
			break;
			
	
		
			
			
		
		};
		
	*/
		
		

		// 문제2 점수를 입력받고. 90~100은 " 수 " . 80~ 89 는 "우 " . 70~79는 "미".
		//							60~69 "양" 그 이하는 "가"를 출력하세요
		  

		System.out.println("정수를 입력하세요");
		int num = Integer.parseInt(sm.nextLine());
		
		
		
		switch(num/10) {
		
		case 10 : case 9 : 
			System.out.println("수");
			break;
		case 8 : 
			System.out.println("우");
			break;
		case 7 : 
			System.out.println("미");
			break;

		default:
			System.out.println("사칙연산기호가 아닙니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		//문제3. 덧셈 +. 뺄셈- , 곱셈*, 나눗셈/ 중 원하는 기호를 선택하여 a,b의
		//연산 결과값을 출력해보세요
		
		
		
		
		System.out.println("기호를 입력하세요");
		int a = 10, b = 3;
		String ch1 = sm.nextLine();
		//String ch1	= "+"; 


		switch (ch1) {
		
		case "+" : System.out.println(a+b);
		
		break;
		
		case "-" : System.out.println(a-b);
		
		break;
		
		case "/" : System.out.println((double)a/b);
		
		break;
		
		case "*" : System.out.println(a*b);
		
		break;
		
		}
		
		
		
		
		sm.close();
	}

}
