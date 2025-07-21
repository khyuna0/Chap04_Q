package scannerTest;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 스캐너에 정수 값 입력받기
		
		Scanner scaneer = new Scanner(System.in); // 클래스로 객체 선언 -> 변수 선언과 비슷
		
		System.out.println("당신이 제일 좋아하는 숫자를 입력하세요.");
		int num1 = scaneer.nextInt(); // 사용자로부터 정수를 입력 받아 정수 변수 num1 에 저장
		System.out.println("당신이 제일 좋아하는 숫자는 "+ num1 + "입니다." );
		scaneer.close(); // 닫아줌 필수!
		
		System.out.println("======================");
		
		
		
		
		
	}

}
