package day16;

import java.util.ArrayList;
import java.util.Scanner;

/*
	Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'F')을 문자로 입력받아
	ArrayList에 저장하고, ArrayList를 검색하여 
	학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여
	평균을 출력하는 프로그램을 작성하세요.
	실행예시:
		6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>	 "A C A B F D"
		2.3333333333333335
*/
public class Test02Ex {
	// 변수
	// 클래스메서드, 인스턴스 메서드 
	
	// 메인 메서드 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>(); 
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>> ");
		String input = sc.nextLine(); // ex "A C A B F D" 변수에 저장 
		String[] split = input.split(" "); // 띄어쓰기 구분자로 분할 
		for(String s : split) { // 반복문 돌려서 
			list.add(s); // list에 추가 
		}
		//System.out.println(list);
		
		// 학점을 숫자로 변환해서 평균값 구해 출력 -> 메서드 
		printAvg(list); 

		sc.close();
	}
	
	public static void printAvg(ArrayList<String> list) {
		double sum = 0; 
		for(int i = 0; i < list.size(); i++) { // 저장된 개수만큼 반복 
			String val = list.get(i); // 데이터하나 꺼내기 
			if(val.equals("A")) {
				sum += 4.0; 
			}else if(val.equals("B")) {
				sum += 3.0; 
			}else if(val.equals("C")) {
				sum += 2.0; 
			}else if(val.equals("D")) {
				sum += 1.0; 
			}else if(val.equals("F")) {
				sum += 0;  
			}
		}
		double avg = sum / list.size(); 
		System.out.println(avg);
	}
	
	
	
}