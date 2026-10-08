package Levelnxt;

//import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.Vector;
public class Listdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> li=new ArrayList<Integer>();
		//LinkedList<Integer> li=new LinkedList<Integer>();
		Vector<Integer> li=new Vector<Integer>();
		li.add(11);
		li.add(11);
		li.add(22);
		li.add(51);
		li.add(61);
		li.add(11);
		li.add(null);
		li.add(12);
		li.add(null);
		System.out.println(li);
		li.addFirst(57);
		li.addLast(41);
		li.removeFirst();
		System.out.println(li);
	}

}
