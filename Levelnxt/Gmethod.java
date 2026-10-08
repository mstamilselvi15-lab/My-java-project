package Levelnxt;


public class Gmethod {
	<T> void display(T a,T b)
	{
		System.out.println(a+" "+b);
	}
	
	<T> void dis2(T V)
	{
	    System.out.println(((Emp)V).eno);
	    System.out.println(((Emp)V).ename);
	    System.out.println(((Emp)V).sal);
	    System.out.println(((Emp)V).iseligible);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gmethod gm=new Gmethod();
		gm.display(101, "tamil");
		gm.display(102, "kavi");
		gm.display("TT", "OT");
		gm.display(11.22f,"t");
        Emp e1=new Emp(102,"tamil",123345.98f,false);
        gm.dis2(e1);
	}

}
