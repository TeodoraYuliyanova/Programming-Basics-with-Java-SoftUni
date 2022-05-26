import java.util.Scanner;

public class ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0.0;
        double totalPrice = 0;

        switch (season) {
            case "spring":
                if (numberOfPeople <= 5) {
                    price = 50.00;
                } else {
                    price = 48.00;
                }
                totalPrice = price * numberOfPeople;
                break;

            case "summer":
                if (numberOfPeople <= 5) {
                    price = 48.50;
                    price = price - price * 0.15;
                } else {
                    price = 45.00;
                    price = price - price * 0.15;
                }
                totalPrice = price * numberOfPeople;
                break;

            case "autumn":
                if (numberOfPeople <= 5) {
                    price = 60.00;
                } else {
                    price = 49.50;
                }
                totalPrice = price * numberOfPeople;
                break;

            case "winter":
                if (numberOfPeople <= 5) {
                    price = 86.00;
                    price = price + price * 0.08;
                } else {
                    price = 85.00;
                    price = price + price * 0.08;
                }
                totalPrice = price * numberOfPeople;
                break;
        }
        System.out.printf("%.2f leva.", totalPrice);


    }
}
