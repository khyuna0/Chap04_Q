package ArrayTest;

public class ArrayQ05 {
	public static void main(String[] args) {
		// 5. 아래 숫자들을 모두 곱한 값을 배열을 사용하여 출력하시오. 10 20 30 40 50
		
		int[] array = { 1, 2, 3, 4, 5};
		
		int m = 1; // 곱한 값 누적
		for (int num : array) {
			m = m*num;
		}
		System.out.println(m);	
	}
}
