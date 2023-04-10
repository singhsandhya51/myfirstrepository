package learningjava_30th_mar_basicsofjava;

public class Concatenation_Operator {

	public static void main(String[] args) {
		// Concatenation is joining. This is represented in java by + symbol
		System.out.println(1+2);
		int i = 25;
		int j = 30;
		String S1= "HELLO";
		String S2 = "WORLD";
		System.out.println(S1 + S2);
		System.out.println(i+j+S1+S2);
		System.out.println(S1+S2+i+j);
		System.out.println(S1+S2+(i+j));

	}

}
