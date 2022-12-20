package day06;

public class Test50 {
	public static void main(String[] args) {
		
		// 정방배열 
		// 선언 
		//int [][] arr; 
		
		// 선언 + 할당 : 방크기 [행][열]
		int [][] arr = new int[2][3]; 
		arr[0][0] = 100; 
		arr[0][1] = 200; 
		arr[0][2] = 300; 
		arr[1][0] = 400; 
		arr[1][1] = 500; 
		arr[1][2] = 600; 
		
		// 초기값 
		int [][] arr2 = { {10,20,30}, {40,50,60} }; 
		
		System.out.println("----------------");
		for(int i = 0; i < arr2.length; i++) { // 행
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
		System.out.println("----------------");
		
		
		
		//System.out.println(arr2);
		//System.out.println(arr2[0]);
		System.out.println(arr2.length); // 행의 길이
		System.out.println(arr2[0].length); 
		// 첫번째 방안의 배열의 길이(정방에서 열의 길이)  
		
		// 가변배열 : 행크기 지정, 열은 추후 
		int [][] arr3 = new int[2][];  
		arr3[0] = new int[2]; 
		arr3[1] = new int[3]; 

		int [][] arr4 = { {10,20}, {30,40,50} }; 
		System.out.println("arr4 length : " + arr4.length);
		System.out.println(arr4[0].length);
		System.out.println(arr4[1].length);
		
		System.out.println("----------------");
		for(int i = 0; i < arr4.length; i++) { // 행
			for(int j = 0; j < arr4[i].length; j++) {
				System.out.println(arr4[i][j]);
			}
		}
		System.out.println("----------------");
		
		
		
		
		
		
		
		
	}
}
