package datientrinh;
public class ThreadTest implements Runnable{
    Thread objTh;
    public ThreadTest(){
        System.out.println(Thread.currentThread().getName());
        objTh=new Thread(this);
        System.out.println("Thread objTh isAlive = "+ objTh.isAlive());
        objTh.setName("New Thread");
        objTh.start();
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.activeCount());
        System.out.println("Thread objTh isAlive = "+ objTh.isAlive());
    }
    public static void main(String[] args) {
        new ThreadTest();
    }
}
