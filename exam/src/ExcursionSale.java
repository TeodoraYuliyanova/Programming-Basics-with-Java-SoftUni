import java.util.Scanner;

public class ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberExcursionSea = Integer.parseInt(scanner.nextLine());
        int numberExcursionMountain = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int price = 0;
        int allSum = 0;

        while (!command.equals("Stop") || numberExcursionMountain == 0 && numberExcursionSea == 0) {
            String packageName = scanner.nextLine();
            if (packageName.equals("sea")) {
                price = 680;
                allSum += price;
                numberExcursionSea = numberExcursionSea - 1;
            }
            if (packageName.equals("mountain")) {
                price = 499;
                allSum += price;
                numberExcursionMountain = numberExcursionMountain - 1;
            }
            if(numberExcursionSea == 0 && numberExcursionMountain == 0){
                price = 0;
                allSum = 0;
                break;
            }

        }

        if (numberExcursionMountain == 0 && numberExcursionSea == 0) {
         System.out.println("Good job! Everything is sold.");
        }
        System.out.printf("Profit: %d leva.", allSum);
    }
}
