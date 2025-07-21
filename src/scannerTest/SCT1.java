package scannerTest;

import java.util.Scanner;

public class SCT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {
		
			Scanner scaneer = new Scanner(System.in); // 클래스로 객체 선언 -> 변수 선언과 비슷
			
			System.out.println("숫자를 입력하세요. ( 0 입력시 프로그램 종료 )");
			int num = scaneer.nextInt(); 
			
			// 프로그램 종료
			if (num == 0) { 
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			// 프로그램 실행
			if (num % 2 == 0) { 
				System.out.println("짝");
			} else {
				System.out.println("홀");
			}
			
		}
		
	}

}
