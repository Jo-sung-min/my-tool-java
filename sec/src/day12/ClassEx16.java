package day12;
//인터페이서 !! 클래스로 만들지 않는다
interface  Test2{
	public abstract int num2(int a, int b) ;
	public static final int A1 = 10;
	//int a =30;
	//void add();
	
}
class Inter implements Test2{

	@Override
	public int num2(int a, int b) {
		
		return a+b;
	}
	
}



public class ClassEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
