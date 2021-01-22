package lesson29.thread;

import lesson29.util.HelperExample;

import java.util.concurrent.Callable;

public class ThirdThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        HelperExample.startMethods();
        return HelperExample.result.get();
    }
}
