import java.util.Scanner;

public class Main {
    public static char[] game = {'0','0','0','0','0','0','0'};
    public static boolean[] ship = {false, false, true, true, true, false, false};
    public static boolean win = false;
    public static void showgame(){
        for(int i=0;i < 7; i++){
            System.out.println(game[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Shiffeversenken");
        int treffer = 0;
        do {
            showgame();
            System.out.println("Wählen Sie ein Zahl von 0 bis 6 um Ihren Angriff zu plazieren:");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            if(ship[x] == true){
                System.out.println("Treffer !!!");
                treffer = treffer +1;
            }else{
                System.out.println("Leider Verfehlt !!!");
            }
            if(treffer == 3){
                System.out.println("Herzlichen Glückwunsch du hast das Schuff besiegt!!");
                win = true;
            }
        } while (win != true);

    }


}