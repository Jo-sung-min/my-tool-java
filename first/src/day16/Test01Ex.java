package day16;

import java.util.ArrayList;
import java.util.Scanner;

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
		int idxNum= 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(true) {
			System.out.println("정수를 입력하시오");
			int num = Integer.parseInt(sc.nextLine()); 
			if(num==-1) {
				list.add(num);
				System.out.println(list);
				
				break;
			}
			list.add(num);
		}
		
		for(int j = 0 ;j<list.size() ;j++) {
			if(list.get(idxNum)<list.get(j)) {
				idxNum = j;
			}
		}System.out.println("가장 큰수는"+list.get(idxNum));
		
		
		
		
	}
}