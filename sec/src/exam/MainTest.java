package exam;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		ArrayList<Customer> list = new ArrayList<Customer>(); // 저장소 
		
		System.out.println("이름,전화번호,생년월일,주소 형태로 입력하세요.");
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String data = sc.nextLine(); 
			String[] splited = data.split(","); // 쉼표를 구분자로 분할하여 문자열배열로받기 
			String name = splited[0]; 
			String tel = splited[1]; 
			String birth = splited[2]; 
			String addr = splited[3];
			list.add(new Customer(name, tel, birth, addr));
		}
		
		// 콘솔에 출력 
		int size = list.size(); 
		String str = "전체 인원 : " + size + "\n";   // txt에 넘길 문자열 

		System.out.println("인원 : " + size);
		// 나머지 전체 정보 예시처럼 출력 
		for(int i = 0; i < list.size(); i++) {
			Customer co = list.get(i);
			String s1 = co.name + " " + co.tel + " "; // 출력&txt에 넘길 문자열
			String s2 = co.birth + " " + co.addr;
			System.out.print(s1); // 콘솔에 출력
			System.out.println(s2);
			str += s1; 
			str += s2 + "\n"; // txt에 넘길거 추가 
		}
		
		// txt 파일로 저장 : customer.txt 
		
		// ClassEx75 파일 참고 
		String file = "c:\\tmp\\customer.txt";
		
		FileOutputStream fout = null; // 바이트 스트림
		OutputStreamWriter out = null; // 문자 스트림 
		try {
			fout = new FileOutputStream(file); // 파일경로주고 바이트스트램생성 
			out = new OutputStreamWriter(fout, "UTF-8"); // outputStream 주고 문자스트림생성 
			
			out.write(str); // 파일에 쓰기 
			
			out.flush(); // 스트림 비워주기 
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fout != null) try {fout.close();}catch(Exception e) { e.printStackTrace();}
			if(out != null) try {out.close();}catch(Exception e) { e.printStackTrace();}
			if(sc != null) try {sc.close();}catch(Exception e) { e.printStackTrace();}
		}
		
		
		
		
		
	}
}
