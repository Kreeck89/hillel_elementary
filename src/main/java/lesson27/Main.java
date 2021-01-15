package lesson27;

import lesson27.deadlock.FirstClass;
import lesson27.deadlock.SecondClass;
import lesson27.threads.MyCallable;
import lesson27.threads.MyRunnable;
import lesson27.threads.MyThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {

    private static Integer integer = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //Создание потоков и управление ими

//        MyThread myThread = new MyThread();
//        myThread.setName("FIRST");
//        myThread.start();
////        myThread.run();
//        System.out.println("END");
//        System.out.println("END");
//        System.out.println("END");
//        System.out.println(myThread.isAlive());
//
//        myThread.join();
//
////        myThread.interrupt();
////        if (myThread.isInterrupted()) {
////            System.out.println(myThread.getName() + " isInterrupted");
////        }
//
////        Thread.sleep(5000);
//
//        MyRunnable myRunnable = new MyRunnable();
////        myRunnable.run();
//        Thread threadRunnable = new Thread(myRunnable);
//        threadRunnable.setPriority(Thread.MIN_PRIORITY);
//        threadRunnable.start();
//
//        MyCallable myCallable = new MyCallable();
//        FutureTask<String> task = new FutureTask<>(myCallable);
//        Thread threadCallable = new Thread(task);
//        threadCallable.start();
//        String result = task.get();
//        System.out.println("threadCallable: " + result);
//
////        myThread.start();
//        System.out.println(myThread.isAlive());
//
//        System.out.println(Thread.currentThread().getName());

        //Пример использования синхронизированного метода

//        Runnable first = () -> {
//            Thread.currentThread().setName("FIRST");
//            print();
//        };
//
//        Runnable second = () -> {
//            Thread.currentThread().setName("second");
//            print();
//        };
//
//        Thread threadFirst = new Thread(first);
//        Thread threadSecond = new Thread(second);
//        threadFirst.start();
//        threadSecond.start();

        FirstClass firstClass = new FirstClass();
        SecondClass secondClass = new SecondClass();

        firstClass.setSecondClass(secondClass);
        secondClass.setFirstClass(firstClass);

        Thread first = new Thread(() -> System.out.println(firstClass.getStringFromSecondClass()));
        Thread second = new Thread(() -> System.out.println(secondClass.getStringFromFirstClass()));

        first.start();
        second.start();
    }

    private synchronized static void print() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() +". increment: " + integer++);
        }
    }

    private static void test() {
        //some logic
        synchronized (new Object()) {
            //other logic
        }
        //some logic
    }
}
