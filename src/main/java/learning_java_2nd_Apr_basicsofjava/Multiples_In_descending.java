package learning_java_2nd_Apr_basicsofjava;

public class Multiples_In_descending {

	public static void main(String[] args) {
		int i = 99;
		int sum = 0;
		while(i>=1) {
			System.out.println("Multiples of 11 in descending order are " +i);
			sum = sum+i;
			i = i-11;
		}
System.out.println("sum of the numbers is" +sum);
	}

}
