package day17;

import java.io.FileOutputStream;

public class ClassEx71 {

	public static void main(String[] args) {

		byte[] b = {7,14,5,-1,45,100};
		// 파일로 내보내기
		try {
			// #1. 객체생성 >> 출력스트림 생성
			FileOutputStream fout =new FileOutputStream("c:\\tmp\\test.out");
			//#2. 출력내보내기 >> 쓰기
			/*
			for(int i = 0 ;i<b.length ; i++) {
				fout.write(b[i]);// write(int b)
				
			}*/
			fout.write(b);  // 배열 통으로 내보내기
			fout.close();
			
		} catch (Exception e) {
			e.printStackTrace();  // 에러발생시 빨간색 추적 메세지 출력해라~
			
		}
		
		
		
		
		
	}

}
