//Java program to calculate power of a number
import java.util.Scanner;
public class Power_of_a_number
{
	public static void main(String[] args)
	{
		//scanner class declaration
		Scanner sc = new Scanner(System.in);
		//input base value and exponent value from user
		System.out.print("Enter the value of base : ");				
		int base = sc.nextInt();
		System.out.print("Enter the value of exponent : ");				
		int exp = sc.nextInt();
		//declare an integer variable to store the result
                int result = 1;
		//logic for calculating power of the entered number
                while (exp != 0)
                {
                    result = result * base;
                    --exp;
                }
		//print the result
                System.out.println("Answer = " + result);
		//closing scanner class(not compulsory, but good practice)
		sc.close();	
        }
}
Step 1 : Ask the user to enter the base value and the exponent value. 

Step 2 : Declare a variable for storing the result.

Step 3 : Use a loop to multiply base by itself till the exponent value does not becomes 0 and decrease the value of exponent after every 
iteration of the loop.

Step 4 :  Print the result.

 