package Levelnxt;
//import java.util.HashMap;
//import java.util.TreeMap;
import java.util.Hashtable;
public class Mapdemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
		//TreeMap<Integer,Integer> m=new TreeMap<Integer,Integer>();
		Hashtable<Integer,Integer> m=new Hashtable<Integer,Integer>();
		m.put(1001,88);
		m.put(1002,77);
		m.put(1001,8);
		m.put(1002,20);
		m.put(1003,100);
		m.put(1003, 22);
		m.put(1004, 154);
		System.out.println(m);
	}
}
