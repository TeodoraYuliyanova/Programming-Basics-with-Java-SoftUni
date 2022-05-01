import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();

        double collection = N1 + N2;
        double subtraction = N1 - N2;
        double multiplication = N1 * N2;



        if (symbol.equals("+")) {
            if (collection % 2 == 0) {
                System.out.printf("%.0f %s %.0f = %.0f - even", N1 * 1.0, symbol, N2 * 1.0, collection);
            } else {
                System.out.printf("%.0f %s %.0f = %.0f - odd", N1 * 1.0, symbol, N2 * 1.0, collection);
            }
        } else if (symbol.equals("-")) {
            if (subtraction % 2 == 0) {
                System.out.printf("%.0f %s %.0f = %.0f - even", N1 * 1.0, symbol, N2 * 1.0, subtraction);
            } else {
                System.out.printf("%.0f %s %.0f = %.0f - odd", N1 * 1.0, symbol, N2 * 1.0, subtraction);
            }
        } else if (symbol.equals("*")) {
            if (multiplication % 2 == 0) {
                System.out.printf("%.0f %s %.0f = %.0f - even", N1 * 1.0, symbol, N2 * 1.0, multiplication);
            } else {
                System.out.printf("%.0f %s %.0f = %.0f - odd", N1 * 1.0, symbol, N2 * 1.0, multiplication);
            }
        } else if (symbol.equals("/")) {
            if (N2 == 0.0) {
                System.out.printf("Cannot divide %d by zero", N1);
            } else {
                double division = N1 * 1.0 / N2;
                System.out.printf("%.0f / %.0f = %.2f", N1 * 1.0, N2 * 1.0, division);
            }

        } else if (symbol.equals("%")) {
            if (N2 == 0.0) {
                System.out.printf("Cannot divide %d by zero", N1);

            } else {
                double modularDivision = N1 % N2;
                System.out.printf("%.0f %s %.0f = %.0f", N1 * 1.0, symbol, N2 * 1.0, modularDivision);
            }
        }
    }
}