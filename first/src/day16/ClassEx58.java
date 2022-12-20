package day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ClassEx58 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(5);
		list1.add(3);
		list1.add(4);
		list1.add(0);
		list1.add(1);
		list1.add(2);
		
		
		List sub =	list1.subList(1, 4); // from 인덱스와 to 인덱스 가지고 있음 1번부터 4번 전까지
		ArrayList list2 = new ArrayList(sub);
		//System.out.println(list1);
		//System.out.println(list2);
		
		Collections.sort(list1); // collections 유틸 불러오기
		System.out.println(list1);
		//list1 이 list2 에 있는 모든 요소를 가지고 있니 ?
		
		System.out.println(list1.containsAll(list2));
		list2.add(200);
		System.out.println(list1.containsAll(list2));
		// 요소 수정
		System.out.println(list2.set(3, 400)); // 리턴해주는값은 200 ** 중요 
	
		System.out.println(list2);
	}

}
