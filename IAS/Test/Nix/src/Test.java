public class Test {
    public static void main(String[] args) {
        short s = 7;
        int i = -12;
        long l = 123456789;
        float f = 3.1415f; // Beachte das f am Ende, um zu zeigen, dass es sich um ein float-Literal handelt
        double d = 3.1415;
        s = (short) i; // Explizite Umwandlung von int zu short
        i = s; // Implizite Umwandlung von short zu int
        // s = 123456789; // Dies führt zu einem Fehler, da der Wert zu groß für short ist
        int i2 = (int) l; // Explizite Umwandlung von long zu int
        // i = 12.4; // Dies führt zu einem Fehler, da der Wert dezimal ist und nicht in einen int passt
        i = (int) 12L; // Explizite Umwandlung von long zu int
        String str = "Hallo" + "Welt";
        // str = args[-3]; // Dies führt zu einem Fehler, da args[-3] nicht gültig ist
        str = "i = " + i;
        // str = str - i; // Dies führt zu einem Fehler, da Subtraktion nicht auf Strings angewendet werden kann
        boolean b = false;
        b = 12L == 12; // Vergleichsoperation, Ergebnis wird in boolean gespeichert
    }
}
