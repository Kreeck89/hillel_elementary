package lesson29.thread;

import java.util.concurrent.atomic.AtomicLong;

public class SecondThread implements Runnable {
    public static AtomicLong increment = new AtomicLong();

    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("increment: " + increment.decrementAndGet());
    }

}
