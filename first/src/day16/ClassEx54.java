package day16;

import java.util.ArrayList;

class Point {
	
	
	private int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	@Override
	public String toString() {
		return "("+x+", " +y+" )";
	}
	
	
	
	}
	

public class ClassEx54 {
	static void printArray (ArrayList<Point> arrayList) {
		for(int i = 0 ;i<arrayList.size();i++) {
			Point p  =arrayList.get(i);
			System.out.println(p);
		}
	}

	public static void main(String[] args) {
		
		ArrayList<Point>  list= new ArrayList<Point>(); // 이 어레이 리스트에는 포인트 객체만 저장가능하다는 뜻
		//요소 추가
		list.add(new Point(2,3));		// 그냥 객체생성 안되고 x y 값 넣으면서 객체생성
		list.add(new Point(-10,30));		
		list.add(new Point(100,200));		
		list.add(1,new Point(123,456));
		// 요소 삭제
		list.remove(2);
		System.out.println(list);
		// 모든 요소를 검색해서 출력
		
		for(int i = 0 ;i<list.size() ; i++) {
			Point p = list.get(i);
			System.out.println(p);
		}

	
		printArray(list);
		
		
		
	}

}
