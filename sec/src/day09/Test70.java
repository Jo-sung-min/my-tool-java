package day09;

import java.util.Scanner;

// 재귀호출 : factorial : 1부터 입력받은 수 n까지 곱한 결과를 돌려주는 메서드 
public class Test70 {
	
	static long factorial(long n) {
		if(n == 1) {
			return 1; 
		}else {
			return n * factorial(n-1);
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력>>");
		int n = Integer.parseInt(sc.nextLine()); // 숫자 입력받기 
		long result = factorial((long)n);	// factorial 호출해서 n 주고 결과 돌려받기 
		System.out.println(result); 
		
		sc.close();
		
	}
}
