package day16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ClassEx60 {

	public static void main(String[] args) {

		
		HashMap<String, String> map = new HashMap<String, String>();
		// 요소 삽입
		map.put("apple", "사과");
		map.put("strawberry", "딸기");
		
		
		//map.put("apple", "부사 ");	// 같은 키값에 값을 넣으면 수정이 된다.
		System.out.println(map);
		// 값 꺼내기: 키주면 벨류 리턴해줌
		System.out.println(map.containsKey("apple")); // 키 값에 애플을 가지고 있니?>
		System.out.println(map.containsValue("사과")); //키 값에 사과를  가지고 있니?>
		
		Set set = map.entrySet();
		System.out.println(set);
		
		Collection<String> col = map.values();
		col.iterator();
		
		
		
		String val = map.get("apple");
		System.out.println(val);
		String val2 = map.get("strawberr"); // 없으면 null 로 리턴해줌
		System.out.println(val2);
		
		
		//요소 삭제 : 키값 주고 삭제
		map.remove("apple");
		System.out.println(map);
		
		//요소의 개수
		System.out.println(map.size());
		
		
		// 전체 검색  순서 x , 인덱스 > key 사용자 정의, key 값에도 순차가 없다.
		Set<String> keys =map.keySet(); // 맵에서 키들만 뽑아오기
		Iterator<String>it = keys.iterator();
		while(it.hasNext()) {// 반복자의 마지막 요소까지 반복해라
			String key = it.next();	//반복자에서 요소 하나 꺼내기 = key하나 꺼냄
			String value = map.get(key);//map 에 꺼낸 key 값주고 value 값 꺼내기
			System.out.println(value);
			
			
			
		}
		
		
	}

}
