package day09;
/*
 	char[] 배열을 전달받아 출력하는 printCharArray() 메서드와 
 	배열속의 ' '공백문자를 ','쉼표로 대치하는 replaceSpace() 메서드를 작성해보자. 
*/
public class Test72 {
	
	static void printCharArray(char[] cde) {
		for(char cc : cde) {
			System.out.print(cc);
		}
		System.out.println();
	}
	
	static void replaceSpace(char[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ' ') {
				arr[i] = ','; 
			}
		}
	}
	
	public static void main(String[] args) {

		char[] c = {'I',' ', 'a', 'm', ' ', 'a', ' ', 'b', 'o', 'y'}; 
		printCharArray(c); // I am a boy 출력 
		replaceSpace(c); 
		printCharArray(c); // I,am,a,boy 출력 
		
		
		
	}
}
