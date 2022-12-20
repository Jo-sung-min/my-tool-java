package day10;



class Book{
	String title;
	String author;
	
	Book(){
		System.out.println("생성자 호출");
		title = "무제";
		author = "작자미상";
		
		
	}
	Book(String title){
		this(title, "작자미상");// 생성자 안에서 첫번째 명령이 되어에 한다.
		
		//this.title = title;

	 //this.author = "작자미상";
	 
	}
	Book(String title,String author){
		
		this.title = title;
		
	   this.author = author;
	 
	}	
	
	
	
	
	
	
	void show() {
		System.out.println(title +" " +author);
	}
	
	
}


public class Test84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Book littlePrince = new Book("어린왕자", "생택");
		Book k = new Book();
		littlePrince.show();
		
		
	}

}
