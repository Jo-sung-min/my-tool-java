package day14;
class Person {
	void wake() {
		System.out.println("7시에 기상");
	}
}

class Anony {

	// 변수의 초기값으로 대입 
	Person p = new Person() {
		void work() {
			System.out.println("출근~~~ ");
		}
		@Override
		void wake() {
			System.out.println("6시에 기상!!");
			work(); 
		}
	};
	
	void func() {
		// 지역변수의 초기값으로 대입 
		Person localP = new Person() {
			void walk() {
				System.out.println("산책~~~~~~~");
			}
			@Override
			void wake() {
				System.out.println("8시에 일어나서...");
				walk();
			}
		};
		localP.wake();
	}
	void func2(Person person) {
		person.wake();
	}
}

public class ClassEx33 {
	public static void main(String[] args) {

		Anony anony = new Anony(); 
		//anony.p.wake();
		//anony.func();
		
		// 매개변수의 매개값으로 사용
		anony.func2(new Person() {
			void study() {
				System.out.println("공부하다........");
			}
			@Override
			void wake() {
				System.out.println("7:30에 기상해서....");
				study(); 
			}
		});
		
		
		
	}
}
