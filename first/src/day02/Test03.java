package day02;

public class Test03 {

	public static void main(String[] args) {
		char ch = '\u0042';
		System.out.println(ch);
		// 형변환 우겨 넣었는데 다시 처음부터 카운딩됨( 오버플로우 됐다고 말한다.) 잘못된 형태
		byte b =(byte)129;
		System.out.println(b);
	
		
		//int : 10진수 / 8진수 0으로 시작하는숫자 / 16진수 0x로 시작하는 수  /2진수 : 0b로 시작하는수
		int i=15;//10진수
		int j=015;// 8진수 
		int k=0x15;//16진수
		int z=0b1010;//2진수
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(z);
		
		// 문자열 
		String abc = "안녕하세요.";
		abc= "자바 재밌떠요";
		System.out.println(abc);
		
	}

}
