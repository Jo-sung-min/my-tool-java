package day14;


interface MyInter{
	void func();
	
}


public class ClassEx32 {

	public static void main(String[] args) {
		
		
		// MyInter 인터페이스 규격에 맞는 
		// 구현 익명 클래스 만들어서 객체 생성하고, 메서드 호출
			new MyInter() {
				@Override
				public void func() {
						System.out.println("MyInter의 fnumc 구현부!~");
						
				}
			} .func(); //1회용이다
			//.func(); 한번더쓰면 오류남 위의 메서드를 한번더 만들어야 사용가능
			
					
			
	}

}
