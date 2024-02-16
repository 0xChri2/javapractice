public class Main {
    public static void main(String[] args) {
        BankKunde Dagobert = new BankKunde("Dogober",2, 200, 2000);
        BankKunde donald = new BankKunde("Donald",3, 300, 3000);
        donald.start();
        Dagobert.start();
    }
}