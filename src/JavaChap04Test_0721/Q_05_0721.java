package JavaChap04Test_0721;

public class Q_05_0721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1;i<=50;i++) {
			if(50 % i == 0) {
				System.out.println(i);
			}
		}
		System.out.println("=====================");
		
		for(int i=1;i<=50;i++) {
			if(50 % i != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
