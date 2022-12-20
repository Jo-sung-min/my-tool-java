package day16;

import java.util.ArrayList;
import java.util.Scanner;

/*
	Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'F')을 문자로 입력받아
	ArrayList에 저장하고, ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여
	평균을 출력하는 프로그램을 작성하세요.
	실행예시:
		6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>	 A C A B F D
		2.3333333333333335
*/
public class Test02Ex {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList list= new ArrayList();
		System.out.println("학점을 순서대로 입력해주세요");
		
		for(int i =0 ;i<5 ;i++) {
			String score = sc.nextLine();
			list.add(score);
			
		}System.out.println(list);
		
		list.set(0, 4.0);
		list.set(1,3.0);
		list.set(2,2.0);
		list.set(3,1.0);
		list.set(4,0.0);
		
		System.out.println(list);
		System.out.println(list.get(0));
		for(int i = 0 ;i<list.size() ;i++) {
			double sum = 0.0; 
			//sum	+= Double.parseDouble(list.get(i));
			
		}
		
	}
}