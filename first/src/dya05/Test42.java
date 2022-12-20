package dya05;

public class Test42 {

	public static void main(String[] args) {

		//문제 1
/*	
		for (int a =1; a <=5  ; a++) {
			
			System.out.println(a+"행 : ****");
		}
	*/
		//문제 2 
/*		
		for (int a = 0; a <=4   ; a++  ) {
			
			for(int j =0 ;j<=a ;j++) {
				System.out.print("*");
			}System.out.println();
			
		}
		*/
		//문제3
		/*
		for (int a = 0; a <5   ; a++  ) {
			
			for(int j =0 ;j<5-a ;j++) {
				System.out.print("*");
			}System.out.println();
			
			
			
		}
	*/	
		
		//문제 4
		/*
		for (int a = 1; a <=5   ; a++  ) {
			
			
			System.out.println(a+""+(a+1)+""+(a+2)+""+(a+3)+""+(a+4));}
	*/
		
		
	//문제 5.	
/*		
		for (int a = 5; a >=1   ; a--  ) {
			
			
			System.out.println(a+""+(a+1)+""+(a+2)+""+(a+3)+""+(a+4));
		} 
		
		
	}	
	*/	
		
	//문제6.
	/*
		for(int i=1;i<=10  ;i++ ) {
			if(i<5) {
			for(int j = 0 ; j<i ;j++) {
				 
				System.out.print("*");
			}
			}else if(i>=5) {
				for(int k = 0 ; k<10-i ;k++) {
					 
					System.out.print("*");
			}
			
			}System.out.println();
						
		}
	*/
		
		//새로운 방안
	/*
		int star = 1 ; 		//한줄에 찍어야하는 별의 개수
		boolean flag = true ; // 별이 증가하면 true , 별이 감소해야되면 false 로 해보자
		for (int i  = 0 ;i<9;i++ ) {
			for(int j =0 ;j<star ;j ++) {
				System.out.print("*");
				
				
			}if(flag) {
				star ++; 	//flag가 true 면 별의개수 증가.
			}else {
				star --; 	//flag가 false 면 별의개수 감소.
			}
			if(star==5) {	//별이 5개 찍혔으면
				flag = false; 	// flag 를 false로 바꾸기
				
			}
			
			System.out.println();
			
			
		}
		
		
		*/
		
		
		
		
		
		
		
		
		
		
	//	문제 7 
		/*
			for (int a = 1; a <=5   ; a++  ) {
			
			for(int j =0 ;j<5-a ;j++) {
				System.out.print(" ");
				
				}
			for(int k =1;k<=a ; k++) {
				System.out.print("*");
			}	System.out.println();
			}
			*/
			
			
	//문제 8		
		/*	
			
		for (int a = 1; a <=5   ; a++  ) {
			
		for(int j =1 ;j<=a ;j++) {
			System.out.print(" ");
			
			}
		for(int k =5;k>=a ; k--) {
			System.out.print("*");
		}	System.out.println();
		}			
			
	*/		
			
	//문제 9		
	/*		
		for (int a = 1; a <=11   ; a++  ) {
		if(a<=6) {	
		for(int j =6 ;j>=a ;j--) {
			System.out.print(" ");
			
			}
		for(int k =1;k<=a ; k++) {
			System.out.print("*");
		}	System.out.println();
		}else if (a>6) {		
		 for(int j =6 ;j<=a ;j++) {
			System.out.print(" ");
				
					}
				for(int k =11;k>=a ; k--) {
					System.out.print("*");
				}	System.out.println();
				}		
			
			
		}			
		*/	
		
	
		//문제 10.
/*	 
		for(int i = 1 ; i<=5 ; i++) {						//처음은 세로줄의 갯수를 정하는단계
	
			
			for(int j = 5 ; j>i ; j-- ) {					// 이번엔 첫줄의 찍을 갯수를 정하면됨
				System.out.print(" ");
				
			}	for(int k = 1 ; k<=i ; k++ ) {				//마찬가지로 첫줄의 찍을갯수
				System.out.print("*");
			}	for(int l = 1 ; l < i; l++) {				//이것도 첫줄의 찍을갯수
				System.out.print("*");
		//for (int k = 1 ; k<= i*2; k++) // 모법답안			 
			}	System.out.println();						//순서대로만 찍히니까 모양을 보고 세분하기
			
			
		}
	*/
	
		//문제 11.
/*		
		for(int i = 0 ; i<=5  ; i++ ) {
			for (int j = 0 ; j < i; j++) {
				System.out.print(" ");
		}	for(int k = 5 ; k >i  ; k--) {
				System.out.print("*");
		}	for(int l = 4 ; l>i ;l--) {
				System.out.print("*");
		}	System.out.println();
	
	
	}
	
	*/
	
		//문제 12.
	/*	
		for (int i = 0 ; i<9; i++) {
		
			if(i<5) {
			for (int j = 5 ; j>i ; j--) {
				System.out.print("*");
			}System.out.println();
			
		}else if (i>=5) {
			for( int k = 3 ;k<i ; k++) {
				System.out.print("*");
			}System.out.println();
			
			
			
		}
		}
		*/
		
		
		//문제 13 
		/*
		
		for (int i = 0 ; i<10 ; i++) {
			if(i<=5) {
			
			for (int j = 0 ;j<i ; j++) {
				System.out.print(" ");
			}for (int k = 6 ; k>i ;k--) {
				System.out.print("*");
			}System.out.println();
			
			}else if (i>5) {
				for (int l =10;l>i  ;l-- ) {
					System.out.print(" ");
			}for (int m =4; m<i ; m++) {
				System.out.print("*");
			}System.out.println();
			}
			
		}
		*/
		
	
		
		//문제 14
		/*
		  	for (int i =0 ; i<10 ; i++) {
		 
			if(i<=5) {
			
			for(int j = 5 ;j>i ; j--) {
				System.out.print(" ");
			}for (int k = 0 ;k < i ;k++) {
				System.out.print("*");
			}for(int l = 1 ; l < i ;l++) {
				System.out.print("*");
			}
		
			}else if(i>=6) {
			for (int m= 5 ; m<i ;m++ ) {
				System.out.print(" ");
			}for(int n =10 ; n>i ;n--) {
				System.out.print("*");
			}for(int o = 8 ;o>=i ; o--) {
				System.out.print("*");
			}
			}System.out.println();
	
	*/
		
		//문제 15
		/*
	  	for (int i =0 ; i<10 ; i++) {
			 
		if(i<=5) {
		
		for(int j = 5 ;j>i ; j--) {
			System.out.print("*");
		}for (int k = 0 ;k < i ;k++) {
			System.out.print(" ");
		}for(int l = 1 ; l < i ;l++) {
			System.out.print("");
		}
	
		}else if(i>=6) {
		for (int m= 5 ; m<i ;m++ ) {
			System.out.print("*");
		}for(int n =10 ; n>i ;n--) {
			System.out.print(" ");
		}for(int o = 8 ;o>=i ; o--) {
			System.out.print("*");
		}
		}System.out.println();
		
		}
		*/
		
		
		
			
	}
}

			
			
		
	

	
