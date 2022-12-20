package day09;
/*
Tv 기능 구현 
1. 채널 = 배열 10개방 만들어 랜덤값 10개 생성후 배열에 낮은값부터 대입 
2. 채널(Up,Down) 
3. 채널값 입력받아 저장 (없는 채널 입력시 변경 안됨) 
4. 볼륨은 0 ~ 10까지 증감 
5. 음소거 기능 
6. Tv 상태값 출력하는 메서드 (전원, 채널, 볼륨) 
7. 전원이 꺼져있는 경우 모든 기능 동작 안함.
*/
class Tv {
	boolean power = false;
	int [] channel = new int[10];
	int chIdx = 0; // 현재 보는 채널의 인덱스번호 들고 있을 변수  
	int vol = 0; 
	
	// 전원 on/off
	void powerOnOff() {
		power = !power;
	}
	// 티비 세팅하기
	void setTv() {
		if(power) {
			System.out.println(power ? "ON" : "OFF");
			setChannel();	// 채널 세팅 호출 
			for(int c : channel){ System.out.print(c + " "); }
			System.out.println();
		}else {
			System.out.println("전원 키고 사용하세요....");
		}
	}
	// 채널 세팅하는 기능 
	void setChannel() {
		// 방크기만큼 반복해서 랜덤값 뽑아 배열에 저장 
		for(int i = 0; i < channel.length; i++) {
			channel[i] = (int)(Math.random() * 10) + 1; // 1 ~ 100사이 랜덤값
			// 중복처리 
			for(int j = 0; j < i; j++) {
				if(channel[i] == channel[j]) {
					i--;
				}
			}
		}
		// 오름차순으로 채널들 정렬 
		for(int i = 0; i < channel.length-1; i++) {
			int min = i; 
			for(int j = i+1; j < channel.length; j++) {
				if(channel[min] > channel[j]) {
					min = j; 
				}
			}
			int tmp = channel[i];
			channel[i] = channel[min]; 
			channel[min] = tmp; 
		}
	}//
	String getTvInfo() {
		// 상태값들 문자열로 만들어 리턴 
		return "전원: " + (power?"ON":"OFF") + " 채널: " + channel[chIdx] + " 볼륨: " + vol;
	}
	// 채널 조정 
	void chUp() {
		if(power) {
			chIdx++; 
			if(chIdx == 10) { // 마지막방보다 넘어서면 맨 앞으로 이동 
				chIdx = 0; 
			}
		}else {
			System.out.println("전원을 켜주세요...");
		}
	}
	void chDown() {
		chIdx--; 
		if(chIdx == -1) { // 첫번째보다 더 앞으로 가면 맨 뒤로 이동 
			chIdx = 9; 
		}
	}
	// 채널 입력받아 변경 
	void chChannel(int ch) {
		for(int i = 0; i < channel.length; i++) {
			if(channel[i] == ch) {
				chIdx = i;
			}
		}
	}
	// 볼륨 조정 
	void volUp() {
		if(vol < 10) { vol++; }
	}
	void volDown() {
		if(vol > 0) { vol--; }
	}
	// 음소거 
	void mute() {
		vol = 0; 
	}
	
}

public class Test71 {
	public static void main(String[] args) {

		Tv tv = new Tv(); // 티비 하나 만듬.
		//tv.powerOnOff(); // 전원켰다. 
	/*	tv.setTv();	// 티비 세팅 
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
		tv.chDown();*/
		tv.setChannel();
		
		System.out.println();
		System.out.println(tv.getTvInfo()); // 티비 상태 출력 
		tv.mute();
		System.out.println(tv.getTvInfo()); // 티비 상태 출력 
		tv.chChannel(21);
		System.out.println(tv.getTvInfo()); // 티비 상태 출력 
		
		
		
		
	}
}
