package Levelnxt;

import java.util.Scanner;

public class Exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		try
		{
			System.out.println("enter 2 numbers:");
			
			System.out.println("Enter array size:");
			int size=scan.nextInt();
			
			int arr[]=new int[size];
			System.out.println("Array size accepted");
			
			
			
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Error:"+e.toString());
		}
		
		scan.close();
	}
}

