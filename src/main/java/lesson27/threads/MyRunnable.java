package lesson27.threads;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
//        try {
//            Thread.sleep(7000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        for (int i = 0; i < 1000; i++) {
            System.out.println("Thread 2");
        }
    }
}
