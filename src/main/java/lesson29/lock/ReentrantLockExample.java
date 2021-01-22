package lesson29.lock;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    Lock lock = new ReentrantLock();
    //    public static int lockInteger = 0;
    public static AtomicInteger lockInteger = new AtomicInteger();

    public void first() {
        lock.lock();
//        System.out.println(Thread.currentThread().getName() + " " + ++lockInteger);
        System.out.println(Thread.currentThread().getName() + " " + lockInteger.incrementAndGet());
    }

    public void second() {
//        System.out.println(Thread.currentThread().getName() + " " + ++lockInteger);
        System.out.println(Thread.currentThread().getName() + " " + lockInteger.incrementAndGet());
    }

    public void third() {
//        System.out.println(Thread.currentThread().getName() + " " + ++lockInteger);
        System.out.println(Thread.currentThread().getName() + " " + lockInteger.incrementAndGet());
        lock.unlock();
    }
}
