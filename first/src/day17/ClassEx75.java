package day17;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.Scanner;

public class ClassEx75 {

	public static void main(String[] args) {
		
		

		// 사용자로부터 입력을 받고, 입력받은 형태로 파일로 저장해보자.
	
		// 입력 : 파일명 입력받고, 저장할 문자열도 입력
		String file, str;		
		Date date = new Date();
		Scanner sc = new Scanner(System.in);
		
		
		str = "파일생성시간\n\n"+date+"\n\n";
		
		//파일명 입력받기 : c:\\tmp\\outStrWrt.txt  (텍스트 파일로 저장되게)
		System.out.println("파일 이름 입력>>");
		file =sc.nextLine().trim(); // 앞뒤 공백 제거해서 변수에 저장
		// 파일에 저장할 내용 입력받기
		System.out.println("저장할 문자열 입력>>");
		str+=sc.nextLine();
		
		FileOutputStream fout = null;	// 바이트 스트림
		OutputStreamWriter out = null;	// 문자 스트림
		
		try {
			
			fout = new FileOutputStream(file);	// 파일경로 주고 바이트 스트림 생성
			out = new OutputStreamWriter(fout, "UTF-8"); // outputStream 주고 // 인코딩 줄 수 있음
			
			out.write(str);	// 파일에 쓰기
			out.flush();	// 스트림 비워주기
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fout != null)try {
				fout.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			if(out != null)try {
				out.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			if(sc != null)try {
				sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		

	}

}
