public class Main {
    public static void main(String[] args) {
        Bankkunde dagobert = new Bankkunde("dagobert", 21);
        Bankkunde donald = new Bankkunde("donald", 22);

        donald.start();
        dagobert.start();
        try{
            throw new Exep("Test");
        } catch (Exep e){
            System.out.println("Nixasd"+ e.getMessage());
        }
    }
}