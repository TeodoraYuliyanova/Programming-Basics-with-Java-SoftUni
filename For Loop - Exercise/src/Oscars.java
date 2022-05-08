import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int jury = Integer.parseInt(scanner.nextLine());
        double totalPoints = academyPoints;

        for (int i = 1; i <= jury; i++) {
            String juryName = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());
            double nameLength = juryName.length();
            if (totalPoints < 1250.5) {
                totalPoints += (points * nameLength) / 2;

            }

        }
        if (totalPoints < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - totalPoints);
        } else {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
        }

    }
}
