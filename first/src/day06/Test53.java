package day06;

public class Test53 {
	public static void main(String[] args) {

		// 랜덤 : 난수 : 임의의 수 : 0 ~ 1 사이 실수의 값으로 돌려줌.
		for(int i = 0; i < 10; i++) {
			//System.out.println(Math.random());
			// 0 ~ 9 사이 랜덤값 
			// 1 ~ 10 사이 랜덤값 
			//System.out.println((int)(Math.random() * 10) + 1);
			// 1 ~ 5 사이 랜덤값  0 ~ 4 + 1
			//System.out.println((int)(Math.random() * 5) + 1);
			// 12 ~ 17사이 랜덤값  0 ~ 5 + 12
			System.out.println((int)(Math.random() * 6) + 12);
		}
		
		
		
		
		
		
		
		
	}
}
