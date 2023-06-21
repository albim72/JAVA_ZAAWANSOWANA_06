public class Consumer implements Runnable {
    Q q;
    Thread t;

    public Consumer(Q q) {
        this.q = q;
        t = new Thread(this,"Konsument");
    }

    public void run() {
        while (true) {
            q.get();
        }
    }
}
