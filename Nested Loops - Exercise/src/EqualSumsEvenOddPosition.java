import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());


        for (int i = n1; i <= n2; i++) {
            int currentNumber = i;
            int evenSum = 0;
            int oddSum = 0;

            for (int position = 6; position > 0; position--) {
                int digit = currentNumber % 10;
                currentNumber /= 10;

                if (position % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
            }
            if (evenSum == oddSum) {
                System.out.print(i + " ");
            }

        }


    }
}
