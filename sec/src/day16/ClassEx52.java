package day16;

import java.util.ArrayList;

public class ClassEx52 {
	public static void main(String[] args) {

		// #1. ArrayList 객체 생성 
		// 클래스명<제네릭타입> 변수명 = new 클래스명<제네릭타입>(); 
		ArrayList<Integer> list = new ArrayList<Integer>();
		//ArrayList<int> list = new ArrayList<int>(); 기본형으로 타입지정 불가!!! 
		
		// #2. 요소 삽입 
		list.add(10);
		list.add(20);
		list.add(30);

		// null 삽입가능 주의!
		list.add(null); 
		
		// 원하는 인덱스위치에 삽입 가능
		list.add(2, 100);
		System.out.println(list);
		
		// #3. 요소 꺼내기 
		Integer i = list.get(0); // 리턴타입 그대로 받기 
		int ii = list.get(1);	 // 언박싱해서 기본형으로 받기 
		System.out.println(ii);
		
		// #4. 요소의 개수
		int size = list.size(); 
		System.out.println("저장된 요소의 개수 : " + size);

		// #5. 요소의 삭제 
		list.remove(2); // remove(int index) : 인덱스 번호로 삭제 
		System.out.println(list);
		//list.remove(10); // remove(Object o) : 요소와 같은거 삭제 에러발생!!! 인덱스로 인식함  
		list.remove(new Integer(10)); // 요소와 같은거 삭제시 객체로 전달해줘야함.
		// 기본형값 -> index, 객체값 -> 값으로 인식 
		System.out.println(list);
		
		// #6. 요소 모두 삭제 
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		
		
		
		
	}
}
