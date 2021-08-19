import java.util.*;
public class LargestElementArray{
public static void main(String args[]){
int largest,len,i;
int arr[]=new int[200];
Scanner sc=new Scanner(System.in);
System.out.println("enter the length of array");
len=sc.nextInt();
System.out.println("enter the elemnets to thea array");
for(i=0;i<len;i++){
arr[i]=sc.nextInt();
}
largest=arr[0];
for(i=0;i<len;i++){
if(largest<arr[i])
{
largest=arr[i];
}
}
System.out.println("Largest element in the array is " + largest);
}
}