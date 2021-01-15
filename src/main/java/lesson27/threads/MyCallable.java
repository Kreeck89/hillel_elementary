package lesson27.threads;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            Thread.sleep(50);
            System.out.println("Thread 3");
        }
        return "FINISHED";
    }
}
