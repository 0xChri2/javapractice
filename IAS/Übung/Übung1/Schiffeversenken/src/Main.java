import java.util.Scanner;

public class Main {
    char game[] = {'0','0','0','0','0','0','0'};
    boolean ship[] = {false, false, true, true, true, false, false};
    boolean win = false;
    public static void showgame(){
        for(int i=0;i < 7; i++){
            System.out.println(game[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Shiffeversenken");

        do {
            showgame();
            System.out.println("Wählen Sie ein Zahl von 0 bis 6 um Ihren Angriff zu plazieren:");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextint();

        } while (win == true)

    }


}