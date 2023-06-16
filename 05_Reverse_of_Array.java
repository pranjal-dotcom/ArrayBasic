//reverse an array of integer
import java.util.Scanner;

public class A12 {

	public static void main(String[] args) {
	int [] arr,temp;
	int n;
	System.out.println("enter the size of an array");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	arr=new int[n];
	temp=new int[n];
	for(int i=0;i<n;i++)
	{
		System.out.print("Enter " + (i+1) + " element of array");
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		System.out.println( (i+1) + " element of array is " + arr[i]);
		
	}
	for(int i=n-1,j=0;i>=0;i--,j++)
	{
		temp[j]=arr[i];
		
	}
	System.out.println("After reversing the array the array is ");
	for(int i=0;i<n;i++)
	{
		arr[i]=temp[i];
		System.out.println( (i+1) + " element of array is " + arr[i]);
		
	}
	}

}
