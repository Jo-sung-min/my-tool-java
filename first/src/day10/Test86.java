package day10;

import java.util.Scanner;

//Book 2 클래스를 활용하여 2개짜리 Book2 타입 객체 배열을 만들고.
//사용자로부터 책의 제목과 저자를 입력받아 배열을 완성하고 출력해보세요.
//출력 예 : 어린왕자. 생택쥐베리....



class Book2{
	String title;
	String author;
	Book2(String title, String author){
		this.title = title ;
		this.author= author;
	}
	
}



public class Test86 {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Book2 [] books = new Book2[2];	//배열 두칸짜리 만들기
		
		for (int i= 0  ;i<books.length ;i++ ) {
			
			System.out.println("제목>> ");
			String title = sc.nextLine();
			System.out.println("저자>> ");
			String author = sc.nextLine();
			books[i] = new Book2(title, author); 	//객체생성해서 배열에 저장
			
		}
		
		// 배열크기만큼 반복해서 각 방의 책이름, 저자이름 꺼내서 출력
		for(int i = 0 ;i<books.length ;i++) {
			System.out.println(books[i].title + " "+books[i].author);
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
