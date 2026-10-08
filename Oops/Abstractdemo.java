package Oops;
abstract class Aclass{
	 int a;
	int b=20;
	abstract void dis1();
	 void dis2()
	{
		a=100;
		System.out.println("complete method");
	}
}
public class Abstractdemo extends Aclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractdemo ad=new Abstractdemo();
		ad.dis1();
		ad.dis2();

	}

	@Override
	
	void dis1() {
		// TODO Auto-generated method stub
		System.out.println("override incomplete methods");
		System.out.println(b);
		
	}

}
