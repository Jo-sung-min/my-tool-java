package day11;


//상속
class Super{		// x 만 가지고 있음
	static int a = 1000;
	int x=10;
}
class Sub extends Super{	// x y 가지고 있ㅇㅁ
	int y = 20;
}


public class classEx01 {

	public static void main(String[] args) {
		Sub s = new Sub();
		System.out.println(s.x);
		System.out.println(s.y);
		System.out.println(s.toString());// Object 로 부터 물려받은 메서드
		// 클래스변수는 마치 자기것처럼 Sub 클래스명.변수명 사용가능.
		
		System.out.println(Sub.a);
		Sub.a = 1234;
		System.out.println(Super.a);
		System.out.println(Sub.a);
		//서브를 바꿔도 부모변수가 바뀐다.
	}

}
