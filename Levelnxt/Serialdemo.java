package Levelnxt;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	 int eno;
	 String ename;
	 float esal;
	public Employee(int eno, String ename, float esal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
	}	
}
public class Serialdemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Employee e=new Employee(44,"sakthi" , 9432.1f);
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("tamil.txt"));
		oos.writeObject(e);
		System.out.println("data written successfully");
	}

}
