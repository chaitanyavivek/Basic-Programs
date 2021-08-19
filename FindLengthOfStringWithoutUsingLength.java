import java.util.Scanner;

public class FindLengthOfStringWithoutUsingLength {

	public static void main(String[] args) {
		int length=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
        String s = sc.next();
        for (char c1 : s.toCharArray()) 
			length++;
		System.out.println("Length of String is : "+length);
		
	}

}

In this program first we will take String input from user and store in the variable 
called s with the help of next()
After that we will take a for-each loop and in the paremeter of for-each loop we will 
convert the String to character 
array using toCharArray() 
After that for every variable we will take a variable named as count and increment 
this every time