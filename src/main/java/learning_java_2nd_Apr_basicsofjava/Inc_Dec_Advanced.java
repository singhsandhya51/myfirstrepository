package learning_java_2nd_Apr_basicsofjava;

public class Inc_Dec_Advanced {

	public static void main(String[] args) {
		int i=1; //latest value of i=1
		i= i++ + i--;
		
	  //i = 1	+2 =3
	  //i = 2,	 + 1 
		System.out.println(i);
		
		int j = 1; //latest value of j =1
		j++; //latest value of j =2
		int k = ++j - --j;
	//		k = 3 - 3 = 0
		//  j = 3,2
		
		int l = ++j - j++ - --k + k --; //0
		System.out.println(j); //2
		System.out.println(k);
		System.out.println(l);
	}

}
