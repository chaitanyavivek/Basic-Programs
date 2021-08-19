import java.util.*;
import java.util.Scanner;
public class Binary_to_Decimal{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the binary number");
int binary=sc.nextInt();
int decimal=0;
int n=0;
while(binary>0){
int temp=binary%10;
decimal+=temp*Math.pow(2,n);
binary=binary/10;
n++;
}
System.out.println("Decimal number :"+decimal);
sc.close();
}
}
                          