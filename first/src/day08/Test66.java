package day08;
class Baram{
	int a;
	static Test66 st;
	
}
public class Test66 {
int v= 10;
	public static void main(String[] args) {
		// 미리 객체생성 하고 선언 없이 프린트 해보기
		//객체 하나 null 로 만들고 객체 넣어주기
		System.out.println(Baram.st);
		Baram.st = new Test66(); 
		System.out.println(Baram.st.v);
	}

}
