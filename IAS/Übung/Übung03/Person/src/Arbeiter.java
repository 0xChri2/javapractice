public class Arbeiter extends Person{
    public Arbeiter(int einkommen){
        super(einkommen);
    }
    public int steuern() {
        if(getEinkommen() <= 2400){
            return 0;
        }else{
            return Math.round((getEinkommen() - 2400) * 0.25f );
        }
    }
}
