package day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ClassEx59 {

	public static void main(String[] args) {
			
		Vector<Integer> v = new Vector<Integer>();
		// 벡터의 iterator() 메서드를 호출해서,
		// v 의 각 요소를 순차적으로 검색할 수 있는 Iterator (반복자) 객체얻기.
		/*
		Iterator<Integer> it = v.iterator();
		
		while(it.hasNext()) {	//다음칸에 요소가 있으면 true
		int value = it.next(); // 커서를 다음칸으로 옮기고 다음칸에있는 데이터 리턴받기
			//.........
		}
		*/
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(1,100);	// 중간삽입
		
		
		
		 Iterator<Integer> it =list.iterator();
		 while(it.hasNext()) {
			 int val =it.next();
			 System.out.println(val);
		 }
		// list 에 있는 모든 정수의 합을 구해서 출력을 해보자
		 
		 
		 it = list.iterator();
		 int sum = 0 ; 
		 while(it.hasNext()) {
			 int val = it.next();
			 sum+= val;
			 
		 }
		System.out.println(sum); 	//이터레이터를 또 사용하고 싶으면 반복자를 다시 얻어와야함 한번
									// 다 지나가서 값이 0으로 나온다.
		
		
		
		
		
		
	}

}
