package day10;

/*
	노래 한곡을 나타내는 Song 클래스를 작성하세요. Song은 아래와 같은 변수로 구성된다. 
		- 노래 제목을 나타내는 title 
		- 가수를 나타내는 artist
		- 노래가 발표된 연도를 나타내는 year
		- 국적을 나타내는 country 
	또한, Song클래스에 다음 생성자와 메서드를 작성하세요. 
		- 생성자 2개 : 기본생성자, 매개변수로 모든 변수를 초기화해주는 생성자 
		- 노래 정보를 출력하는  show() 메서드 
		- main() 메서드에서는 2017년, 한국국적의 Collective Arts가 부를 Alone이라는 
		 	Song 객체를 생성하고, show() 를 이용하여 노래의 
			정보를 이용하여 아래와 같이 출력되도록 하세요. 
	콘솔 출력예 >> 2017년 한국국적의 Collective Arts가 부른 Alone
*/
class Song {
	String title; 
	String artist;
	int year;
	String country;
		
		Song(int year, String country, String artist, String title){
			this.year = year;
			this.country = country;
			this.artist = artist;
			this.title = title;
			
		}
		static{
			String title="Alone"; 
			String artist="collextive Arts";
			int year=2017;
			String country="한국";
			
		}
		
		void show(){
			System.out.println(year+"년"+country+"국적의 "+artist+"가 부른"+title);
		}
	
	
	
	
}
public class Test91 {
	public static void main(String[] args) {
		String title; 
		String artist;
		int year;
		String country;
		Song im = new Song(2017,"한국","collective Arts","Alone");
	    im.show();
		
	}
}
