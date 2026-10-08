package Levelnxt;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regularexpressiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		//Pattern p=Pattern.compile("..at");
		//Pattern p=Pattern.compile("[0-9]{10}");
		//Pattern p=Pattern.compile("[A-Z a-z 0-9]{3,}");
		//Pattern p=Pattern.compile("[^A-Z a-z 0-9] {3,}");
		//Pattern p=Pattern.compile("[a-z]+");min1-max infinite
		//Pattern p=Pattern.compile("[a-z]*");
		Pattern p=Pattern.compile("[A-Z][a-z]{2,}");
		System.out.println("enter your name only small letters:");
		String input=scan.next();
		Matcher m=p.matcher(input);
		if(m.matches()==true)
		{
			System.out.println("valid format");
		}
		else
		{
			System.out.println("invalid format");
			
		}
	}

}
