public class BankKunde extends Thread{

    String _Name;
    int _id;
    int _kontonummer;

    double _kontostand;

    BankKunde(String Name, int id, int kontonummer, double kontostand){
            _Name = Name;
            _id = id;
            _kontonummer = kontonummer;
            _kontostand = kontostand;
    }
    public void run(){
        for(int i = 1; i <= 50;i++){
            System.out.println("Jetzt Arbeitet" + _Name);
        }
    }

    public double get_kontostand(){
        return _kontostand;
    }

    public int get_kontonummer(){
        return _kontonummer;
    }
}
