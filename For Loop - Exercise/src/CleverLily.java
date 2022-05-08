import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int toys = 0;
        int money = 10;
        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {
                sum += money - 1;
                money += 10;
            } else {
                toys += 1;
            }

        }
        sum += toyPrice * toys;

        if (sum >= washingMachine) {
            System.out.printf("Yes! %.2f", sum - washingMachine);
        } else {
            double diff = Math.abs(washingMachine - sum);
            System.out.printf("No! %.2f", diff);
        }


    }
}
