import java.util.*;
public class LargestAndSmallest
{
    public static void main(String[] args) 
    {
        System.out.print("Enter the length of the array : ");
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[50];
        System.out.print("Enter the elements of the array : ");
        for(int i=0;i < len;i++)
        {
            arr[i]=sc.nextInt();
        }
        int large = arr[0];
        int small = arr[0];
        for(int i=0;i<len;i++) { if(large<arr[i])
            {
                large=arr[i];
            } 
            else if(small>arr[i])
            {
                small=arr[i];
            }
        }
        System.out.println("The largest element of the array : "+large);
        System.out.println("The Smallest element of the array : "+small);
    }
}