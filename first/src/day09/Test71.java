package day09;

import java.util.Scanner;

/*
	Tv 기능 구현
	1. 채널 = 배열 10개방 만들어 랜덤값 10개 생성후 배열에 낮은값부터 대입
	2. 채널 (Up,Down)
	3. 채널값 입력받아 저장 없는 채널을 입력했을때는 변경이 안되게
	4. 볼륨 0~ 10 까지 증감 음수와 10 초과는 안되도록
	5. 음소거 기능
	6. Tv 상태값 출력하는 메서드 (전원, 채널 , 볼륨)
	7. 전원이 꺼져있는경우 모든기능 동작 안함.
*/

class Tv {
		boolean power  = false; 
		int [] channel = new int [10];
		int chIdx = 0;
		int vol = 0;
		
		// 전원 온오프
		 
		void power() {
			power =! power;
		}
		//티비 셋팅
		void setTv() {
			if(power) {
				System.out.println(power?"ON":"Off");
			}
		}
			
		void setChannel() {
			for(int i = 0 ; i <channel.length ; i++) {
			channel[i] = (int)(Math.random()*100)+1;
			for(int j = 0 ; j <i ; j++) {
				if(channel[i]==channel[j]) {
					i--;
					}
				}
			}
		for(int i = 0 ; i<channel.length; i++) {
		int min = i ; 
			for(int j = 0 ;j<channel.length ; j++) {
				if(channel[min]>channel[j]) {
					min = j;
				}
			}
		}
		
	
	
	
	
	
	
	
	
	
}	
}
public class Test71 {

	public static void main(String[] args) {
	/*	Tv tv = new Tv(); // 티비 하나 만듬.
		//tv.powerOnOff(); // 전원켰다. 
		tv.setTv();	// 티비 세팅 
		System.out.println(tv.getTvInfo()); // 티비 상태 출력 
		tv.volUp();
		tv.volUp();
		tv.volUp();
		tv.volUp();
		System.out.println(tv.getTvInfo()); // 티비 상태 출력 
		tv.chUp();
		tv.chUp();
		System.out.println(tv.getTvInfo()); // 티비 상태 출력 
		tv.chDown();
		tv.chDown();
		tv.chDown();
		tv.chDown();
		System.out.println(tv.getTvInfo()); // 티비 상태 출력 
		tv.mute();
		System.out.println(tv.getTvInfo()); // 티비 상태 출력 
		tv.chChannel(21);
		System.out.println(tv.getTvInfo()); // 티비 상태 출력 */
	}

}
