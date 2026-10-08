package Oops;

public class Evensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        int arr[] = {22, 43, 55, 65, 77, 100, 99, 31, 50};
		        int sum = 0;

		        System.out.print("Even numbers: ");

			        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] % 2 == 0) {
		                System.out.print(arr[i] + " ");
		                sum = sum + arr[i];
		            }
		        }

		        System.out.println();
		        System.out.println("Sum = " + sum);
		    }
		
	}


