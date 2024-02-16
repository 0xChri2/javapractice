import java.util.concurrent.TimeUnit;

class Thread1 extends Thread {
    private static int i = 1;

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (Thread1.class) {
            i++;
            System.out.println(i);
        }
    }
}