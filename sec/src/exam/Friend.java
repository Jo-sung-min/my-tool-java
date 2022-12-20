package exam;

public class Friend {
	String name; 
	String phone;
	String birthday;
	
	Friend(String name, String phone, String birthday){
		this.name = name; this.phone = phone; 
		this.birthday = birthday;
	}
	
	@Override
	public String toString() {
		/*
		이  름 : 홍길동
		핸드폰 : 010-9999-1234
		생  일 : 05-22
		*/
		return "이름 : " + name + "\n핸드폰 : " + phone + "\n생일 : " + birthday ;
	}
}
