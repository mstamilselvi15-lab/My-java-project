package Levelnxt;
class Emp
{
	int eno;
	String ename;
	float sal;
	boolean iseligible;
	Emp(int eno,String ename,float sal,boolean iseligible)
	{
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		this.iseligible=iseligible;
	}
}
class Student<T>
{
	void dis(T var)
	{
		System.out.println(var);
	}
	void dis1(T v)
	{
		Emp k=(Emp)v;
		
		System.out.println(k.eno);
		System.out.println(k.ename);
		System.out.println(k.sal);
		System.out.println(k.iseligible);
	}
}
public class Gcdemeo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student<String> s1=new Student<String>();
		s1.dis("tamilselvims");
		Student<Integer>s2=new Student<Integer>();
		s2.dis(100);
		Student<Float>s3=new Student<Float>();
		s3.dis(100.87f);
		
		Emp e=new Emp(1001,"tghkjn",29910.10f,true);
		Student<Emp> s4=new Student<Emp>();
		s4.dis1(e);
	
	}

}
