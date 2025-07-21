package Chap05Array;

public class arrayTest02 {
	public static void main(String[] args) {
		
		int[] numA1 = { 100, 200, 300, 400, 500};
		System.out.println(numA1[2]); // numA1 배열의 인덱스 2를 출력한다 -> 값 300
		
		System.out.println("=====================");
		// 배열의 모든 원소 출력하기
		for(int i=0;i<=4;i++) { // for 문과 배열 같이 사용하기
			System.out.println(numA1[i]);
		}
		
		System.out.println("=====================");
		// 배열의 모든 요소의 합 구하기
		int sum = 0; // 합계용 변수
		for (int i=0;i<=4;i++) {
			sum = sum + numA1[i]; // 누적 합 사용
		} System.out.println(sum);
		
	
		
	}
}
