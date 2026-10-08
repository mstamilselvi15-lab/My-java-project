package Levelnxt;

import java.io.File;
import java.io.FileInputStream;

public class Filedemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f1=new File("C:\\Users\\mskav\\Downloads\\qwer.txt");
		if (f1.exists())
		{
			long len=f1.length();
			System.out.println("available+len");
			FileInputStream fis=new FileInputStream(f1);
			for (int i=0;i<len;i++)
			{
				System.out.println((char)fis.read());
		    }
			
		fis.close();
	}
		else {
			System.out.println("not available");
		}
	}

}
