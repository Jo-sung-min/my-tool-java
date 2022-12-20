package day08;

class MyCard{
	int num=(int)(Math.random()*10)+1;
	boolean isBonus=false;
		
	
	int Game(int a) {
		num = a;
		if(num==3) {
			isBonus = true;
			System.out.println(isBonus);
			return a;
		}else
			isBonus = false;
			System.out.println(isBonus);
			return a;
	}	
	
}



public class Test46 {

	public static void main(String[] args) {
		
		
		MyCard sm = new MyCard();
		System.out.println(sm.Game(3));
		
		/* 1. 아래와 같은 멤버변수를 갖는 MyCard 클래스를 정의 하세요. 
		   (MyCard 클래스는 카드 한장 만들수 있는 클래스) 
		   - 1 ~ 10 사이 카드의 숫자(정수)를 저장할 num이라는 변수 
		   - 카드가 보너스 카드인지 판단할 isBonus 라는 이름의 변수 (보너스카드면 true, 아니면 false저장) 
		2. 1번에서 만들 MyCard 클래스를 이용하여 카드 한장을 만들고 
		   해당 카드가 몇번이며, 보너스인지 아닌지 지정하고 
		   출력해서 확인해보세요. 
		   
		   
		   
		   

		3. 학생의 이름과 나이를 저장할 Student 클래스를 만들어보세요. 

		4. 3번에서 만든 Student 클래스를 이용하여 학생 한명을 만들고,
		   이름과 나이를 저장한 후 출력해서 확인해 보세요. 

		5. 아래와 같은 속성을 저장할 수 있는 멤버변수를 갖는 MobilePhone 클래스를 정의하세요. 
		   - 가로사이즈 (실수 ex: 7.5) 
		   - 세로사이즈 (실수)
		   - 두께    (실수) 
		   - 폰색상
		   - 폰 브랜드 이름 

		6. 5번에서 만든 MobilePhone 클래스를 이용하여 폰을 하나만들고, 
		   모든 속성을 변경하고 출력해보세요. 

		7. 학생의 이름과 옷색상을 저장할 TheJoeunStudent 클래스를 정의하세요. 
		 
		8. 7번에서 만든 클래스를 이용하여, 우리반 같은 분단에 앉은 학생들을 모두 만들고,
		   각 학생에 맞는 이름과 옷색상을 저장하고, 출력해보세요. 
*/

	}

}
