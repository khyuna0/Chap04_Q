package Chap05Array;

public class arrayTest04 {
// 2차원 배열
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[4][3]; // 4행 3열의 2차원 배열 선언, 초기화
		System.out.println(arr[0][0]);
		
		System.out.println("================");
		
		int[][] arr2 = {
						{1,2}, // 열 길이 반환 -> 한 묶음으로 생각
						{3,4}, 
						{5,6} 
						}; // 2차원 배열 선언과 동시에 특정 값으로 초기화하는 방식 (3행 2열 배열)
		
		System.out.println(arr2[2][1]); // 60
		
		System.out.println("================");
		
		
		// 행의 값 반환 -> 배열이름.length;
		for(int i=0;i<arr2.length;i++) { // 행
			for (int j=0;j<arr2[i].length;j++) { //열 길이 -> 한 행의 크기 = i 
				System.out.println(arr2[i][j]);
			}
		}
		
		System.out.println("================");
		
		//미리 length 설정하고 나중에 원소 값 넣기
		int[][] arr3 = new int [3][4];;
		
		
		
		
	}

}
