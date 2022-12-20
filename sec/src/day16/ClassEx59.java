package day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ClassEx59 {
	public static void main(String[] args) {

		/*
		Vector<Integer> v = new Vector<Integer>(); 
		
		// 벡터의 iterator() 메서드를 호출해서, 
		// v의 각 요소를 순차적으로 검색할 수 있는 Iterator(반복자)객체 얻기. 
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) { // 다음칸에 요소가 있으며 true
			int value = it.next(); // 커서 다음칸으로 옮기고 다음칸에 있는 데이터 리턴받기 
			//....
		}*/
		
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(1, 100);
		
		Iterator<Integer> it = list.iterator(); 
		while(it.hasNext()) {
			int val = it.next(); 
			System.out.println(val);
		}
		
		// list에 있는 모든 정수의 합을 구해서 출력
		int sum = 0; 
		it = list.iterator();	// 또 사용하고 싶으면 다시 반복자 얻어오기 
		while(it.hasNext()) {
			int val = it.next(); 
			sum += val;
		}
		System.out.println("ArrayList에 있는 정수의 합 : " + sum);
		
		
		
		
		
		
	}
}
