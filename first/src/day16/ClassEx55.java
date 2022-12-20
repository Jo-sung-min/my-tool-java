package day16;

import java.util.ArrayList;

public class ClassEx55 {

	public static void main(String[] args) {
		
		//제네릭 타입 지정하지 않고 사용
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("orange");
		/*
		list.add(10);
		list.add(3.14);
		list.add(true);
		*/
		System.out.println(list);
		//요소를 전체 대문자로 바꾸어 출력해보자.
		for(int i = 0 ;i<list.size() ; i++){
			Object o  = list.get(i);
			if(o instanceof String) {
			String s = (String)o;
			System.out.println(s.toUpperCase()); 
			
			}
		}
		//제네릭 사용
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("apple");
		strList.add("oRange");
		
		for(int i = 0 ;i<strList.size() ; i++){
				String s = strList.get(i);
				System.out.println(s.toUpperCase());
			}
		
		
		
		// 업그레이드 포몬
		for(String s : strList) {
			System.out.println(s.toLowerCase());
		}
		
		
		
		
		
		
		
		
		}
		
		
	}


