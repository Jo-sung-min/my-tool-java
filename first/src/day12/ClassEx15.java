package day12;
// 아래 추상클래스 Calculator 를 상송받은 MyCalc 클래스를 구현하게요

abstract class Calculator {
	public abstract int add(int a, int b); //두 정수의 합을 리턴
	public abstract int substract(int a , int b);// 두정수의 차를 리턴
	public abstract double average(int [] a);//배열에 저장된 정수의 평균값리턴
}

class MyCalc extends Calculator{
	
	
	@Override
	public int add(int a, int b) {
		int c = a +  b;
		return c;
	}
	@Override
	public int substract(int a, int b) {
		int c = a - b;
		return c;
		
	}
	@Override
	public double average(int[] a) {
		
		int total =0  ; 
		
		for(int i=0 ; i<a.length ;i++) {
			total += a[i];
		}
		return (double)total / a.length;
	}
	
	
}




public class ClassEx15 {

	public static void main(String[] args) {
		int [] arr = new int[3];
		for(int i=0 ;i<arr.length ;i++) 	{
			arr[i] =i;
		};
		MyCalc cal = new MyCalc();
		System.out.println(cal.add(1, 2));
		System.out.println(cal.substract(10, 5));
		System.out.println(cal.average(arr));
	}

}
