import java.util.Scanner;

public class Schiffeversenken {
    public static char[][] game = {
            {'0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0'},
    };
    public static boolean[][] ship = {
            {false, false, true, false, false, false, false},
            {false, false, true, false, false, false, false},
            {false, false, true, false, false, false, false},
            {false, false, true, false, false, false, false},
            {false, false, true, false, false, false, false},
            {false, false, false, false, false, false, false},
            {false, false, false, false, true, true, true},
    };

    public static boolean win = false;
    public static void showgame() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(game[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void run() {
        System.out.println("Welcome to Shiffeversenken");
        int treffer = 0;
        do {
            showgame();
            System.out.println("Wählen Sie ein Zahl von 0 bis 6 um Ihren Angriff zu plazieren:");
            Scanner scanner = new Scanner(System.in);
            int x,y;
            do {
                System.out.println("Wählen Sie die X Achse:");
                x = scanner.nextInt();
                System.out.println("Wählen Sie die Y Achse:");
                y = scanner.nextInt();
            } while (!(x >= 0 && x <= 6 && y >=0 && y <=6));
            if(game[x] [y] == 'X'){
                System.out.println("Diese Stelle wurde bereits Angriffen.");
            } else if(ship[x] [y] == true){
                System.out.println("Treffer !!!");
                treffer = treffer + 1;
                game[x] [y] = '1';
            }else{
                System.out.println("Leider Verfehlt !!!");
                game[x] [y] = 'X';
            }
            if(treffer == 7){
                System.out.println("Herzlichen Glückwunsch du hast das Schuff besiegt!!");
                win = true;
            }
        } while (!win);
    }

}


