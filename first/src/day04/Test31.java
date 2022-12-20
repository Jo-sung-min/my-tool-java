package day04;
import java.util.Scanner;
public class Test31 {

	public static void main(String[] args) {
		
		Scanner sm = new Scanner(System.in);
		System.out.println("정수 입력 >>");
		
		int num = Integer.parseInt(sm.nextLine());
		
		System.out.println(num);
		
		
		switch(num) {
		
		case 1 : 
			System.out.println("1을 입력하셨습니다.");
		//	break; 없애면 1을 입력했을때 1,2 다 실행된다
			
		case 2 : 
			System.out.println("2를 입력하셨습니다.");
			break;
			
		case 3 : 
			System.out.println("3을 입력하셨습니다.");
			break;
		default :
			System.out.println("1,2,3이 아닌 숫자를 입력하셨습니다.");
			//break; 어차피 } 가 종료시켜주기 때문에
		};
		
		System.out.println("vm프로그램 종료!!");
		
		
		
		
		
		
		
		sm.close();
		
	}

}

