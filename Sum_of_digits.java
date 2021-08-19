import java.util.Scanner;
public class Sum_of_digits{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
int sum=0;
while(num!=0){
int ld=num%10; //to get the last digit
sum+=ld;
num/=10;//to remove the last digit
}
System.out.println("Sum of digits"+sum);
sc.close();
}
}