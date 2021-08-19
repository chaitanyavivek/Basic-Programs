import java.util.Scanner;
public class RemoveAllWhiteSpacesFromString{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String s=sc.nextLine();
char[] c=s.toCharArray();
StringBuffer sb=new StringBuffer();
for(int i=0;i<c.length;i++){
if((c[i]!= ' ') && (c[i]!='\t')){
sb.append(c[i]);
}
}
System.out.println("String after removing spaces"+sb);
}
}