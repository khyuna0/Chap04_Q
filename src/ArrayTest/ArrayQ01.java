package ArrayTest;

public class ArrayQ01 {
	public static void main(String[] args) {
		//1. 다음 값 들의 평균을 계산하여 출력하시오.(향상된 for 문 사용) 90 80 70 100 85
		
		int[] array = {90, 80, 70, 100, 85};
		
		int sum = 0; // 합계 변수
		for ( int num : array ) {
			sum = sum + num;
		}
		System.out.println(sum/array.length);
		
	}
}
