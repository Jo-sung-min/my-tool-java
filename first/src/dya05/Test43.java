package dya05;

public class Test43 {

	public static void main(String[] args) {

		
		
		// 배열 선언
		int [] score=null; 
		
		
		score = new int[3]; //방 3개짜리 만들기
		
		//선언 + 할당
		int [] score1 = new int[3];
		
		
		score [0] =10;
		score [1] =20;
		score [2] =30;
		
		System.out.println(score); /// 메모리상에 저장된 위치 주소가 저장된다.
		System.out.println(score[0]); // 이렇게 해줘야 나온다.
		System.out.println(score[1]);	// 같은 타입만 저장가능 int 나 long 혼합안됨 물론 string 도 안댐
		System.out.println(score[2]);

		int a = score[0];  // score 이렇게 선언하면 주소기 때문에 int 에 담기지 않는다.
		int total = 0 ;
		for (int i = 0 ; i<3 ; i++) {
			total += score[i];
		}System.out.println(total);
	
		
		System.out.println(score.length); // 방의 갯수를 나타낸다.
		
		
		

	}

}
