package day16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
	이름과 학점(4.5만점)을 5개 입력받아 해쉬맵에 저장하고, 장학생 선발 기준을 입력받아
	 장학생 명단을 출력하세요.
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

class Scholarship{
		Scanner sc = new Scanner(System.in);
		HashMap<String, Double> map = new HashMap<String, Double>();
		String title ;
		
		Scholarship(String title){
		this.title = title;	
		}
	

	public void insert() {
		String name;
		Double score;
		String name1;
		System.out.println("자바장학금관리시스템입니다. 그만 입력시 종료");
		while(true) {
			System.out.println("이름과 학점 >>");
			name1 = sc.nextLine();
			if(name1.equalsIgnoreCase("그만")) {break;}
				{
				String [] info = name1.split(" ");
				name = info[0];
				score= Double.parseDouble(info[1]);
				map.put(name, score);
				System.out.println("입력완료");
			}//if
		}//while
	}//추가
	public void select() {
		Double cutline;
		System.out.println("장학생 선발 학점 기준 입력>>");
		 cutline=Double.parseDouble(sc.nextLine());
		 Set<String> keys=map.keySet();
		 Iterator<String>it=keys.iterator();
		 while(it.hasNext()) {
			 String name = it.next();
			 Double score = map.get(name);
			 if(score>=cutline) {
				 System.out.println(name+" ");
			 }
			 
		 }//while
		 
	}// 선별
	
}


	
public class Test10Ex {
	public static void main(String[] args) {
		Scholarship sship = new Scholarship("자바장학금");
		sship.insert();
		sship.select();

	}
}