package day17;

import java.io.FileInputStream;

public class ClassEx73 {

	public static void main(String[] args) {

		
		byte [] b = new byte[6]; 		// 빈 배열 만들기
		
		FileInputStream fis = null;
		try {
			
			// 입력스트림 생성
			fis = new FileInputStream("c:\\tmp\\test.out");
			//#2-1. 한바디트 씩 읽어와 배열에 저장
			int n = 0 ; // 배열 인덱스로 사용할 변수
			int c ; // 파일의 읽은 데이터 임시저장변수
			while((c=fis.read()) != -1) {	// 파일의 끝(EOF)까지 반복해서 읽기
				b[n] = (byte)c;// int 로 읽어오므로 byte 로 형변환해 byte 배열에 담기
				n++;
				//#2-2
				//한번에 읽어오기
				//fis.read(b);
				
				
			}
			//#3. 잘 읽었는지 출력해서 확인
			for(int i = 0 ;i<b.length ; i++) {
				System.out.println(b[i]);
			}System.out.println();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			if(fis!=null) try {
				fis.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		
		
	}

}
