package day08;

class Tv{
	//변수: 채널, 볼륨, 전원
	//메서드 : 전원 on off, 채널변경, 볼륨조정, 채널입력해서 변경
	int ch = 0; 
	int vol = 0;
	boolean power = false;
	
	void powerOnOff() {
		power = !power; // boolean 쓸때 유용함 반전시킨 값을 넣겠다.
	}
	void chUp() {
		ch++;
	}
	void chDown() {
		ch--;
	}
	void volUp() {
		vol++;
	}
	void volDown() {
		vol--;
	}
	int chChange(int a) {
		 ch = a;
		return ch;
	}
	
	
	
}


public class Test69 {

	public static void main(String[] args) {

		
		Tv tv = new Tv();
		System.out.println(tv.power);
		
		tv.powerOnOff();
		System.out.println(tv.power);
		
		tv.volDown();
		System.out.println(tv.vol);
		
		tv.chChange(7);
		
		System.out.println(tv.ch);
		
		
		
	}

}
