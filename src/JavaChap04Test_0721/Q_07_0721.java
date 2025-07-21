package JavaChap04Test_0721;

public class Q_07_0721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for(int i=0;i<=100;i++) {
			if(i % 2 == 0) {
				sum = sum - i;
			} else {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
