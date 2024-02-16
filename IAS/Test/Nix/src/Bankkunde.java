import java.lang.String;
class Bankkunde extends Thread {
    public String _Name;
    int _Kontostand;
    int zahl;
    public Bankkunde(String Name, int Kontostand){
        _Name = Name;
        _Kontostand = Kontostand;
    }
    //Zahlt Zusammen hoch
    public synchronized void run(){
        for(int zahl = 1; zahl<=50;zahl++){
            System.out.println("Jetzt arbeitet " + _Name + " zum "+ zahl);
        }
    }
    /*  Zählt einzelnt hoch
    public synchronized void run(){

        for(int i = 1; i<=50;i++){
            System.out.println("Jetzt arbeitet " + _Name + " zum "+ i);
        }
    }*/

}
