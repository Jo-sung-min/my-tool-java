package day16;

import java.util.ArrayList;

class Point {
	private int x, y; 
	public Point(int x, int y) {
		this.x = x; this.y = y; 
	}
	@Override
	public String toString() {
		return "(" + x + "," + y + ")"; 
	}
}
public class ClassEx54 {
	public static void main(String[] args) {

		// Point[] list = new Point[많이]; 
		
		ArrayList<Point> list = new ArrayList<Point>(); 
		// 요소 추가 
		list.add(new Point(2,3)); 
		list.add(new Point(-10,30)); 
		list.add(new Point(100,200)); 
		list.add(1, new Point(123, 456)); 
		// 요소 삭제 
		list.remove(2);
		System.out.println(list);
		// 모든 요소를 검색해서 출력 
		for(int i = 0; i < list.size(); i++) {
			Point p = list.get(i);
			System.out.println(p);
		}
		System.out.println("============");
		printArray(list);
	}//main
	static void printArray(ArrayList<Point> arrayList) {
		for(int i = 0; i < arrayList.size(); i++) {
			Point p = arrayList.get(i);
			System.out.println(p);
		}
		
	}
	
	
	
	
}
