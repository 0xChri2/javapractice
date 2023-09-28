class C {
    public static void main(String[] args) {

        short s = 7;
        int i = -12;
        //unsigned int u = +12;  unsinged existert nicht
        long l = 123456789;
        //float f = 3.1415; //bruacht ein f dahinter weil würde als Double interpetiert
        double d = 3.1415;

        s = i; //kann nicht von einem int in eine Short das passt nicht
        i = s;
        s = 123456789; // Zu groß
        int i2 = (int) l;
        i = 12.4; // int kann kein kommazahl sein
        i = 12L; // int kann kein long sein
        i = (int) 12L;

        String str = "Hallo" + "Welt";
        str = args[-3]; //java array fängt bei 0 an es gibt kein negativen wert
        str = "i = " + i;
        str = str - i; // man kann ein string nicht subtrahieren

        boolean b = false;
        b = 12L == 12;
    }
}