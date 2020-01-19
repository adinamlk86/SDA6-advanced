package concurrency;

public class MainBench {

    public static void main(String[] args) {
        Bench bench = new Bench(4);
        TakeASeat sit = new TakeASeat(bench);
        TakeASeat sit2 = new TakeASeat(bench);
        sit.start();
        sit2.start();
    }
}
