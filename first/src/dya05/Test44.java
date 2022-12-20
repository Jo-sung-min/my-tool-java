package dya05;

public class Test44 {

	public static void main(String[] args) {

	/*	
		int []  score = {100,80,70,60,50};
		
		System.out.println(score[0]+"  "+"점");
	*/	
		
		//초기화
		String [] name  = new String[3];  // 타입선언 = 새로운 방 배정
		String [] name1 = {"java","jsp", "spring","html","fff"};
	/*	for(int i = 0 ; i< name1.length ;i++) {
			System.out.println(name1[i]);
		}
		System.out.println("----------------------");
		*/
		//업그레이드 for 문 (forEach문)
		/*
		for( String s :name1 ) { //뒤에있는 배열의 갯수만큼 자동반복 2번째 반복할때는 알아서 2번째 값이 담긴다
			System.out.println(s);
		}
	*/
		// 레퍼런스 치환
		
	/*	
		int [] arr = {1,2,3,4,5};
		int [] myArr =arr;
		for(int i=0; i< myArr.length ;i++) {
			System.out.println(myArr[i]);
		}
		arr= null;
		
		
		System.out.println(arr[2]);
		*/
	
		
		
		//예제 , 최대값 , 최소값 구하기
		int [] score = {79,59,36,98,25};
		int max = score[0];
		int min = score[0];
		
		
		for(int i =0  ;i< score.length ;i++  ) {
			if(min>score[i]) {
				min = score[i];
			}
			if(max<score[i]) {
				max = score[i];
			}


		}System.out.println(min);
	System.out.println(max);
		
		
		
		
		
		
		
	}

}
