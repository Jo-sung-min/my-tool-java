package day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/*
	이름과 학점(4.5만점)을 5개 입력받아 해쉬맵에 저장하고, 
	장학생 선발 기준을 입력받아 장학생 명단을 출력하세요.
	실해예시:
		자바장학금관리시스템입니다.
		이름과 학점 >> 호크아이 3.1
		이름과 학점 >> 블랙위도우 3.6
		이름과 학점 >> 토르 2.9
		이름과 학점 >> 데드풀 3.7
		이름과 학점 >> 아이언맨 4.3
		장학생 선발 학점 기준 입력 >> 3.2
		장학생 명단 : 블랙위도우 데드풀 아이언맨
*/
class Scholarship {
	private String title; 
	private HashMap<String, Double> map = new HashMap<String, Double>(); 
	private Scanner sc = new Scanner(System.in);
	
	Scholarship(String title) {
		this.title = title;
	}
	void insert() {
		System.out.println(title + "관리시스템입니다.");
		for(int i = 0; i < 5; i++) {
			System.out.print("이름과 학점 >> ");
			String[] txt = sc.nextLine().split(" "); 
			map.put(txt[0], Double.parseDouble(txt[1]));
		}
	}
	void select() {
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		double cutline = Double.parseDouble(sc.nextLine());
		
		System.out.print("장학생 명단 : ");
		Iterator<String> it = map.keySet().iterator(); // 키들만 뽑아서 반복자 얻어오기(키들 일렬로 나열)
		while(it.hasNext()) {
			String name = it.next(); // 키하나 나옴
			double score = map.get(name); 
			if(score >= cutline) {
				System.out.print(name + " ");
			}
		}
		System.out.println();
	}
}

public class Test10Ex {
	public static void main(String[] args) {
		Scholarship sship = new Scholarship("자바장학금");
		sship.insert();
		sship.select();
	}
}