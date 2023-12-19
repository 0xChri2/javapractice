import java.util.ArrayList;
import java.util.List;

class Bank {
    private static List<ZockerKonto> alleKonten = new ArrayList<>();

    public static void registriereKonto(ZockerKonto konto) {
        alleKonten.add(konto);
    }

    public static List<ZockerKonto> getAlleKonten() {
        return alleKonten;
    }

    // Weitere Methoden der Bank können nach Bedarf hinzugefügt werden
}