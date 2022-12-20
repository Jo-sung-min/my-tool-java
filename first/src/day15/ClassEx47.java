package day15;

import java.util.Calendar;

public class ClassEx47 {
	
	static String toCalString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일 "; 
	}
	
	public static void main(String[] args) {

		Calendar now = Calendar.getInstance(); // 현재 시각 기준으로 
		System.out.println(now);
		
		// 년도와 월 알아내기 
		int year = now.get(Calendar.YEAR); 
		int month = now.get(Calendar.MONTH) + 1;  // 0 ~ 11월 : 0 = 1월, 11 = 12월
		System.out.println("year : " + year);
		System.out.println("month : " + month);
		
		// 일 = 1, 월 = 2, 화 = 3 ..... 토 = 7
		final String[] DAY_OF_WEEK = {"", "일","월","화","수","목","금","토"}; 
		
		System.out.println(toCalString(now));
		System.out.println(DAY_OF_WEEK[now.get(Calendar.DAY_OF_WEEK)] + "요일");
		
		Calendar date1 = Calendar.getInstance(); 
		date1.set(2022,11,25); // 올해 크리스마스로 세팅 
		System.out.println(toCalString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일");
		
		
		
		
		
		
		
		
		
	}
}
