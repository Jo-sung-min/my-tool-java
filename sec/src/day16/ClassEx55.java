package day16;

import java.util.ArrayList;
import java.util.List;

public class ClassEx55 {
	public static void main(String[] args) {

		// 제네릭 타입 지정하지 않고 사용 
		ArrayList list = new ArrayList();
		// 요소 추가 : 다양한 타입 같이 저장가능 
		/*
		list.add(10); 
		list.add(true);
		list.add(3.14); 
		list.add('A');
		*/
		list.add("appLe"); 
		list.add("oRange"); 
		
		// 요소를 전체 대문자로 바꾸어 출력해보자.
		for(int i = 0; i < list.size(); i++) {
			Object o = list.get(i); // Object로 리턴해주기때문에 
			String s = null; 
			if(o instanceof String) {
				s = (String)o; // 객체 기능을 온전히 사용하려면 형변환이 필요 
			}
			System.out.println(s.toUpperCase());
		}
		
		// 제네릭 사용 
		List<String> strList = new ArrayList<String>(); 
		strList.add("appLe");
		strList.add("oRange");
		/*
		for(int i = 0; i < strList.size(); i++) {
			String s = strList.get(i);
			System.out.println(s.toUpperCase());
		}
		*/
		// 업그레이드 포문 
		for(Object o : list) {
			String s = null; 
			if(o instanceof String) {
				s = (String)o; 
			}
			System.out.println(s.toLowerCase());
		}
		
		for(String s : strList) {
			System.out.println(s.toLowerCase());
		}
		
		
		
		
		
		
		
		
		
		
	}
}
