package datientrinh;
public class MyThread2 implements Runnable{
    public static void main(String[] args) {
        MyThread2 myRunnable = new MyThread2();
        Thread th2= new Thread(myRunnable);
        th2.start();
        System.out.println("This is the main thread");
    }
    public void run(){
        while(true){
            try {
                System.out.println("This is the child thread");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
