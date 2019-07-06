package basics.concurrency;

import java.util.stream.IntStream;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-05-25
 */
public class NonDemonAndDemonThread {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting "+Thread.currentThread().getName());
        Thread demonThread = new Thread(() -> IntStream.rangeClosed(1,10000).forEach(System.out::println));
        demonThread.setDaemon(true);
        demonThread.start();

        Thread.sleep(10);

        System.out.println("Ending "+Thread.currentThread().getName());
    }
}
