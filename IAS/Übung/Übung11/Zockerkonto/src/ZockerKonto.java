class KontoUeberziehungException extends Exception {
    public KontoUeberziehungException(String message) {
        super(message);
    }
}
public class ZockerKonto {
    private static int nextAccountNumber = 1;
    private int kontonummer;
    private double kontostand;
    private String inhaber;

    public ZockerKonto(double anfangsbetrag, String inhaber) {
        this.kontonummer = nextAccountNumber++;
        this.kontostand = anfangsbetrag;
        this.inhaber = inhaber;
        Bank.registriereKonto(this);
    }
    public int getKontonummer() {
        return kontonummer;
    }

    public double getKontostand() {
        return kontostand;
    }

    public String getInhaber() {
        return inhaber;
    }
    public void kontostandAendern(double betrag) throws KontoUeberziehungException {
        if (kontostand + betrag < 0) {
            throw new KontoUeberziehungException("Kontoüberziehung nicht erlaubt");
        }
        kontostand += betrag;
    }



}
