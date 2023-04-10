package learning_java_2nd_Apr_basicsofjava;

public class Assignment_Inc_Dec {

	public static void main(String[] args) {
		int i = 1; //latest value of i =1
		--i; //latest value of i = 0
		
		int j = --i - i-- - ++i;
	//		j = -1 - (-(-1) - 2
			//j= -1 - 1 -2
		// j = -2
		int k = j-- - --i + ++j + i--;
		//  k = -2-- -(-3) +
		//  k = -3 - 3 +
		int l = i-- - ++j - --j + k--;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);

	}

}
