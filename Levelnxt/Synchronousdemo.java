package Levelnxt;

public class Synchronousdemo {
	int cnt=0;
	public synchronized void countMethod()
	{
		cnt++;
	}
	public int showCount() {
		return cnt;
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Synchronousdemo sd=new Synchronousdemo ();
		Thread t1=new Thread(new Runnable() {
			public void run(){
				for (int i=1;i<=1000;i++)
				{
					sd.countMethod();
				}
			}
		});
		Thread t2=new Thread(new Runnable() {
			public void run(){
				for (int i=1;i<=1000;i++)
				{
					sd.countMethod();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(sd.showCount());
	
	}
}
