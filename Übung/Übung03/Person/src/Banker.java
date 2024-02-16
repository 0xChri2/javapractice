public class Banker extends Person{
    public Banker(int einkommen){
        super(einkommen);
    }
    public int steuern() {
            return ((Math.round(getEinkommen() * 0.25f)) + 1000);
    }
}
