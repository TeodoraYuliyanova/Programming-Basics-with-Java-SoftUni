import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());
        int starter = points;
        int wins = 0;
        for (int i = 0; i < tournaments; i++) {

            String phaseOfTournament = scanner.nextLine();

            switch (phaseOfTournament) {
                case "W":
                    points += 2000;
                    wins++;
                    break;

                case "F":
                    points += 1200;
                    break;

                case "SF":
                    points += 720;
                    break;
            }
        }
        System.out.println("Final points: " + points );
        int averagePoints = (points - starter) / tournaments;
        System.out.println("Average points: " + averagePoints);
        System.out.printf("%.2f%%\n", wins * 1.0 / tournaments * 100);

    }

}
