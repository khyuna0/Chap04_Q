package Chap05Array;

public class arrayTest05 {
// 향상된 for 문
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,30,40,50};
		// 모든 배열 요소를 출력하는 for 문
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("==================");
		
		// 향상된 for 문으로 전환
		for ( int num  : arr) { // : 앞에 배열 원소와 같은 타입 로컬 변수 지정 -> 임시로 값 저장
			System.out.println(num);
		}
		System.out.println("==================");
		
		// 다음 배열의 모든 요소 중 짝수만 출력하시오.
		
		int[] numArr = {10,20,30,11,13,15,17,22};
		for (int num : numArr ) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
		
		// 2차원 배열은 향상된 for 문 사용 x *권장
	
	}

}
