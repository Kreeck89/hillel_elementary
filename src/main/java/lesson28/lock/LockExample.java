package lesson28.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    private Lock lock = new ReentrantLock();

    public void print() {
        lock.lock();
        for (int i = 0; i < 100; i++) {
            System.out.println("print method write");
        }
        //some logic...
    }

    public void write() {
        //some logic...
        for (int i = 0; i < 100; i++) {
            System.out.println("write");
        }
        lock.unlock();
    }
}
