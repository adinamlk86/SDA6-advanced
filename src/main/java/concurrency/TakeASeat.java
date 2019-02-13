package concurrency;

public class TakeASeat extends Thread{

    private Bench bench;

    public TakeASeat(Bench bench){
        this.bench=bench;
    }

    public void run(){
        bench.takeASeat();
    }
}
