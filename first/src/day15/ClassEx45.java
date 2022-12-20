package day15;

public class ClassEx45 {
	public static void main(String[] args) {

		Integer i = new Integer(10); 
		// Integer -> int 
		int ii = i.intValue(); 
		System.out.println(ii);
		
		// 문자열 -> 기본형 
		int num = Integer.parseInt("132"); 
		
		boolean bool = Boolean.parseBoolean("true"); 
		
		
		Character c  = new Character('c');
		// Character -> char
		char cc = c.charValue(); 
		System.out.println(cc);
		
		Double d = new Double(3.14);
		d.doubleValue();
		
		Boolean b = new Boolean(true);
		b.booleanValue(); 
 
		
		
		
		
		
	}
}
