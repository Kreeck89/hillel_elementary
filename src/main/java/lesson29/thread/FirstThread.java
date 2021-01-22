package lesson29.thread;

import lesson29.util.HelperExample;

public class FirstThread extends Thread {

    @Override
    public void run() {
        HelperExample.startMethods();
    }


}
