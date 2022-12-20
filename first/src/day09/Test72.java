package day09;
/*
 	char[] 배열을 전달받아 출력하는 printCharrArray() 메서드와
 	배열속의 ' ' 공백문자를 , 쉼표로 대치하는 replaceSpace()메서드를 작성해보자
 */



public class Test72 {
	
		static void printCharArray (char[] a) {
			
			for(int i = 0 ;i<a.length ;i++) {
				
			System.out.print(a[i]);
			}System.out.println();
		}
		
		static	void replaceSpace (char[] a) {
			for(int i = 0 ;i<a.length ;i++) {
				if(a[i]==' ') {
					a[i]= ',';
				}
			}
		}	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = {'I',' ', 'a', 'm', ' ', 'a', ' ', 'b', 'o', 'y'};
		
		printCharArray(c); // i am a boy 출력
		replaceSpace(c);
		printCharArray(c); // i,am,a,boy 출력
		
		
	}

}
