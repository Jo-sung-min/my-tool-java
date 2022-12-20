package day15;

import java.util.Calendar;

public class ClassEx49 {
	
	static String toCalString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일 "; 
	}
	
	public static void main(String[] args) {

		Calendar date = Calendar.getInstance(); 
		date.set(2022, 7, 31);	// 2022 8 31
		
		System.out.println(toCalString(date));
		System.out.println("= 1일 후 =");
		date.add(Calendar.DATE, 1);
		System.out.println(toCalString(date));
		
		System.out.println("= 6달 전 =");
		date.add(Calendar.MONTH, -6);
		System.out.println(toCalString(date));
		
		System.out.println("= 31일 후(roll) =");
		date.roll(Calendar.DATE, 31);
		System.out.println(toCalString(date));
		date.add(Calendar.DATE, 31);
		System.out.println(toCalString(date));
		
		
		
	}
}
