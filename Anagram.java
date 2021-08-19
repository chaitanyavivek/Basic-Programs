import java.util.*;
public class Anagram{
static final int CHAR=256;
static boolean isAnagram(String s1,String 2){
if(s1.length()!=s2.length())
return false;
int arr[]=new int[256];
for(int i=0;i<s1.length();i++){
arr[s1.charAt(i)]++;
arr[s2.charAt(i)]--;
}
for(int i=0;i<CHAR;i++)
if(count[i]!=0)
return false;
return true;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter two strings");
String s1 = sc.next();
String s2 = sc.next();
if (isAnagram(str1,str2))
System.out.println("they are anagram");
else
System.out.println("they are not anagram");
}
}
}

