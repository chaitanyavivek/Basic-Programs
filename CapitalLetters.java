import java.util.Scanner;
public class CapitalLetters{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println("Enter a string");
String newstr=" ";
String str[]=s.split("\\s");  //splitting sentence into word converted to String array
for(int i=0;i<str.length;i++){
newstr+=Character.toUpperCase(str[i].charAt(0));
for(int j=1;j<str[i].length()-1;j++)
newstr+=str[i].charAt(j);
newstr+=Character.toUpperCase(str[i].charAt(str[i].length()-1))+" ";
}
System.out.println(newstr);
}
}
we only need to convert 1st and last letter in string
ex:-  my name is vivek  -->MY NamE IS ViveK