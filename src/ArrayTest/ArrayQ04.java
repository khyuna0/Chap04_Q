package ArrayTest;

public class ArrayQ04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 04. 아래 배열에서 홀수인덱스의 값만 출력하시오.
		
		int[] array = {1, 2, 3, 4, 5};
		for (int num : array) {
			if (num % 2 == 1) {
				System.out.println(num);
			}
		}

		
	}

}
