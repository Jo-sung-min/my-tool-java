package day09;

class Book {
	String title; 	//제목
	String author;	//작가
	
	Book(String t){
		title = t; 
		author = "작자미상"; 
	}
	Book(String t, String a){
		title = t; 
		author = a; 
	}
}

public class Test79 {
	public static void main(String[] args) {

		
		Book book = new Book("콩쥐팥쥐");  // 책 생산 
		System.out.println(book.title + " " + book.author);
		Book little = new Book("어린왕자", "생텍쥐베리"); 
		System.out.println(little.title + " " + little.author);
		
		
		
		
		
		
	}
}
