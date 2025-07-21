package JavaTest_0721;

public class Q_04_0721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0; // 홀수 개수
		int b = 0; // 짝수 개수
		for(int i=1;i<=100;i++) {
			if( i % 2 == 1) {
//				a = a + 1;
				a++;
			} else {
//				b = b + 1;
				b++;
			}
		}
		System.out.println("홀수 개수 : " + a + "개");
		System.out.println("짝수 개수 : " + b + "개");
	}
	

}
