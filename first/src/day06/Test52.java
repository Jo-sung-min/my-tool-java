package day06;

import java.util.Scanner;

public class Test52 {
	public static void main(String[] args) {

		// * 1차원 배열 문제 *
		// 문제1-1. arr이라는 이름의 방 5개짜리 배열에 
		//			사용자로부터 서로다른 5개의 정수를 입력받아 저장하고 출력해보세요. 
		
		// 문제1-2. 위에서 만들 배열 arr에 저장된 값을 오름차순으로 정렬해보세요. 
		
		// 문제1-3. 정수 한개를 더 입력받아 저장해보세요. 
		//			입력받은 정수는 기존 arr 배열의 마지막 데이터 다음방에 저장되어야한다. 
		//			(즉, 배열크기가 6개가 되어야한다. 단, 배열은 방크기 변경X) 
		int [] arr = {2,6,10,32,51}; 
		int [] tmp = arr; 
		arr = new int[6];  // 6개짜리 새 방으로 바꾸기 
		for(int i = 0; i < tmp.length; i++) {
			arr[i] = tmp[i]; 
		}
		arr[5] = 200; // 마지막방에 입력받아 저장 
		
		
		// 문제2-1. 게임랭킹보드. 각 5개의 데이터를 저장할 수 있는 
		//			users와 scores라는 이름의 배열이 있고, 
		//			users배열에는 유저이름, scores 배열에는 유저의 게임점수를 입력받아 저장한다. 
		//			단, 유저이름과 게임점수는 배열 인덱스상 서로 일치하게. 
		
		// 문제2-2. 위 저장된 users와 scores를 아래와 같은 형태로 출력해보세요. 
		/*
			user_name	score
			--------------------
			피카츄		87
			파이리		24
			.....
		*/
		
		// 문제2-3. 두번째 유저의 점수와 세번째 유저의 점수가 서로 바뀌었다합니다. 
		//			교환해주세요. 
		
		// 문제2-4. 점수가 높은 순으로 출력되는 게임 랭킹 보드를 출력해주세요. 
		/*			랭킹보드는 1위부터 5위까지 출력 
			rank	user_name	score
			----------------------------
			1		꼬북이		96
			2		피카츄		87
			.....
		*/
		
		/*
		System.out.println("rank\tuser_name\tscore");
		System.out.println("-----------------------------------");
		for(int i = 0; i < users.length-1; i++) {
			for(int j = i+1; j < users.length; j++) {
				if(scores[i] < scores[j]) {
					int temp = scores[i]; 
					scores[i] = scores[j]; 
					scores[j] = temp;
					String tStr = users[i]; // 이름도 같이 교환
					users[i] = users[j]; 
					users[j] = tStr;
				}
			}
		}
		for(int i = 0; i < users.length; i++) {
			System.out.println((i+1) + "\t" + users[i] + "\t\t" + scores[i]);
		}*/
		
		// 문제2-5. 또 한명의 유저가 게임을 끝냈습니다. 
		//			점수와 유저이름을 입력받고, users와 scores 배열에 추가 저장.
		//			(문제 1-3. 참고 : 배열길이 6개로) 
		//			게임 랭킹보드를 업데이트해 5위까지 출력해주세요. 
		Scanner sc = new Scanner(System.in);
		String [] users = {"피카츄", "꼬북이", "라이츄", "파이리", "잠만보"}; 
		int [] scores = {95, 65, 800, 73, 5}; 
		// 배열 방 크게 만들기 
		// 임시 배열에 주소 공유하고, 
		String [] uTmp = users;
		int [] sTmp = scores;
		// 방크게 새로 할당 
		int len = scores.length; // 원래 방크기 변수에 저장해놓기 
		users = new String[len+1]; 
		scores = new int[len+1];
		
		// 다시 큰 방에 옮겨 담고 
		for(int i = 0; i < uTmp.length; i++) {
			users[i] = uTmp[i]; 
			scores[i] = sTmp[i]; 
		}
		
		// 새점수와 이름 입력받아 저장 
		System.out.println("이름>>");
		users[len] = sc.nextLine(); 
		System.out.println("점수>>");
		scores[len] = Integer.parseInt(sc.nextLine());
		
		// 다시 정렬하고 
		for(int i = 0; i < users.length-1; i++) {
			for(int j = i+1; j < users.length; j++) {
				if(scores[i] < scores[j]) {
					int temp = scores[i]; 
					scores[i] = scores[j]; 
					scores[j] = temp;
					String tStr = users[i]; // 이름도 같이 교환
					users[i] = users[j]; 
					users[j] = tStr;
				}
			}
		}
		// 랭킹보드 출력 
		System.out.println("rank\tuser_name\tscore");
		System.out.println("-----------------------------------");
		for(int i = 0; i < 5; i++) {
			System.out.println((i+1) + "\t" + users[i] + "\t\t" + scores[i]);
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
