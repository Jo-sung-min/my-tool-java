package day10; 

class Book {
	String title; 
	String author;
	
	Book(){
		this("무제", "작자미상"); 
		System.out.println("생성자1 호출");
		//this.title = "무제"; 
		//this.author = "작자미상";
	}
	Book(String title) {
		this(title, "작자미상"); // 생성자 안에서 첫번째 명령이 되야한다. 
		System.out.println("생성자2 호출");
		//this.title = title; 
		//this.author = "작자미상";
	}
	Book(String title, String author){
		System.out.println("생성자3 호출");
		this.title = title; 
		this.author = author;
	}
	void show() {
		System.out.println(title + "  " + author);
	}
}
public class Test84 {
	public static void main(String[] args) {
		//Book book = new Book(); 
		//book.show();
		
		//Book littlePrince = new Book("어린왕자", "생텍쥐베리");
		//littlePrince.show();
	
		Book kong = new Book("콩쥐팥쥐"); 
		kong.show();
		
	}
}
