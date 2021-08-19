//Java program to find factorial of a number
import java.util.Scanner;
public class factorial
{	
	public static void main(String[] args)
	{
		//scanner class declaration
		Scanner sc = new Scanner(System.in);
		//input from user
		System.out.print("Enter a number : ");				
		int number = sc.nextInt();
		if(number >= 0)
		{
			//declare a variable to store factorial
			int fac = 1;
			for(int i = number ; i >= 1 ; i--)
			fac = fac * i;
			//display the result
			System.out.println("Factorial of "+number+" is "+fac);
			//closing scanner class(not compulsory, but good practice)
		}
		else
			System.out.println("Value is not defined, please re-enter the value");
		sc.close();													
	}
}