package Chap05Array;

public class arrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열 -> 같은 타입의 데이터를 연속된 공간에 나열한 것
		// 인덱스 -> 각 데이터에 부여한 숫자
		// * 엑셀처럼 이해
		// 같은 타입의 데이터만 저장 가능, 한번 생성된 배열은 길이를 늘리거나 수정할 수 없음
		// 배열 선언 시 타입, 길이 지정 필수 | ex. int 타입 배열은 한 인덱스 공간을 4byte로 지정 
		
		
		// 배열 타입은 정수, 실수, 문자열이 있음
		int score = 100; // 변수 타입 예시
		double avg = 95.2;
		String str = "점수";
		
		// 정수 타입 배열
		int[] intArr; 
		
		// 실수 타입 배열
		double[] doubleArr;
	
		// 문자열 타입 배열
		String[]strArr;
	
		// 논리 타입 배열
		boolean[] booleanArr; // 잘안씀
		
		// 변수 선언 -> 타입명[] 배열 변수 이름 = { 값 목록 ',' 로 구분 };
		
		
		// 1. 선언과 동시에 값 초기화
		int[] intA1 = {1, 2, 3, 4, 5}; // [] -> 배열 표시. 배열 타입명 옆(space x)
//		intArr = {1, 2, 3, 4, 5}; -> ★ 작동 x / 배열은 선언과 동시에 값 초기화(값 목록 지정)!
		
		String[] strA1 = {"가","나","다","라"};
		double[] doubleA1 = {1.1, 2.2, 0.3};
		
		// 2. 배열의 크기만 지정하고 기본값으로 초기화
		int[] intAr = new int[5]; // 4바이트(정수형 int) 방이 5개 만들어짐
		// int[] intArr2 = {0,0,0,0,0};
		intAr[0] = 100; // -> 첫 번째 (0) 인덱스에 값 '100' 넣기
		
		double[] doubleAr = new double[5]; 
		// double[] doubleA2 = {0.0, 0.0, 0.0, 0.0, 0.0};
		
		boolean[] boolAr = new boolean[3];
		// boolean[] boolAr = { false, false, false,};
		
		String[] strAr = new String[3];
		// String[] strAr = { null, null, null,};
		
		// 3. new 연산자를 사용하여 배열의 선언과 동시에 초기화
		int[] intAr2 = new int[] {1, 2, 3, 4, 5, 6};
		String[] strAr2 = new String[] {"aaa", "bbb", "ccc"};
		
		
		
		
		
}
	

}
