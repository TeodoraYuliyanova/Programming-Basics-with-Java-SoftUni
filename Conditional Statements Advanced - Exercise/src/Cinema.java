import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        double income = 0.0;


        switch (projection) {
            case "Premiere":

                income = r * c * 12.00;
                System.out.printf("%.2f", income);
                break;
            case "Normal":

                income = r * c * 7.50;
                System.out.printf("%.2f", income);
                break;
            case "Discount":

                income = r * c * 5.00;
                System.out.printf("%.2f", income);
                break;
        }


    }
}
