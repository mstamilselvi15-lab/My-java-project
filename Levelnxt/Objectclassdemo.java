package Levelnxt;
class Parent
{
 void show()
 {
	 System.out.println("this is parent class");
 }
}
class child extends Parent{
	void show()
	{
		System.out.println("this is child class");
	}
	
}
public class Objectclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new child();
		p.show();
		
		child c=(child) p;
		c.show();
	}

}
