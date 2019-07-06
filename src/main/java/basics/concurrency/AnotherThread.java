package basics.concurrency;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-05-25
 */
public class AnotherThread extends Thread{

    public static void main(String[] args) {
        System.out.println("Main thread");
        System.out.println(Thread.currentThread().getName());
        AnotherThread anotherThread = new AnotherThread();
        anotherThread.start();
    }


    @Override
    public void run(){
        System.out.println("Another thread");
        System.out.println(Thread.currentThread().getName());
    }
}
