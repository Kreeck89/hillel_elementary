package lesson28;

import lesson28.lock.LockExample;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    private volatile static int value = 0;
    private static AtomicInteger atomicInteger = new AtomicInteger();
    private static LockExample lockExample = new LockExample();

    public static void main(String[] args) throws InterruptedException {

        //wait() & notify() примеры вызовов:

        Object object = new Object();
        Thread thread = new Thread(() -> {
            synchronized (object) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread: " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                object.notify();
            }
        });
        thread.start();

        synchronized (object) {
            object.wait();
        }
        System.out.println("FINISHED");


        //VOLATILE пример работы с и без кеша:

        Thread thread1 = new Thread(() -> {
            while (value < 10) {
                System.out.println(Thread.currentThread().getName() + ". value = " + ++value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            int cachedInt = value;
            while (value < 10) {
                if (cachedInt != value) {
                    System.out.println(Thread.currentThread().getName() + ". value = " + value);
                    cachedInt = value;
                }
            }
        });

        thread1.start();
        thread2.start();

        //ATOMIC переменные. Пример применения:

        for (int i = 0; i < 100000; i++) {
            Thread thread0 = new Thread(() -> {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                atomicInteger.incrementAndGet();
            });
            thread0.start();
        }
        Thread.sleep(2000);
        System.out.println("atomicInteger result: " + atomicInteger.get());

//        Collections для многопоточной работы:

        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        HashMap<String, String> map = new HashMap<>();

        List<String> synchronizedList = Collections.synchronizedList(list);
        Set<String> synchronizedSet = Collections.synchronizedSet(set);
        Map<String, String> synchronizedMap = Collections.synchronizedMap(map);

        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
//        CopyOnWriteArraySet<String> stringCopyOnWriteArraySet = new CopyOnWriteArraySet<>();
        Set concurrentSet = ConcurrentHashMap.newKeySet();

        //Lock: пример использования:

        Thread thread3 = new Thread(new Runnable() {
            private LockExample lockExam = lockExample;

            @Override
            public void run() {
                lockExam.print();
                lockExam.write();
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            private LockExample lockExam = lockExample;

            @Override
            public void run() {
                lockExam.print();
                lockExam.write();
            }
        });

        thread3.start();
        thread4.start();

        //Executor service:

        ExecutorService executorServiceSingle = Executors.newSingleThreadExecutor();
        ExecutorService executorServiceFixed = Executors.newFixedThreadPool(10);
        ExecutorService cachedexecutorService = Executors.newCachedThreadPool();

        executorServiceFixed.execute(() -> System.out.println(Thread.currentThread().getName()));
        executorServiceFixed.execute(() -> System.out.println(Thread.currentThread().getName()));
        executorServiceFixed.shutdown();
//        executorServiceFixed.execute(() -> System.out.println(Thread.currentThread().getName()));
    }
}
