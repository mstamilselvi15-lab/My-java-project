package Levelnxt;

public class Ascend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="tamilselvi";
		int len=name.length();
		char arr[]=name.toCharArray();
		char temp;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr);
	}
	
	}
     

	
	


