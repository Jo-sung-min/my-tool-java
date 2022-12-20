package day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test04Ex {
	Scanner sc =new Scanner(System.in);
	HashMap<String , Integer> data = new HashMap<String, Integer>();
	int num ;
	double total;
	public void run() {
		while(true) {
		System.out.println("** 자바 성적 관리 프로그램 **\n"
				+ "			1. 전체 조회 \n"
				+ "			2. 등록\n"
				+ "			3. 수정\n"
				+ "			4. 삭제\n"
				+ "			5. 전체 평균\n"
				+ "			6. 프로그램 종료");
		num = Integer.parseInt(sc.nextLine());
		if(num==1) {
			printAll();
		}else if(num==2){
			addData();
		}else if(num==3){
			modifyData();
		}else if(num==4){
			delete();
		}else if(num==5){
			allAvg();
		}else if(num==6){
			System.out.println("프로그램을 종료합니다.");
			sc.close();
			break;
		}
		
		}// while 종료
	}// run 종료
	
	void printAll() {
		Set<String> keys=data.keySet();
		Iterator<String> it =keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			int score = data.get(name);
			System.out.println(name + " : " + score);
		}
		
	}
	void addData() {
		System.out.println("이름>>");
		String name=sc.nextLine();
		System.out.println("점수>>");
		int score=Integer.parseInt(sc.nextLine());
		Set<String> keys = data.keySet();
		if(keys.contains(name)) {
			System.out.println("이미 존재하는 학생입니다. 이름을 다시 입력해주세요");
		}else {
			data.put(name, score);
			System.out.println("저장완료");
		}
		
	}
	void modifyData() {
		System.out.println("수정할 학생의 이름을 입력해 주세요");
		String name = sc.nextLine();
		Set<String> keys =data.keySet();
		if(keys.contains(name)) {
			System.out.println("점수를 입력해주세요");
			int score=Integer.parseInt(sc.nextLine()); 
			data.put(name, score);
			System.out.println("수정되었습니다.");
		}else{
			System.out.println("없는 학생입니다.");
		}
		
	}
	void delete() {
		System.out.println("삭제할 학생의 이름을 입력해 주세요");
		String name = sc.nextLine();
		Set<String> keys =data.keySet();
		if(keys.contains(name)) { 
			data.remove(name);
			System.out.println("삭제되었습니다.");
		}else{
			System.out.println("없는 학생입니다.");
		}
	}
	void allAvg() {
		Set<String> keys=data.keySet();
		Iterator<String> it =keys.iterator();
		while(it.hasNext()) {
			total +=data.get(it.next());
		}
		System.out.println((double)total/data.size());
		
	}
	
	
	public static void main(String[] args) {
		// HashMap을 이용하여 학생 이름과 자바 점수를 기록하는 관리 프로그램을 작성하세요. 
		// 아래 프로그램 메뉴에서 각 번호로 서비스 선택하고, 6번을 입력받으면 프로그램 종료. 
		/*
		 	** 자바 성적 관리 프로그램 **
			1. 전체 조회 
			2. 등록
			3. 수정
			4. 삭제
			5. 전체 평균
			6. 프로그램 종료
		*/
		
		Test04Ex prg = new Test04Ex();
		prg.run();
		
	}
}