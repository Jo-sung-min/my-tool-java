package day03;
import java.util.Scanner;

public class Test24 {

	public static void main(String[] args) {
	      // 문제2. 초단위로 정수를 입력받고,
	      //         계산된 "??분??초" 형태로 출력해보세요. 
		
	/*	Scanner sm = new Scanner(System.in);
		
		System.out.println("시간을 계산해드립니다"+"초단위로 입력해주세요");

		String sec = sm.nextLine();
		int sec1 = Integer.parseInt(sec);
		
		System.out.println((sec1/60)+"분"+sec1%60+"초");
		*/
		
		// 문제3. 초단위로 정수를 입력받고, "??시간??분??초" 형태로 출력해보세요. 
	    
		Scanner sm = new Scanner(System.in);
		
		System.out.println("시간을 계산해드립니다"+"초단위로 입력해주세요");

		String sec = sm.nextLine();
		int sec1 = Integer.parseInt(sec);
		
		System.out.println((sec1/3600)+"시간"+((sec1%3600)/60)+"분"+sec1%60+"초");
		
		
		
		
		
		
		sm.close();
	}

}
