public class Person {
    private int _einkommen;

    public Person(int einkommen) {
        _einkommen = einkommen;
    }
    public int getEinkommen() {
        return _einkommen;
    }
    public int zuVersteuerndesEinkommen() {
        return _einkommen;
    }

    public int steuern() {
        return Math.round(_einkommen * 0.25f);
    }
}
