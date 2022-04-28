import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisher = Integer.parseInt(scanner.nextLine());
        double rentBoat = 0.0;
        double discount = 0.0;
        switch (season) {
            case "Spring":
                rentBoat = 3000;
                if (fisher <= 6) {
                    discount = 0.10;
                } else if (fisher <= 11) {
                    discount = 0.15;
                } else {
                    discount = 0.25;
                }
                if (fisher % 2 == 0) {
                    rentBoat = rentBoat - rentBoat * 0.05;
                }
                break;

            case "Summer":
                rentBoat = 4200;
                if (fisher <= 6) {
                    discount = 0.10;
                } else if (fisher <= 11) {
                    discount = 0.15;
                } else {
                    discount = 0.25;
                }
                if (fisher % 2 == 0) {
                    rentBoat = rentBoat - rentBoat * 0.05;
                }
                break;

            case "Autumn":
                rentBoat = 4200;
                if (fisher <= 6) {
                    discount = 0.10;
                } else if (fisher <= 11) {
                    discount = 0.15;
                } else {
                    discount = 0.25;
                }
                break;

            case "Winter":
                rentBoat = 2600;
                if (fisher <= 6) {
                    discount = 0.10;
                } else if (fisher <= 11) {
                    discount = 0.15;
                } else {
                    discount = 0.25;
                }
                if (fisher % 2 == 0) {
                    rentBoat = rentBoat - rentBoat * 0.05;
                }
                break;
        }


        double moneyNeeded = rentBoat - rentBoat * discount;
        if (budget >= moneyNeeded) {
            System.out.printf("Yes! You have %.2f leva left.", budget - moneyNeeded);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded - budget);
        }


    }


}

