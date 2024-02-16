
public class Main {
    public static void main(String[] args) {
        // Erstellen von Personen mit verschiedenen Einkommen
        Person person1 = new Arbeiter(2000);
        Person person2 = new Banker(5000);
        Person person3 = new König(1000000);

        // Aufrufen der Methode "steuern" für jede Person
        int steuern1 = person1.steuern();
        int steuern2 = person2.steuern();
        int steuern3 = person3.steuern();

        // Ausgabe der berechneten Steuern
        System.out.println("Steuern für Person 1: " + steuern1);
        System.out.println("Steuern für Person 2: " + steuern2);
        System.out.println("Steuern für Person 3: " + steuern3);
        person1.toString();
    }

}
