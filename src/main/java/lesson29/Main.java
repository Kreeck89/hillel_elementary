package lesson29;

import lesson29.lock.ReentrantLockExample;
import lesson29.thread.FirstThread;
import lesson29.thread.SecondThread;
import lesson29.thread.ThirdThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        FirstThread firstThread = new FirstThread();
//        firstThread.start();

//        for (int i = 0; i < 100; i++) {
//            new FirstThread().start();
//        }

//        Thread thread1;
//        for (int i = 0; i < 10000; i++) {
//            thread1 = new Thread(new SecondThread());
//            thread1.start();
//        }
//        Thread.sleep(1000);
//        System.out.println(SecondThread.increment);

//        FutureTask<Integer> task = null;
//        for (int i = 0; i < 1000; i++) {
//            ThirdThread thirdThread = new ThirdThread();
//            task = new FutureTask<>(thirdThread);
//            Thread thread2 = new Thread(task);
//            thread2.start();
//        }
//
//        Thread.sleep(3000);
//        System.out.println(task.get());

        Thread thread3 = new Thread(new Runnable() {
            private ReentrantLockExample lockExample = new ReentrantLockExample();

            @Override
            public void run() {
                lockExample.first();
                lockExample.second();
                lockExample.third();

            }
        });

        Thread thread4 = new Thread(new Runnable() {
            private ReentrantLockExample lockExample = new ReentrantLockExample();

            @Override
            public void run() {
                lockExample.first();
                lockExample.second();
                lockExample.third();

            }
        });

        thread3.start();
        thread4.start();
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " result: " + ReentrantLockExample.lockInteger);
    }
}
