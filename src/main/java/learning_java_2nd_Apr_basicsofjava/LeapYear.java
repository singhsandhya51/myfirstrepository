package learning_java_2nd_Apr_basicsofjava;

public class LeapYear {

	public static void main(String[] args) {
		int year1 = 1996;
		int year2 = 2000;
		int year3 = 1984;
		if (year1 % 4==0 && year1 %100 !=0)
		{
			System.out.println("year 1 is leap year");
		}
		else 
		{
			System.out.println("year1 is not a leap year");
		}
		if (year2 % 4==0 && year2 %100 !=0)
		{
			System.out.println("year 2 is leap year");
		}
		else 
		{
			System.out.println("year2 is not a leap year");
		}
		if (year3 % 4==0 && year3 %100 !=0)
		{
			System.out.println("year 3 is leap year");
		}
		else 
		{
			System.out.println("year3 is not a leap year");
		}
	}

}
