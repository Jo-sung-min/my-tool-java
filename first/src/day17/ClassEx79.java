package day17;

class TimeRunnable implements Runnable{
	int n = 0;
	@Override
	public void run() {
		while(true) {
			n++;
			System.out.println(n);
			try {
				Thread.sleep(1000);
				
			} catch (Exception e) {
					e.printStackTrace();
					return ; 
			}
		}
	}
}



public class ClassEx79 {

	public static void main(String[] args) {

		TimeRunnable time = new TimeRunnable();
		Thread th = new Thread(time);
		th.start();
		
		System.out.println("main 종료");
		
		
		
		
		
		
	}

}
