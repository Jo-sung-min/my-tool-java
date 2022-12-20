package day09;
import java.util.Scanner;

class MobPhone{
	String phoneName;
	String text ;
	double x=3.5;
	double y=4.5;
	double wei=5;
	//전화걸기
	String [] PhoneNumber = new String [1];
	
	void calling1(String [] b) {
		
			PhoneNumber[0]= b[0];
			System.out.println(PhoneNumber[0]);
			System.out.println("전화중.....");
			}
		//전화받기
	void reciveCall(char a) {
		if(a=='y') {
			System.out.println("전화를 받았습니다.");
		}
		if(a=='n') {
			System.out.println("연결이 종료되었습니다.");
		}
	}		
	//문자보내기
	String mail(String a) {
		System.out.println(a+"\n"+"발신했습니다.");
		return text= a;
	}
		//문자받기
	void mailRecive() {
		
		System.out.println("문자가 도착했습니다."+text+"\n");
		
	}
	
}

public class Test76 {

	

	public static void main(String[] args) {
	
	/*	5. 모바일 폰 클래스 만들기 
		   MobPhone 클래스를 만들고, 
		   브랜드 이름, 폰의 가로크기, 세로크기, 무게를 저장할 변수를 만드세요. 
		   그리고, 전화걸기, 전화받기, 문자 보내기, 문자받기 메서드도 추가하세요. 
		   (메서드 안에는 실행되었는지 확인하기 위해 단순히 출력문 하나만 작성) 
*/		   
		String n ;
		String[] arr = new String [1];
		MobPhone gell = new MobPhone() ;
		System.out.println("전화번호를 누르세요");
		
		Scanner sc = new  Scanner(System.in);
					arr[0] = sc.nextLine();
					
		//전화걸기
		gell.calling1(arr);
		//전화받기
		System.out.println("전화를 받으시겠습니까? y/n");
		gell.reciveCall(sc.nextLine().charAt(0));
		//문자보내기
		System.out.println("보낼 메세지를 입력해 주세요");
		gell.mail(sc.nextLine());
		//문자받기
		System.out.println("문자가 도착했습니다 확인하시겠습니까? y / n");
		if (sc.nextLine().equalsIgnoreCase("y")) {
			gell.mailRecive();
			
		};
			
	

}
	

}
