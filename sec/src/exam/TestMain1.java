package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain1 {
	public static void main(String[] args) {
		
		ArrayList<Customer> list = new ArrayList<Customer>(); 
		Scanner sc = new Scanner(System.in);
		/*
		  	입력예)
		  	홍길동,010-9999-999,서울시 용산구 용산동
		 
		  	출력예)
			홍길동 010-9999-9999 서울시 용산구 용산동
			김마동 010-8888-8888 서울시 마포구 노고산동
			...
		*/
		while(true) {
			System.out.print("회원정보 입력 : ");
			String data = sc.nextLine(); 
			if(data.equalsIgnoreCase("n")) {
				break;
			}
			String[] split = data.split(",");
			list.add(new Customer(split[0], split[1], null, split[2]));
		}
		
		// 전체 출력 
		for(int i = 0; i < list.size(); i++) {
			Customer c = list.get(i);
			System.out.println(c.name + " " + c.tel + " " + c.addr);
		}
		
	}
}
