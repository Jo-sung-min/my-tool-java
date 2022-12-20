package day17;

import java.io.FileInputStream;

public class ClassEx74 {

	public static void main(String[] args) {

		String file = "c:\\tmp\\fout.txt";
		int c = 0 ;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			while((c= fis.read()) !=-1) {
				System.out.print((char)c); // 한글은 텍스트 깨짐
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fis!=null) try {
				fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
				
			}
		}
		
		
		
		
		
	}

}
