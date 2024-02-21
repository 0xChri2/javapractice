public class Philosoph extends Thread{
    private Gabel GabelR;
    private Gabel GabelL;
    Philosoph(Gabel _GabelL, Gabel _GabelR){
        GabelR = _GabelR;
        GabelL = _GabelL;
    }
    public void speist() throws InterruptedException {
        GabelR.nehmen(this);
        GabelL.nehmen(this);
        wait(3000);
        GabelR.freigeben();
        GabelL.freigeben();

    }
@Override
    public void run(){
        try {
            speist();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
