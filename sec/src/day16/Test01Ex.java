package day16;

import java.util.Scanner;
import java.util.Vector;

/*
	Scanner 클래스로 -1이 입력될때까지 양의 정수를 입력받아 벡터에 저장하고,
	벡터를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하세요. 
	실행예시:
		정수>> 10 6 22 6 88 77 -1
		가장 큰 수는 88
*/
public class Test01Ex {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>(); 
		
		System.out.print("정수 >> ");
		while(true) {
			int n = sc.nextInt(); 
			if(n == -1) { // -1인지 먼저 검사 
				break;
			}
			v.add(n); // 벡터에 추가 
		}
		
		// 저장된것이 하나도 없을 경우 예외 처리 
		if(v.size() == 0) {
			System.out.println("저장된 수가 하나도 없습니다.");
			sc.close();
			return;  // main 메서드 강제 종료 
		}
		
		// 가장 큰 수 찾아서 출력 (메서드로 작성해보자)
		printBiggerNum(v); // v를 인자로 던져서 가장큰수 찾아 출력하라고 명령! 
		
	}
	
	public static void printBiggerNum(Vector<Integer> vector) {
		int max = vector.get(0);
		for(int i = 0; i < vector.size(); i++) {
			if(max < vector.get(i)) {
				max = vector.get(i);
			}
		}
		System.out.println("가장 큰 수는 : " + max);
	}
	
	
	
	
}