package Levelnxt;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialdemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ObjectInputStream ois=new ObjectInputStream (new FileInputStream("tamil.txt"));
		Employee e=(Employee) ois.readObject();
		System.out.println(e.eno);
		System.out.println(e.ename);
		System.out.println(e.esal);
		ois.close();
		
	}

}
