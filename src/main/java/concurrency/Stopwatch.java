package concurrency;

public class Stopwatch {

    public static void main(String[] args) throws InterruptedException {

//        StopwatchThread stopwatch = new StopwatchThread("first counter");
//        StopwatchThread stopwatch2 = new StopwatchThread("second counter");
//        stopwatch.start();
//        stopwatch2.start();
//        System.out.println("Main thread starts");
//        Thread.sleep(5000);
//        System.out.println("Main thread is still running...");
//        Thread.sleep(5000);
//        System.out.println("Main thread ends");

        Thread stopWatchThread = new Thread(new StopwatchThread());
        stopWatchThread.start();

    }
}
