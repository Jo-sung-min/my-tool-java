package day15;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class ClassEx51 {
	public static void main(String[] args) {
	
		// 날짜 입력받아 현재 시간과의 날짜 차이 출력 
		String pattern = "yyyy/MM/dd"; 
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner sc = new Scanner(System.in); 
		
		Date inputDate = null; 
		
		System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.");
		// 패턴에 맞게 제대로 입력할때까지 반복시키기 
		while(sc.hasNextLine()) {
			try {
				// 문자열 -> Date 객체 
				// parse("날짜형태의 문자열") -> Date 객체로 변환해줌 
				// 이때 날짜 문자열의 pattern은 미리 정해놓기 .
				// -> 패턴에 맞는 문자열을 주면, Date 객체로 맞게 변환해서 리턴해줌.
				inputDate = df.parse(sc.nextLine()); 
				break;
			}catch(Exception e) {
				System.out.println("날짜를 " + pattern + "형태로 다시 입력해주세요.");
			}
		}
		
		//System.out.println(inputDate);
		
		Calendar cal = Calendar.getInstance(); // Date를 Calendar로 바꿀때 사용
		cal.setTime(inputDate); // Date -> Calendar
		Calendar now = Calendar.getInstance(); // 현재 시각 
		
		long hours = Math.abs(cal.getTimeInMillis() - now.getTimeInMillis()) / (1000*60*60); 
		System.out.println(hours + "시간 차이");
	
		
		HashMap map = new HashMap(); 
		boolean result = map.containsValue(0);
		System.out.println(result);
		
		
		
	}
}
