package learning_java_2nd_Apr_basicsofjava;
//CONTROL STATEMENTS
//1. Selection or conditional statements;
	//if, if else, if elseif, nested if, switch
//2. Iteration or looping statements
	//for, while, do while
//3. Jump statements
	//break, continue, return


public class ControlStatements {

	public static void main(String[] args) {
		// selection or control statements
		//they control the flow of program execution on the basis of the outcome of an expression (condition)
		// condition could be true or false
		
		if(1>2) 
		{
			System.out.println("grass is green");
		}
		else if(true==false)
		{
			System.out.println("this logic is incorrect");
		}
		else if (23<22)
		{
			System.out.println("this logic inside second elseif can be true");
		}
		else 
		{
			System.out.println("nothing above is correct");
		}
		}
		

}
