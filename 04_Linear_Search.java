//Write a Java program to test if an array contains a specific value.
import java.util.*;

public class Linear_Search {

	public static void main(String[] args) {
		int n,find,flag=1;
		int [] arr;
		System.out.println("enter the size of array");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		arr=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter " + (i+1) + " element of array");
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the element you want to find");
		find=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if (arr[i]==find)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println(find + " element is there in the array ");
		}
		else
		{
			System.out.println(find + " element is not there in the array ");
		}
		sc.close();
	}

}
