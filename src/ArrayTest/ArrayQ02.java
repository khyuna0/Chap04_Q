package ArrayTest;

public class ArrayQ02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 02. 다음 숫자들을 거꾸로 출력하시오. ex) 50 40 30 20 10
		
		int[] array = { 50, 40, 30, 20, 10, 5, 0 };
		
		for(int i=1;i<=array.length;i++) {
			int a = array.length - i;
			System.out.println(array[a]);
		}
		
		System.out.println("=================");
		
		
	}

}
