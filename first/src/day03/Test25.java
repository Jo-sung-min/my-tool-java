package day03;
import java.util.Scanner;
public class Test25 {

	public static void main(String[] args) {
		 /* 문제4. 최소 화폐 매수 구하기
        금액을 입력받으면, 최소한의 화폐매수를 구해주는 프로그램 
  콘솔예시)
  금액입력 :   67800   <- 사용자가 입력 
  5만원 : 1장
  1만원 : 1장
  5천원 : 1장
  1천원 : 2장
  5백원 : 1개
  1백원 : 3개*/

		
		Scanner sm = new Scanner(System.in);
		
		System.out.println("당신의 돈을 깔끔하게 분리해주는 봇\n"+"금액을 입력하시오");

		String div = sm.nextLine();
		int div1 = Integer.parseInt(div);
		
		System.out.println
		("5만원"+" : "+div1/50000+"장\n"+
	     "1만원"+" : "+(div1%50000)/10000+"장\n"+
		 "5천원"+" : "+((div1%50000)%10000)/5000+"장\n"+
		 "1천원"+" : "+(((div1%50000)%10000)%5000)/1000+"장\n"+
		 "5백원"+" : "+((((div1%50000)%10000)%5000)%1000)/500+"개\n"+
		 "1백원"+" : "+(((((div1%50000)%10000)%5000)%1000)%500)/100+"개\n");
		
		
		
		
		
		
		
		sm.close();
		
		
		
		
		
		
		
	}

}
