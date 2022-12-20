package day10;

import java.util.Scanner;

/*
 	Grade 클래스를 완성하세요. 
 	3과목의 점수를 입력받아 Grade 객체를 생성하고 성적 평균을 출력하는 
 	main() 과 실행예시는 아래와 같다. 
 	콘솔 출력예)
 		수학, 과학, 영어점수를 입력하세요. 
 		수학 >> 90
 		과학 >> 88
 		영어 >> 96
 		평균은 91
*/
class Grade {
	private int math; 
	private int sci; 
	private int eng; 
	
	Grade(int math, int sci, int eng) {
		this.math = math; this.sci = sci; this.eng = eng;
	}
	public int getMath() { return math; }
	public void setMath(int math) { this.math = math; }
	public int getSci() { return sci; }
	public void setSci(int sci) { this.sci = sci; }
	public int getEng() { return eng; }
	public void setEng(int eng) { this.eng = eng; }
	
	double getAvg() {
		return (math + sci + eng) / 3.0; 
	}
}
public class Test90 {
	public static void main(String[] args) {
		//main 완성 
		Scanner sc = new Scanner(System.in);
		System.out.println("수학, 과학, 영어점수를 입력하세요.");
		System.out.print("수학>>");
		int math = Integer.parseInt(sc.nextLine());
		System.out.print("과학>>");
		int sci = Integer.parseInt(sc.nextLine());
		System.out.print("영어>>");
		int eng = Integer.parseInt(sc.nextLine());
		Grade me = new Grade(math, sci, eng);
		System.out.println("평균은 " + me.getAvg());
		
		sc.close();
		
		
		
	}
}
