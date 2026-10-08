package Oops;
interface Daddy
{
	int a=10;
	void show1();
}
interface Mummy
{
	int b=20;
	void show2();
}
public class Interfacedemo implements Daddy,Mummy{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfacedemo ifd=new Interfacedemo();
		ifd.show1();
		ifd.show2();
		
	}
	public void show1() {
		System.out.println("interface a"+a);
		System.out.println(b);
	}
	public void show2() {
		System.out.println(a+b);
	}
}
