package day15;

import java.util.Calendar;

public class ClassEx48 {
	public static void main(String[] args) {
//두 날짜의 시간차이 구하기
		
		Calendar time1 = Calendar.getInstance(); 
		Calendar time2 = Calendar.getInstance(); 
		
		// time1 : 10시 20분 30초 
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		// time2 : 20시 30분 10초 
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		long difference = Math.abs(time1.getTimeInMillis() - time2.getTimeInMillis()) / 1000;
		System.out.println(difference);
		
		final int [] TIME_UNIT = {3600, 60, 1}; 
		final String[] TIME_UNIT_NAME = {"시간 ", "분 ", "초"}; 
		
		System.out.print("time1과 time2의 시간 차이는 ");
		String tmp = ""; 
		for(int i = 0; i < TIME_UNIT.length; i++) {
			tmp += difference/TIME_UNIT[i] + TIME_UNIT_NAME[i]; 
			difference %= TIME_UNIT[i]; 
		}
		System.out.println(tmp + "입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
