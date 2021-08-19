import java.util.*;
public class NonRepeating{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String s=sc.next();
int freq[]=new int[256];
for(int i=0;i<s.length();i++)
freq[s.charAt(i)-'A']++;
System.out.println("Non repeating character is");
for(int i=0;i<256;i++)
if(freq[i]==1)
System.out.print((char) i+" ");
}
}

//we take freq array as size 256 which contains all the characters
//now we traverse through the freq array with given string so if given char is present
//freq becomes 2..like this if freq==1 we say it as non repeatinng character and print it
