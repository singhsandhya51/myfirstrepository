package learning_java_2nd_Apr_basicsofjava;

public class Multiples_Of_5 {

	public static void main(String[] args) {
		int i = 5;
		int sum=0;
		while(i<=50) {
			System.out.println(i);
			sum=sum+i;
			i+=5;
		}
		
		System.out.println("The sum of multiples of 5 = " +sum);
	}

}
