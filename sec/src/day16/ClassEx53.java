package day16;

import java.util.ArrayList;

public class ClassEx53 {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>(); 
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(2, 100);
		
		// 모든 요소에 접근해서 꺼내어 출력 
		for(int i = 0; i < list.size(); i++) {
			int value = list.get(i);
			System.out.println(value);
		}
		
		// AL 안에 저장된 모든 정수를 더한 합계 
		int sum = 0; 
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i); // sum += arr[i]
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
