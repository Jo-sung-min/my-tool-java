package day16;

import java.util.Vector;

public class ClassEx56 {
	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		// 요소 추가 
		v.add("hello"); 
		v.add("hi");
		//v.add(10);
		v.add(null);
		v.add(1, "hahahaah");
		System.out.println(v);
		
		// 요소 꺼내기 
		String value = v.get(0);
		String elem = v.elementAt(0);
		System.out.println(value);
		System.out.println(elem);
		
		System.out.println(v.size());
		
		v.remove(0);
		System.out.println(v);
		System.out.println(v.get(0));
		
		v.clear();
		System.out.println(v);
		
		Vector v2 = new Vector();
		v2.add(10);
		v2.add("hello");
		System.out.println(v2);
		
		
		
		
		
		
		
		
		
	}
}
