package day16;

import java.util.Scanner;
import java.util.Vector;

/*
	Vector 컬렉션을 이용하여 강수량의 평균을 유지 관리하는 프로그램을 작성하세요.
	강수량을 입력하면 벡터에 추가하고 현재 입력된 모든 강수량과 평균을 출력한다.
	실행 예시 :
		강수량 입력 (0 입력시 종료)>>	5
		5
		현재 평균 5
		
		강수량 입력 (0 입력시 종료)>>	80
		5 80
		현재 평균 42
		
		강수량 입력 (0 입력시 종료)>>	53
		5 80 53
		현재 평균 46
		
		강수량 입력 (0 입력시 종료)>>	22
		5 80 53 22
		현재 평균 40
		
		강수량 입력 (0 입력시 종료)>>	0
		프로그램 종료!
*/
public class Test07Ex {
	
	public static void main(String[] args) {
	
		Vector<Integer> data = new Vector<Integer>(); 
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			int amount = Integer.parseInt(sc.nextLine().trim());
			if(amount == 0) {
				break;
			}
			data.add(amount); 	// 강수량 저장 
			printVector(data);  // 벡터에 저장된 모든 강수량 출력 메서드 호출~ 
			printAvg(data);		// 벡터에 저장된 강수량 평균 출력 메서드 호출~ 
			System.out.println();
		}//while
		
		System.out.println("프로그램 종료!");
		sc.close();
	}//main
	
	public static void printVector(Vector<Integer> vector) {
		for(int i = 0; i < vector.size(); i++) {
			System.out.print(vector.get(i) + " ");
		}
		System.out.println();
	}
	public static void printAvg(Vector<Integer> data) {
		int sum = 0; 
		for(int i = 0; i < data.size(); i++) {
			sum += data.get(i);
		}
		int avg = sum / data.size(); 
		System.out.println("현재 평균 : " + avg);
	}
	
	
	
	
	
}