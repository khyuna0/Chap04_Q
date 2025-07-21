package JavaTest02;

public class ArrayQ03 {
	public static void main(String[] args) {
		// 03. 다음 숫자열에서 3의 갯수가 몇개 인지 출력하시오. 1 3 7 3 3 5 3 6 9 3 3 3
		
		int sum = 0; // 3의 갯수 합계
		
		int[] array = {1,3,7,3,3,5,3,6,9,3,3,3};
		for( int num : array ) {
			if( num == 3 ) {
				sum += 1;
			}
		}
		System.out.println(sum);
		
	}
}
