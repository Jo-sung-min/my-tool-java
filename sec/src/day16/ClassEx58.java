package day16;

import java.util.ArrayList;
import java.util.Arrays;
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
		
		List sub = list1.subList(1, 4); // 1 ~ 4번 인덱스 전까지 잘라서 리턴 c.f String의 substring(시작, 끝)
		ArrayList list2 = new ArrayList(sub); 
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		
		Collections.sort(list1);
		System.out.println("list1 : " + list1);
		
		// list1이 list2에 있는 모든 요소를 가지고 있니?
		System.out.println(list1.containsAll(list2));
		list2.add(100);
		list2.add(200);
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println(list1.containsAll(list2));
		// 요소 수정 : set(int idx, 값) 
		System.out.println(list2.set(3, 500));
		System.out.println("list2 : " + list2);
		
	
		
		
		
		
		
		
		
		
	}
}
