package exam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class TestMain2 {
	public static void main(String[] args) {

		HashMap<String, Customer> map = new HashMap<String, Customer>(); 
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("정보 입력 : ");
			String data = sc.nextLine(); 
			if(data.equals("n")) { // 대소문자 둘다 인식되게 
				break;
			}
			String[] split = data.split(",");
			map.put(split[1], new Customer(split[0], split[1], null, split[2]));
		}
		
		// map 전체 출력 
		Iterator<String> it = map.keySet().iterator(); 
		while(it.hasNext()) {
			String phone = it.next();
			Customer c = map.get(phone);
			System.out.println(c.name + " " + c.tel + " " + c.addr);
		}

		
		
		
		
		
		
		
		
		
	}
}
