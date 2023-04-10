package learningjava_30th_mar_basicsofjava;

public class DataTypes {

	public static void main(String[] args) {
	//int stores integer values
	//range of int is 2^38 to 2^37
	//stores whole numbers
		int i = -2147483648;
		int j = 2147483647;
		
		// short also stores integer values
		// stores whole number from -32768 to 32767
		
		short s1 = -32768;
		short s2= 32767;
		
		// long also store integer values 
		// stores whole numbers from -9233372036854775808 to 9223372036854775807
	 long l1 = 0;
	 long l2 = -123;
	 
	 //byte also stores integer values
	 // stores whole numbers from -128 to 127
	 
	 byte b1 = -128;
	 byte b2 =127;
	 
	 // boolean stores true or false
	 
	 boolean b11 = true; //true is a condition
	 boolean b12 = false; // false is also a condition
	 
	 boolean b13 = 1<2; // this also a condition
	 
	 // char stores a single entity within a single quote' ' 
	 
	 char c1 = ' ';
	 char c2 = '1';
	 char c3 = 'S';
	 char c4 ='a';
	 char c5 ='$';
	 
	 //double is used to store decimal numbers
	 //stores fractional numbers . sufficient for storing is upto 15 decimals
	 
	 //string
	 // string is a class in itself
	 // string is the god of all class in java
	 
	 String S1 = "hello world";
	 String S2 = new String("hello world");
	 
	 // array - [] is one dimension, [][] is 2 dimension
	 int[] array = new int[3];
	 int[] array1 = {1,2,3,4,5};
	 
	 
	 //class
	 DataTypes dt = new DataTypes();
	 dt.sampleTest();
	}
public void sampleTest() {
	System.out.println(1+2);
}
}

