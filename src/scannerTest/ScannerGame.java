package scannerTest;

import java.util.Scanner;

public class ScannerGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1~100 사이 정수 중 컴퓨터가 정한 숫자를 맞추는 게임
		Scanner scanner = new Scanner (System.in);
		int comNum = (int) ((Math.random() * 100) +1); // 랜덤으로 컴퓨터가 생각한 수를 생성 
		
		System.out.println("*** 숫자 맞추기 게임 ***");
		System.out.println("** 1~100 사이의 숫자를 맞춰보세요 **");
		
		
		int count = 0; // 횟수 출력용 변수
		
		while (true) { 
			count++;
			
			System.out.println(" 1~100 사이의 숫자를 입력하세요. ( 0 입력 시 게임 종료 )");
			int userNum = scanner.nextInt(); // 사용자가 입력한 숫자 받아와 userNum 변수에 저장
			
			if(userNum == 0) {
				break;
			}
			
			if(userNum > comNum) {
				System.out.println("다운");
				System.out.println("남은 기회는 " + (10 - count) + "번 입니다");
			} else if (userNum < comNum) {
				System.out.println("업");
				System.out.println("남은 기회는 " + (10 - count) + "번 입니다");
			} else {
				System.out.println("정답입니다!");
				System.out.println(count + "번 만에 맞췄습니다.");
				System.out.println("게임을 종료합니다.");
				break;
			}
			
			if (count == 10) {
				System.out.println("10번 시도했습니다. 게임을 종료합니다.");
				break;
			}
			
			
			
		}
		
		
	}

}
