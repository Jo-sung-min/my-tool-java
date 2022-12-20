package day04;

import java.util.Scanner;

public class Test35 {

	public static void main(String[] args) {
		// 문제 1 0~10까지 출력해보세요.
		
		/*Scanner sm = new Scanner(System.in);
		int num = Integer.parseInt(sm.nextLine());
		 */
	/*	
		int num = 0;
		while (num<11) {
			System.out.println(num);
		num++;
		}
		*/
		
		
/*		
		// 문제 2 1~15까지 출력해 보세요. 
		int num = 1;
		while (num<16) {
			System.out.println(num);
		num++;
		}
	*/	
		
		
		// 문제 3 0~100까지 10 단위로 출력해보세요 0 10 20 30 ... 100
	/*	int num = 0;
		while (num<11) {
			System.out.println(num*10);
		num++;
		}
	*/
		
		
		// 문제 4 1~20까지 홀수만 출력해보세요
	/*	
	 	int num = 0;
		int ad = 0; 
		while (num<21) {
			
		num++;
		ad = num;
		if((ad)%2==1) {
			System.out.println(ad);
			}	
		}
	*/	
	
		
		// 문제 5 1~10까지 총합을 출력해 보세요.
/*
		int num = 1;
		int total=0;
		while (num<11) {
				
		total += num; 
		num++;
		 
		}
		System.out.println(total);
	*/	
		
		// 문제 6 1~50까지 짝수의 합을 출력해 보세요
/*
	
		int num = 1;
		int total=0;
		 
		while (num<=4) {
			if((num%2)==0) {
		total += num;		
			}
			
		num++;
		
		
		}
		System.out.println(total+"짝수의 총합");
	*/	
		
		
		
		
		
		/*
		
		* 문제6. 주문 프로그램 
	       
        *** 더조은 카페 메뉴 ***
        1. 아메리카노 : 2500원
        2. 카페라떼     : 3000원
        3. 카푸치노   : 3500원
        4. 카라멜마끼아또 : 4000원
        5. 샌드위치   : 6000원 
        6. 주문 종료
     
        1단계 : 위 메뉴를 출력하고, 번호로 주문을 받는다.
            주문 종료를 선택할때까지 계속 주문을 받고 
            주문받은 모든 메뉴의 총 금액 출력한후 종료. 
        
        */
      

		Scanner sm = new Scanner(System.in);
		System.out.println(" 1. 아메리카노 : 2500원\r\n"
				+ "        2. 카페라떼     : 3000원\r\n"
				+ "        3. 카푸치노     : 3500원\r\n"
				+ "        4. 카라멜마끼아또 : 4000원\r\n"
				+ "        5. 샌드위치   : 6000원 \r\n"
				+ "        6. 주문 종료");
		int total =0;
		System.out.println("번호를 입력하세요");
		while(true) { // 계속 주문할때는 true 넣고 while 구문 쓰기
			
			
			int cho = Integer.parseInt(sm.nextLine());
			System.out.println("더 주문하시겠습니까?");			
			if (cho==1) {
				total += 2500;
			}else if(cho==2) {
				total += 3000;
			}else if(cho==3) {
				total += 3500;
			}else if(cho==4) {
				total += 4000;
			}else if(cho==5) {
				total += 6000;
			}else if(cho==6) {
				System.out.println("주문을 종료합니다");
				System.out.println(total+"원입니다.");
			
				break;
			}
		
			}
		sm.close();	
	}
}   
        
        /*2단계 : int money = 20000; (내돈). 
           주문시, 내 돈에서 주문한 금액 차감, 돈이 부족하면 주문 못하게, 
           주문 종료시 주문한 총 금액과 내 돈의 잔액까지 출력. 
           */
  	/*	Scanner sm = new Scanner(System.in);
		System.out.println(" 1. 아메리카노 : 2500원\r\n"
				+ "        2. 카페라떼     : 3000원\r\n"
				+ "        3. 카푸치노     : 3500원\r\n"
				+ "        4. 카라멜마끼아또 : 4000원\r\n"
				+ "        5. 샌드위치   : 6000원 \r\n"
				+ "        6. 주문 종료");
		int money =20000;
		while(money>=0) {
			
			int cho = Integer.parseInt(sm.nextLine());
			System.out.println("더 주문하시겠습니까?");
			System.out.println("번호를 입력하세요");
			if (cho==1) {
				money -= 2500;
					if(money<=0) {
						System.out.println("잔액이 부족합니다.");
					}
			}else if(cho==2) {
				money -= 3000;
				if(money<=0) {
					System.out.println("잔액이 부족합니다.");
				}
			}else if(cho==3) {
				money -= 3500;
				if(money<=0) {
					System.out.println("잔액이 부족합니다.");
				}
			}else if(cho==4) {
				money -= 4000;
				if(money<=0) {
					System.out.println("잔액이 부족합니다.");
				}
				
			}else if(cho==5) {
				money -= 6000;
				if(money<=0) {
					System.out.println("잔액이 부족합니다.");
				}

			}else if(cho==6) {
				System.out.println("주문을 종료합니다");
				System.out.println("총 금액"+(20000-money)+"원입니다.\n"+"잔액이"+money+"입니다.");
			
				break;
			}
			
			
			}
	

	     
	}
}*/
		
	


