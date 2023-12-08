import java.util.concurrent.TimeUnit;

class Thread1 extends Thread {
    private int i;

    public Thread1(int i) {
        this.i = i;
    }

    @Override
    public synchronized void run() {
        try {
            // Hier können deine Thread-Aktionen stattfinden
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        i++;
        System.out.println(i);
    }
}