package lesson29.util;

import java.util.concurrent.atomic.AtomicInteger;

public class HelperExample {
    public static AtomicInteger result = new AtomicInteger();

    public static synchronized void startMethods() {
        method1();
        method2();
    }

    private static void method1() {
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        result.incrementAndGet();
        System.out.println("method1 with thread " + Thread.currentThread().getName());
    }

    private static void method2() {
        result.incrementAndGet();
        System.out.println("METHOD2. THREAD " + Thread.currentThread().getName());
    }
}
