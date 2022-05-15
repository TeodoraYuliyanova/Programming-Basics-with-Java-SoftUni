import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double moneyOwned = Double.parseDouble(scanner.nextLine());

        int daysCounter = 0;
        int spendCounter = 0;

        while (moneyOwned < moneyNeeded && spendCounter < 5) {
            String command = scanner.nextLine();
            double moneySavedOrSpend = Double.parseDouble(scanner.nextLine());
            daysCounter++;

            if (command.equals("spend")) {
                moneyOwned -= moneySavedOrSpend;
                spendCounter += 1;
                if (moneyOwned < 0) {
                    moneyOwned = 0;
                }
            } else if (command.equals("save")) {
                moneyOwned += moneySavedOrSpend;
                spendCounter = 0;
            }

        }
        if (spendCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.println(daysCounter);
        } else if (moneyOwned >= moneyNeeded) {
            System.out.printf("You saved the money for %d days.", daysCounter);
        }


    }
}
