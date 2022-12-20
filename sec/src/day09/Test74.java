package day09;

public class Test74 {

	static void add() {}
	static void add(int x) { System.out.println(x); }
	//static void add(int a) { System.out.println(a); }	
	static void add(long x) { System.out.println(x); }
	static void add(int a, int b) {System.out.println(a + b); }
	static void add(long a, int b) {System.out.println(a + b); }
	static void add(int b, long a) {System.out.println(a + b); }
	
	public static void main(String[] args) {

		add();
		add(100);
		add(10, 20L);
		
		
		
	}

}
