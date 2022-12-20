package day12;
abstract class Calculator {
	public abstract int add(int a, int b); //두 정수의 합을 리턴
	public abstract int substract(int a , int b);// 두정수의 차를 리턴
	public abstract double average(int [] a);//배열에 저장된 정수의 평균값리턴
}	
	
class Mycal extends Calculator {
	
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int substract(int a, int b) {
		return a-b;
	}
	@Override
	public double average(int[] a) {
		int total = 0;
		for(int c : a ) {
			total += c ;
		}
		return (double)total/a.length;
	}
	
}


	
public class ClassEx15 {
	
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5};
		
		Mycal p = new Mycal();
		
		System.out.println(p.add(3, 2));
		System.out.println(p.substract(5,2));
		System.out.println(p.average(arr));
		
		
		
	}

}
