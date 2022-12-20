package dya05;

import java.util.Scanner;

public class Test45 {

	public static void main(String[] args) {
		//문제 1-1 int 형 방 5개 배열을 만들고 10,20,30,40,50,을 저장하고, 출력.
		//int [] sm = new int [5];
		/*
		int [] sm = {10,20,30,40,50};
		for(int i = 0 ; i<sm.length ;i++)
		System.out.println(sm[i]);
		
*/		
		
		
		//문제 1-2 위 배열을 이용하여, 인덱스번호1번과3번안에 있는 데이터를
		//			더한값을 출력해보세요
		
/*		
		int [] sm = {10,20,30,40,50};
		System.out.println(sm[0]+sm[2]);
	*/	
		
		//문제 1-3 인덱스번호를 사용자로부터 입력받고, 해당인덱스의 데이터를 출력해보세요.
		/*
		Scanner sm1 = new Scanner(System.in);
		System.out.println("알고싶은 배열의 번호를 입력해주세요");
		int [] sm = {10,20,30,40,50};
		int a = Integer.parseInt(sm1.nextLine()); 
		System.out.println(sm[a]);
		sm1.close();
		*/
		
		
		//문제 1-4.배열안의 모든 요소의 총 합을 출력해보세요.
		/*
		int total = 0 ;
		int [] sm = {10,20,30,40,50};	
		for(int i = 0 ; i<sm.length ;i++) {
		total += sm[i];	
		}
			System.out.println(total);
		*/
		
		
		// 문제1-5. 배열안에 있는 값(데이터)중 하나를 입력하면, 
	     //         그 값이 저장된 인덱스 번호를 출력해보세요. 
		/*
		Scanner sm1 = new Scanner(System.in);
		System.out.println("데이터를 입력하시면 인덱스번호를 알려드립니다.");
		int [] sm = {78,45,30,40,50};
		int a = Integer.parseInt(sm1.nextLine()); 
		
		if(a==sm[0]) {
		System.out.println("0");
		}
		else if(a==sm[1]) {
		System.out.println("1");
		}
		else if(a==sm[2]) {
		System.out.println("2");
		}
		else if(a==sm[3]) {
		System.out.println("3");
		}
		else if(a==sm[4]) {
		System.out.println("4");
		}
						
		
		sm1.close();
	     */
	      // 문제1-6. 인덱스 번호 2번과 4번의 값을 교환해보세요
		
	/*	
		int [] sm = {10,20,30,40,50};	
		int [] arr = sm;
		sm[1] = sm[3];
		sm[3]= arr[1];
		for(int i=0;i<5 ;i++ ) {
			System.out.println(sm[i]);
		}
	*/	
		
		// 문제1-7. (심화) 내림차순으로 정렬해보세요.	
		
		
		int[] arr = {10,70, 30, 40, 80};
		
		
		for(int i =0 ;i<arr.length ; i++) {
			for(int j = i+1 ; j<arr.length ; j++) {
				if(arr[j]>arr[i]) {
				
				int temp= arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
			}
		for(int i =0 ;i<arr.length ; i++) {
		System.out.println(arr[i]);
		}
	}
}
		
		
		
		
		
		
		
		
		
		