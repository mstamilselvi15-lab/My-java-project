package Levelnxt;

import java.util.Scanner;

public class Usercustom {
	Scanner scan=new Scanner(System.in);
	public Usercustom(){
		System.out.println("Enter mark:");
		int mark=scan.nextInt();
		if(mark>0 && mark<=100)
		{
			System.out.println("valid mark");
		}
		else
		{
			try {
				throw new Exception("Pls enter mark only 0 10 100");
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
			new Usercustom();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Usercustom();

	}

}
