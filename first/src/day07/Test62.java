package day07;


class TvEx{
	//인스턴스 기본형 변수
	//클래스 변수
	static boolean power = false;
	int vol = 0, ch =1;
}





public class Test62 {
	

	public static void main(String[] args) {
		//지역변수 기본형 변수
		int a = 10;
		//지역 참조형 변수
		String str = "hello";
		//i 지역 기본형 변수 : for 문 끝나면 없어짐
		System.out.println(TvEx.power);
		//인스턴스 변수 출력 : 객체생성해야 사용가능
		TvEx sm = new TvEx();
		
		System.out.println(sm.ch);
		System.out.println(sm.vol);
		
		TvEx tv1 = new TvEx();
		TvEx tv2 = new TvEx();
		tv1.power = true;
		tv1.ch = 120;
		System.out.println(tv1.power+" "+tv1.ch);
		System.out.println(tv2.power+" "+tv2.ch);
		
		
	}

}
