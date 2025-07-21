package JavaTest_0721;

public class Q_06_0721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; // 합계 출력용 변수
		for (int i=1;i<=100;i++) {
			sum = sum + i;
			if(sum >= 100) {
				System.out.println("마지막으로 더한 수 : "+ i);
				break;
			}
		}
		
		System.out.println(sum);
			
	}

}
