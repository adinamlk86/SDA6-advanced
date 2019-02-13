package concurrency;

public class StopwatchThread implements Runnable {

//    private String prefix;
//
//    public StopwatchThread(String prefix) {
//        this.prefix = prefix;
//    }

    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
