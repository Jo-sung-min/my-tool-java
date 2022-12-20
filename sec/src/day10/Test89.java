package day10;
/*
	main() 메서드를 실행하였을때 예시와 같이 출력되도록 Tv 클래스를 작성하세요. 
	콘솔 출력예 > LG에서 만든 2022년형 32인치 TV
*/
class Tv {
	private String brand; 
	private int year; 
	private int size; 
	
	Tv(String brand, int year, int size){
		this.brand = brand; this.year = year; this.size = size; 
	}
	
	public String getBrand() { return brand; }
	public void setBrand(String brand) { this.brand = brand; }
	public int getYear() { return year; }
	public void setYear(int year) { this.year = year; }
	public int getSize() { return size; }
	public void setSize(int size) { this.size = size; }
	
	void show() {
		System.out.println(brand + "에서 만든 " + year + "년형 " + size + "인치 TV");
	}
}
public class Test89 {
	public static void main(String[] args) {
		// main은 작성완료, 주석해제하고 실행하면 지문에 나온 콘솔출력예처럼 보이게 작업. 
		
		Tv myTv = new Tv("LG", 2022, 32); 
		myTv.show(); 
		
	}
}
