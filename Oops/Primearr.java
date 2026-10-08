package Oops;

public class Primearr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={22,11,55,63,77,13,99,47,56};
		int len=arr.length;
		System.out.println("size of the array:"+len);
		for(int i=0;i<len;i++)
		{
			int zc=0;
			int n=arr[i];
			for(int j=2; j<n; j++)
			{
				if(n%j==0)
				{
					zc++;
				}
				
			}
			if(zc==0)
				System.out.println(n+" is prime number");
		}

	}

}
