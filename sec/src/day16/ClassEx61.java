package day16;

import java.util.HashSet;
import java.util.Set;
class Tv {}
public class ClassEx61 {
	public static void main(String[] args) {

		Object[] objArr = {"1", 1, "2", "2", "3", "3", "4", "4", "4"}; 
		HashSet set = new HashSet(); 
		for(int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]); 
		}
		System.out.println(set);
		
		Set set2 = new HashSet(); 
		set2.add(new String("abc")); // 특이한 애 
		set2.add(new String("abc"));
		set2.add(new Tv());
		set2.add(new Tv());
		
		System.out.println(set2);
		
		
		
	}
}
