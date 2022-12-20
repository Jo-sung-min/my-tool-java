package day11;
//상속을 이용하여 아래 클래스들을 간결한 구조로 재작성 해보세요
class SmartBallPen{
	private int amount ;
	private String color ; 
	public int getAount() {return amount;}
	public void setAount(int amount) {this.amount = amount;}
}

class BallPen extends SmartBallPen{
	private String color ; 
	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}
}

class FountainPen extends BallPen{
	private int amount ;
	public void refill(int n) {amount = n;}
	
}





public class ClassEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Object object; // 
		
	}

}
