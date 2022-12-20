package day17;

import javax.swing.JOptionPane;// JOptionPane


//타이머 스레드용
class ThreadTimer extends Thread{
	@Override
	public void run() {
		for(int i = 10 ;i>0 ;i--) {
			if(ClassEx80.inputCheck) {
				return;// run 메서드 종료 >> 타이머 종료
			}
			
			System.out.println(i);
			try {
				Thread.sleep(1000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}	System.out.println("10초동안 값이 입력되지 않아 종료합니다.");
			System.exit(0);
	}
}
// 입력받는 스레드용
class ThreadInput extends Thread{
	@Override
	public void run() {
		System.out.println("10초안에 값을 입력하셔야 합니다.ㅣ");
		String input =	JOptionPane.showInputDialog("아무값이나 입력하세요:"); 
		ClassEx80.inputCheck = true; // 입력상태 바꾸기
		System.out.println("입력하신 값은 "+input+"입니다.");
	}
	
}



public class ClassEx80 {
	
		static boolean inputCheck = false; // 입력했는지 상태값 저장한 변수
	
	public static void main(String[] args) {
		
		//10초 안에 입력하기
		ThreadTimer timer = new ThreadTimer();
		ThreadInput input = new ThreadInput();
		timer.start();
		input.start();
		System.out.println("스레드 이름"+timer.getName());
		System.out.println("스레드 id"+timer.getId());
		System.out.println("스레드 우선순위"+timer.getPriority());
		System.out.println("스레드 상태 객체"+timer.getState());
		
		
		/*
		// GUI (java.swing 패키지): GUi방식으로 입력받아 값 가져오는 명령
		String input =	JOptionPane.showInputDialog("아무값이나 입력하세요:"); 
		System.out.println("입력하신 값은 "+input+"입니다.");
		*/
		
		
		
		
		
		
	}

}
