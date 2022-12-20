package day17;

import java.io.File;
import java.util.Date;

public class ClassEx70 {

	public static void main(String[] args) {
		//경로적을 떄 역슬래쉬 두개 "\\" >> \  한개임
		// 파일 객체 생성
		
		
		File f = new File("‪c:\\Windows\\system.ini");
		
		long size= f.length();
		String filename = f.getName();
		
		System.out.println(size);
		System.out.println(filename);
		//파일 경로
		String path = f.getPath();
		System.out.println(path);
		String absolutePath = f.getAbsolutePath();
		System.out.println(absolutePath);
		//상위폴더 : 부모 디렉토리
		String parent = f.getParent();
		System.out.println(parent);
		//파일 , 폴더 타입판병
		if(f.isFile()) {
			System.out.println("파일입니다.");
		}else if(f.isDirectory()) {
			System.out.println("폴더입니다.");
		}
		
		
		System.out.println("숨김속성 ="+ f.isHidden());
		System.out.println("읽기속성 ="+ f.canRead());
		System.out.println("쓰기속성 ="+ f.canWrite());
		Date date = new Date(f.lastModified());// Date 객체는 millis 주고 생성 가능
		System.out.println("수정날짜 ="+ date);
		
		File f2 = new File("c:\\Windows\\Temp");
		
		String[] subList = f2.list();
		
		for (int i = 0 ; i<subList.length ;i++) {
			System.out.println(subList[i]);
		}
		
		// 파일 생성
		
		File f3 = new File("c:\\tmp\\test.txt");
		try {
			f3.createNewFile();			// try catch 없으면 안만들어짐
		} catch (Exception e) {
			System.out.println("에러 발생...");
		}

		//디렉토리 만들기
		File f4 =new File("c:\\tmp\\hello");
		if(!f4.exists()) {// 존재하지 않으면
			f4.mkdir();
		}
		
		
		
		
		
	}
	

}
