import java.util.Scanner;
public class palindrome_or_not
{	
	public static void main(String[] args)
	{
		//scanner class declaration
		Scanner sc = new Scanner(System.in);
		//input from user
		System.out.print("Enter a String : ");				
		String st = sc.next();
                int len=st.length();
                //string variable to store reversed string
                String st1="";
                for(int i=0;i<len;i++){
                //string fun for getting charac at particular index
                char ch=st.charAt(i);
                 st1=st1+ch;
               }
            if(st.equals(st1))
                    System.out.println("palindrome");
            else
                    System.out.println("Not palindrome");
             sc.close();
   }
}

