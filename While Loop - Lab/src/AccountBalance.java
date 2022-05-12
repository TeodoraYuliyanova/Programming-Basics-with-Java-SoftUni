import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        double totalSum = 0;
        while (!n.equals("NoMoreMoney")) {
            double numbers = Double.parseDouble(n);


            if (numbers < 0) {
                System.out.printf("Invalid operation!%n");
                break;
            }
            System.out.printf("Increase: %.2f%n", numbers);
            totalSum += numbers;

            n = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", totalSum);
    }
}
