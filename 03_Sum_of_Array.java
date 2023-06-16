//Write a Java program to sum values of an array.
import java.util.*;
public class Sum_of_Array {
	public static void main(String args[])
	{
		int n,sum=0;
		int [] arr;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		n=sc.nextInt();
		arr=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("enter " + (i+1) + " element of array");
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.println( (i+1) + " array element is " + arr[i]);
			
		}
		System.out.println("sum is " + sum);
	}

}
