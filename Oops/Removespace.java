package Oops;

public class Removespace {

	public static void main(String[] args) {
		String s="i     am             tamil";
		int len=s.length();
		for (int i=0; i<len;i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
			{
				continue;
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
	}

}
