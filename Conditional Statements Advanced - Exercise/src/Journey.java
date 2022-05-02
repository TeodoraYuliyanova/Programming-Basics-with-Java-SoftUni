import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String country = "";
        double diff = 0.0;
        if (budget <= 100) {
            country = "Bulgaria";
            if (season.equals("summer")) {
                diff = budget - budget * 0.30;
                destination = "Camp";
            } else if (season.equals("winter")) {
                diff = budget - budget * 0.70;
                destination = "Hotel";
            }
        }
        else if (budget <= 1000) {
            country = "Balkans";
            if (season.equals("summer")) {
                diff = budget - budget * 0.40;
                destination = "Camp";
            } else if (season.equals("winter")) {
                diff = budget - budget * 0.80;
                destination = "Hotel";
            }
        }
       else  {
            country = "Europe";
            destination = "Hotel";
            if (season.equals("summer") || season.equals("winter")) {
                diff = budget - budget * 0.90;
            }
        }
        System.out.printf("Somewhere in %s %n", country);
        System.out.printf("%s - %.2f", destination, budget - diff);


    }
}
