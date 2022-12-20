package day09;
class Book  {
	String title ; //제목
	String	author; //작가

	
	Book(String t ){
		title = t;
		author="작자미상";
		}
	
	
	Book(String t , String a ){
		title = t; 
		author =a;
	}
	
	
}
public class Test80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Book book3 = new Book(); // 에러 뜨는 이유 초기셋팅에서 String 타입을 받는다는 생성자 즉 매개변수 있는생성자를 
								//만들었기 때문에 의도에 반하는 코드가 되어서 오류가뜸
								// 첨부터 생성자 선언ㅇ을 안하면 자동으로 만들어준다.
		Book book = new Book("콩쥐팥쥐");
		System.out.println(book.title);
		System.out.println(book.author);
		Book little = new Book("어린왕자","생택");
		System.out.println(little.title);
		System.out.println(little.author);
		
		
	}

}
