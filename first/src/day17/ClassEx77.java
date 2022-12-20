package day17;
//#1. Thread 상속받은 클래스 선언
class TimerThread extends Thread{
	int n = 0 ;
	// run() 메서드 오버라이딩
	@Override
	public void run() {
		while(true) {
			n++;
			System.out.println(n);
			try {
					sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
				return; // 메서드 강제종료! >> run() 메서드 종료 > 스레드 x
			}
		}
	}
	
	
	
}
public class ClassEx77 {

	public static void main(String[] args) {

		//#3. 스레드 객체 생성
		TimerThread th = new TimerThread();
		// #4. 스레드 시작해라
		// th.start();// 스레드 하나더 생성
		th.run();// 스레드 안생기고 main 스레드가 혼자 하는것임.
		System.out.println("main 메서드 종료!!");
		
		
		
		
		
	}

}
