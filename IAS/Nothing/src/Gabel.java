import java.util.concurrent.Semaphore;

public class Gabel{
    private final Semaphore Sema = new Semaphore(1);
    private Thread owner = null;
    public void nehmen(Thread Owner) throws InterruptedException{
        Sema.acquire();
        owner = Owner;
    }
    public void freigeben(){
        Sema.release();
        owner = null;
    }
}
