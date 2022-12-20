package day17;



class ThreadEx extends Thread{
	int n=0;
	@Override
	public void run() {
		
		while(true) {
				n++;
				System.out.println(n);
				try {
					sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
					return; // 메서드 강제종료
				}
			}
			
	}
	
	
	
}
public class ClassEx78 {
	public static void main(String[] args) {

	ThreadEx th =new ThreadEx();
	th.start();
	//th.run(); // 스레드 만들어서 두개로 돌린게 아니라 main 혼자 
	// 일반메서드 호출처럼 일한것. >> 싱글 스레드
	
	for(int i = 0 ;i<100 ;i++) {
		System.out.println("Main......");
		
		
	}

	
	
	
	
}
}