public class Main {
    public static void main(String[] args) {
        int i = 1;
        Thread1 thread1 = new Thread1(i);
        Thread1 thread2 = new Thread1(i);

        thread1.start();
        thread2.start();
    }
}