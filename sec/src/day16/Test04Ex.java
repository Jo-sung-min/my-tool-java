package day16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//HashMap을 이용하여 학생 이름과 자바 점수를 기록하는 
// 관리 프로그램을 작성하세요. 
// 아래 프로그램 메뉴에서 각 번호로 서비스 선택하고, 
// 6번을 입력받으면 프로그램 종료. 
/*
 	** 자바 성적 관리 프로그램 **
	1. 전체 조회 
	2. 등록
	3. 수정
	4. 삭제
	5. 전체 평균
	6. 프로그램 종료
*/
public class Test04Ex {
	HashMap<String, Integer> data = new HashMap<String, Integer>(); 
	Scanner sc = new Scanner(System.in);
	
	private void printAll() {
		Set<String> keys = data.keySet(); 
		Iterator<String> it = keys.iterator(); 
		while(it.hasNext()) {
			String name = it.next(); 
			int score = data.get(name); 
			System.out.println(name + " : " + score);
		}
		System.out.println("=====================================");
	}
	private void addData() {
		System.out.print("이름>> ");
		String name = sc.nextLine(); 
		System.out.print("점수>> ");
		int score = Integer.parseInt(sc.nextLine()); 
		// map안에 key값으로 이미 저장된 이름이 있는지 확인 
		Set<String> keys = data.keySet(); 
		if(keys.contains(name)) { // key들중에 입력받은 name과 동일한 값이 있냐? 
			System.out.println("이미 존재하는 학생입니다. 이름을 다시 입력해주세요.");
			//addData(); 
		}else {
			data.put(name, score); // map에 저장 			
			System.out.println("저장 완료");
		}
		System.out.println("=====================================");
	}
	private void modifyData() {
		System.out.print("수정할 학생 이름>> ");
		String name = sc.nextLine(); 
		Set<String> keys = data.keySet(); 
		if(keys.contains(name)) {
			// 점수 입력받아 수정 
			System.out.print("점수 >> ");
			int score = Integer.parseInt(sc.nextLine());
			data.put(name, score); // 수정 put(같은키값, 다른벨류값);
			System.out.println("수정완료!");
		}else {
			System.out.println("존재하지 않는 학생입니다..");
		}
		System.out.println("=====================================");
	}
	private void deleteData() {
		System.out.print("삭제할 학생 이름>> ");
		String name = sc.nextLine(); 
		Set<String> keys = data.keySet(); 
		if(keys.contains(name)) {
			data.remove(name);  // 삭제 
			System.out.println("삭제완료!");
		}else {
			System.out.println("존재하지 않는 학생입니다..");
		}
		System.out.println("=====================================");
	}
	private void printAvg() {
		Collection<Integer> col = data.values(); // map에서 값들만 뽑아줌
		Iterator<Integer> it = col.iterator(); 
		int sum = 0; 
		while(it.hasNext()) {
			sum += it.next(); // 값하나씩 꺼내서 sum에 누적해 더하기 
		}
		double avg = (double)sum / data.size(); 
		System.out.println("평균 점수 : " + avg);
		System.out.println("=====================================");
	}
	public void run() {
		while(true) {
			System.out.println("** 자바 성적 관리 프로그램 **\n"
					+ "1. 전체 조회 \n"
					+ "2. 등록\n"
					+ "3. 수정\n"
					+ "4. 삭제\n"
					+ "5. 전체 평균\n"
					+ "6. 프로그램 종료");
			System.out.print("원하는 서비스 번호를 입력해주세요 >> ");
			int sel = Integer.parseInt(sc.nextLine());
			System.out.println("=====================================");
			if(sel == 1) printAll(); 
			else if(sel == 2) addData(); 
			else if(sel == 3) modifyData(); 
			else if(sel == 4) deleteData(); 
			else if(sel == 5) printAvg(); 
			else if(sel == 6) {
				sc.close();
				System.out.println("프로그램 종료!");
				break;
			}else {
				System.out.println("잘못된 메뉴번호... 다시 입력해주세요.");
			}
		}
	}
	public static void main(String[] args) {
		
		Test04Ex prg = new Test04Ex();
		prg.run();
	}
}