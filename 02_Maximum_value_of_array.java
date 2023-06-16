//maximum element of array 

import java.util.*;
public class Maximum_Array {

	public static void main(String[] args) {
		int n,max;
		int [] arr;
		System.out.println("entre size of array");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		arr=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("enter " + (i+1) + " array element");
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println( (i+1) + " array element is " + arr[i]);
			
		}
		max=arr[0];
		for(int i=0;i<n;i++)
		{
		  if(max<arr[i])
		  {
			  max=arr[i];
		  }
		}
		System.out.println("Maximum value of array is " + max);
		sc.close();
	}

}
