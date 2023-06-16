//take the array and print it
import java.util.Scanner;

public class Array_creation {

	public static void main(String[] args) {
	int [] arr ;
	int n;
	System.out.println("enter array size");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	arr=new int[n];
	for (int i=0;i<n;i++)
	{
		System.out.print("enter array "+ (i+1) + " element");
		arr[i]=sc.nextInt();
		
	}
	for (int i=0;i<n;i++)
	{
		System.out.println("array "+ (i+1) + " element is " + arr[i]);
		
	}
	sc.close();
	}

}
