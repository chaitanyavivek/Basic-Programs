import java.util.*;
public class SmallestElementArray{
public static void main(String args[]){
int min,len,i;
int arr[]=new int[200];
Scanner sc=new Scanner(System.in);
System.out.println("enter the length of array");
len=sc.nextInt();
System.out.println("enter the elemnets to thea array");
for(i=0;i<len;i++){
arr[i]=sc.nextInt();
}
min=arr[0];
for(i=0;i<len;i++){
if(min>arr[i])
{
min=arr[i];
}
}
System.out.println("Smallest element in the array is " + min);
}
}