package Levelnxt;
class MyError implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread called "+ Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
            }
        }
    }
}
public class Threaddemo1{
    public static void main(String[] args) throws Exception {
    	MyError my1 = new MyError();
        Thread m1 = new Thread(my1);
        MyError my2 = new MyError();
        Thread m2 = new Thread(my2);
        m1.setName("tamil");
        m2.setName("sakthi");
        m1.start();
        m1.join();
        System.out.println(m1.getName()+"alive: "+m1.isAlive());
        System.out.println(m2.getName()+"alive: "+m2.isAlive());
        m2.start();
        System.out.println(m1.getName()+"alive: "+m1.isAlive());
        System.out.println(m2.getName()+"alive: "+m2.isAlive());
        m2.join();
    }
}