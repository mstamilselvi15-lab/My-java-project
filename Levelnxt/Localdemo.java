//package Levelnxt;
//import java.text.DateFormat;
//import java.util.Date;
//import java.util.Locale;

//public class Localdemo {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Date d=new Date();
		//System.out.println(d);
		
		//Locale l1=new Locale("IN","en");
		//DateFormat df=DateFormat.getDateInstance(DateFormat.LONG,l1);
		//System.out.println(df.format(d));
		
		//Locale l2=new Locale("en","US");
		//DateFormat df1=DateFormat.getDateInstance(DateFormat.SHORT,l2);
		//System.out.println(df1.format(d));
		
		//Locale l3=new Locale("Ja","JP");
		//DateFormat df2=DateFormat.getDateInstance(DateFormat.SHORT,l3);
		//System.out.println(df2.format(d));


		///Locale l1=new Locale("en","IN");
		//DateFormat df=DateFormat.getTimeInstance(DateFormat.LONG,l1);
		//System.out.println(df.format(d));
		
		//Locale l2=new Locale("en","US");
		//DateFormat df1=DateFormat.getTimeInstance(DateFormat.SHORT,l2);
		//System.out.println(df1.format(d));
		
		//Locale l3=new Locale("Ja","JP");
		//DateFormat df2=DateFormat.getTimeInstance(DateFormat.SHORT,l3);
		//System.out.println(df2.format(d));
		
		
	//}

//}
package Levelnxt;
import java.text.NumberFormat;

import java.util.Locale;

public class Localdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amt=1234789.234;
		
		Locale l1=new Locale("en","IN");
		NumberFormat df=NumberFormat.getCurrencyInstance(l1);
		System.out.println(df.format(amt));
		
		Locale l2=new Locale("en","US");
		NumberFormat df1=NumberFormat.getCurrencyInstance(l2);
		System.out.println(df1.format(amt));
		
		Locale l3=new Locale("Ja","JP");
		NumberFormat df2=NumberFormat.getCurrencyInstance(l3);
		System.out.println(df2.format(amt));
		
		
	}

}
