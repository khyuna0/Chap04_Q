package JavaChap04Test_0721;

public class Q_03_0721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		 for(int i=1;i<=100;i++) {
			 if( i % 2 == 1 ) {
				 sum = sum + i; // sum += i
			 }
		 }
		 System.out.println(sum);
		 
		 System.out.println("====================");
		 
			int sum1 = 0;
			 for(int i=1;i<=100;i++) {
				 if( i % 2 == 0 ) {
					continue;
				 }
				 sum1= sum1 + i;
			 }
			 System.out.println(sum1);
			 
	}

}
