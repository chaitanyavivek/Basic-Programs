import java.util.*;
class CapitalFirstWordString
{
 public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     System.out.print("Enter String : "); 
String s = sc.nextLine(); 
String newstr = " "; 
String[] str = s.split(" "); // splitting sentence into word converted to String array 
for (int i=0; i<str.length;i++) { 
newstr = newstr + Character.toUpperCase(str[i].charAt(0)); 
for(int j=1; j<str[i].length()-1;j++) 
newstr = newstr + str[i].charAt(j);
newstr = newstr + Character.toUpperCase(str[i].charAt(str[i].length()-1))+" "; 
}
System.out.println(newstr);
}
}