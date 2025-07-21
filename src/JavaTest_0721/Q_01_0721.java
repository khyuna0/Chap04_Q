package JavaTest_0721;

public class Q_01_0721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=100;i++) { // && 연산시 공배수 출력
			if(i % 3 == 0 || i % 5 == 0 ) {
				System.out.println(i);
			}
		}
		
	}

}
