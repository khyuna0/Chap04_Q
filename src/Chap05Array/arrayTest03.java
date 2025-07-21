package Chap05Array;

public class arrayTest03 {
// 배열 사용 시 주의할 점
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정수는 정수끼리 실수는 실수끼리. 같은 타입만 가능
		int[] intAr = {10, 20, 30, 40, 50};
		
		// 배열의 길이 벗어나면 out of bounds 오류 발생 
		System.out.println(intAr[2]); // 30
//		System.out.println(intAr[5]); -> out of bounds 에러. 배열 범위 벗어남
		// for 문의 조건식에서도 발생 가능 
		
		System.out.println("=====================");
		
		// 배열의 원소는 변수와 같이 바꿀 수 있음
		intAr[2] = 300;
		System.out.println(intAr[2]);
		
		// 문자열 배열 발생 에러
		
		String str = "kor";
		System.out.println(str + 7777); // -> 7777은 문자열로 바뀌어 출력. "kor7777"형태
		
		System.out.println("=====================");
		
		String[] strArr = { "k", "J", "C" };
		System.out.println(strArr[1] + 7777);
		
		System.out.println("=====================");
		
		String[] strArr1 = new String[5];
		System.out.println(strArr1[1] + 7777); // strArr1의 원소가 모두 null 값. null7777 출력. ( null = 값이 없음 ) 
		
		System.out.println("=====================");
		
		int[] intAr2 = {60, 70, 80, 90, 100, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		System.out.println(intAr2.length); ★ intAr2.length -> 배열 원소의 개수를 반환(출력) 
		
		System.out.println("=====================");
		
		int arrL =intAr2.length; 
		for (int i=0;i<arrL;i++) { // i < intAr2.length; 도 가능! | 배열의 길이만큼만 for 문 반복됨
			System.out.println(intAr2[i]);
		}
		
		
	}

}
