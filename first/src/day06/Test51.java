package day06;

import java.util.Scanner;

public class Test51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// * (비)정방배열 문제 *
		// 문제1. 아래와 같은 형태의 정방배열을 만들어 값을 저장하고 출력해보세요. 
		/*
			10 20 30 
			40 50 60
			70 80 90
		
		int [][] arr = {{10,20,30}, {40,50,60}, {70,80,90}};
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		// 문제2. int 형 3행 2열의 정방배열을 만들고 
		//			각 방에 정수를 입력받아 저장하고 출력하세요. 
		int [][] arr = new int[3][2]; 
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println("정수 입력>>");
				arr[i][j] = Integer.parseInt(sc.nextLine());
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}*/
		
		
		// 문제3. 아래와 같은 형태의 비정방배열을 만들어 
		//		아래와 같이 값을 저장하고 출력하세요. 
		/*
			10 11 12
			20 21
			30 31 32
			40 41 
		
		int [][] arr = new int[4][]; 
		arr[0] = new int[3]; 
		arr[1] = new int[2]; 
		arr[2] = new int[3]; 
		arr[3] = new int[2]; 
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i + 1) * 10 + j;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}*/
		
		// 문제4. 한층에 5호씩있는 3층짜리 아파트가 있다. 
		// 1) 배열로 만들어서 각각 호마다 관리비를 입력받고, 전체 출력해보세요. 
		// 2) 층별 관리비 평균을 구해서 출력해보세요. 
		// 3) 전체 관리비 평균을 구해서 출력해보세요. 
		// 4) 103호와 203호의 관리비가 서로 바뀌었다합니다. 교환해주세요. 
		// 5) 전체 관리비 평균보다 관리비가 적게 나오는 호수들을 출력하세요. 
		
		int [][] fee = {
				{21,3,50,45,67},
				{1,38,90,56,67},
				{2,98,54,5,7}
		};  // 관리비 저장 배열 
		String [][] ho = { 
				{"101","102","103","104","105"},
				{"201","202","203","204","205"},
				{"301","302","303","304","305"}
		}; // 아파트 호수 저장하는 배열
		
		// 6) 관리비 가장 적게 나온 호수와 가장 많이 나온 호수를 출력하세요. 
		int max = fee[0][0];  	// 최대 관리비 담고 비교할 변수 
		int maxI = 0; 			// 최대 관리비 인덱스 번호 i를 담을 변수 
		int maxJ = 0; 			// 최대 관리비 인덱스 번호 j를 담을 변수 
		int min = fee[0][0]; 	// 최소 관리비...
		int minI = 0; 
		int minJ = 0; 
		for(int i = 0; i < fee.length; i++) {
			for(int j = 0; j < fee[i].length; j++) {
				if(max < fee[i][j]) { // 최대 관리비 검사 
					max = fee[i][j]; 
					maxI = i; 
					maxJ = j; 
				}
				if(min > fee[i][j]) { // 최소 관리비 검사 
					min = fee[i][j]; 
					minI = i; 
					minJ = j;
				}
			}
		}
		System.out.println("최대 관리비는 " + max + "원 사용한 " + ho[maxI][maxJ] + "호");
		System.out.println("최소 관리비는 " + min + "원 사용한 " + ho[minI][minJ] + "호");
		
		// 7) (심화) 관리비 적게 나온 순으로 정렬해보세요. 
		int [] arr = new int[15];
		String [] hoArr = new String[15];
		int idx = 0; 
		// 1차원 배열에 옮겨 담기 
		for(int i = 0; i < fee.length; i++) {
			for(int j = 0; j < fee[i].length; j++) {
				arr[idx] = fee[i][j]; // 관리비 옮겨담기
				hoArr[idx] = ho[i][j];  // 호 문자열 옮겨담기
				idx++; 
			}
		}
		// 정렬 
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					// 관리비 자리 이동 
					int tmp = arr[i]; 
					arr[i] = arr[j];
					arr[j] = tmp;
					// 호 자리 이동 
					String tmpStr = hoArr[i];
					hoArr[i] = hoArr[j]; 
					hoArr[j] = tmpStr;
				}
				
			}
		}
		for(int a : arr) {
			System.out.print(a + "\t");
		}
		System.out.println();
		for(String a : hoArr) {
			System.out.print(a + "\t");
		}
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}
}
