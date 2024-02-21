public class Main {
    public static void main(String[] args) {
        Gabel Gabel1 = new Gabel();
        Gabel Gabel2 = new Gabel();
        Gabel Gabel3 = new Gabel();
        Gabel Gabel4 = new Gabel();
        Gabel Gabel5 = new Gabel();
        Philosoph philosoph1 = new Philosoph(Gabel1,Gabel2);
        Philosoph philosoph2 = new Philosoph(Gabel3,Gabel4);
        Philosoph philosoph3 = new Philosoph(Gabel1,Gabel2);
        Philosoph philosoph4 = new Philosoph(Gabel3,Gabel4);
        Philosoph philosoph5 = new Philosoph(Gabel5,Gabel1);


        philosoph1.start();
        philosoph2.start();
        philosoph3.start();
        philosoph4.start();
        philosoph5.start();

    }
}