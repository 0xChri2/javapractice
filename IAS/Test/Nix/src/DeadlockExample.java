public class DeadlockExample {
    public static void main(String[] args) {
        final String ressource1 = "Ressource 1";
        final String ressource2 = "Ressource 2";

        Thread thread1 = new Thread(() -> {
            synchronized (ressource1) {
                System.out.println("Thread 1: Hält Ressource 1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (ressource2) {
                    System.out.println("Thread 1: Hält Ressource 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (ressource2) {
                System.out.println("Thread 2: Hält Ressource 2");
                synchronized (ressource1) {
                    System.out.println("Thread 2: Hält Ressource 1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
