package day13;

import java.util.Scanner;

// 인터페이스
/*
	Stack 인터페이스를 상속받아 문자열을 저장하는 StringStack 클래스를 구현하세요. 
	아래와 같은 실행결과가 나오도록 main()을 참고하여 작성하세요. 
	실행결과:
		총 스택 저장 공간의 크기 입력 >>  3 (사용자가 입력)
		문자열 입력 >> hello
		문자열 입력 >> sunny
		문자열 입력 >> smile
		문자열 입력 >> happy
		스택이 꽉 차서 푸시 불가!
		문자열 입력 >> 그만
		스택에 저장된 모든 문자열 팝 : smile sunny hello
*/
interface Stack {
	int length();					// 현재 스택에 저장된 개수 리턴
	int capacity();					// 스택의 전체 저장 가능한 개수 리턴
	String pop();					// 스택의 톱(top)에 저장된 문자열 리턴하고 저장소에서 문자열 삭제
	boolean push(String val);		// 스택의 톱(top)에 저장소에 문자열 넣고 실행 결과 boolean 타입으로 리턴
}
class StringStack implements Stack {
	private String [] data; // 문자열 저장할 배열 
	private int top = -1; 		// 스택의 top이 어딘지 들고 있을 변수 
								// = 마지막에 저장된 데이터의 인덱스 번호 
	
	@Override
	public int length() { // 현재 스택에 저장된 개수 리턴
		// 저장소에 접근 -> 인스턴스로 만들어서 가능해짐  
		return top + 1; // 개수는 인덱스번호 + 1 한것 
	}
	@Override
	public int capacity() { // 스택의 전체 저장 가능한 개수 리턴
		if(data != null) {
			return data.length;
		}else {
			return 0; 
		}
	}
	@Override
	public String pop() { // 가장마지막에 저장된 문자열 리턴하고 저장소에서 문자열 삭제
		if(top == -1) {  // 저장소가 비어있으면 null 리턴하고 메서드 종료!
			return null; 
		}
		String str = data[top]; // 마지막데이터 문자열 꺼내서 담아두기  
		data[top] = null;		// 공간은 null로 만들어 문자열 지우기 
		top--; 					// 인덱스 앞으로 옮기기 (저장된 마지막 인덱스가됨) 
		return str;				// 문자열 리턴 
	}
	@Override
	public boolean push(String val) { // 저장소에 문자열 넣고 실행 결과 boolean 타입으로 리턴
		if(top == data.length-1) { // 공간이 꽉찼으면 false리턴만 
			return false;
		}else { // 공간이 남았으면 체우기 
			top++; 
			data[top] = val;			
			return true;
		}
	}
	void run() {
		Scanner sc = new Scanner(System.in);
		// 저장 공간 크기 입력받기 
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int n = Integer.parseInt(sc.nextLine());
		
		// 입력받은 크기만큼 문자열 저장공간 배열로 만들기 
		data = new String[n];  
		
		// 문자열 입력받아 저장하기 (그만을 입력할때까지 반복) 
		while(true) {
			System.out.print("문자열 입력 >> ");
			String str = sc.nextLine(); 
			if(str.equals("그만")) { // 그만 입력시 while문 빠져나가기
				break;
			}
			boolean result = push(str); // push 메서드로 값 저장시키기 
			if(!result) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
		}
		// 저장된것 꺼꾸로 출력 
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		int len = length(); // 현재 저장되어있는 개수 구현한 메서드 호출해서 가져오기 
		for(int i = 0; i < len; i++) { // 저장된 개수만큼만 반복문 돌리기 
			System.out.print(pop() + " "); // 마지막꺼부터 꺼내서 출력
		}
		System.out.println();
		
		sc.close();
	}
}

public class ClassEx26 {
	public static void main(String[] args) {

		StringStack s = new StringStack();
		s.run();	// 프로그램 구동 시작

	}
}

