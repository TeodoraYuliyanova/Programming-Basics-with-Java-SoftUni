import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int adultsCounter = 0;
        int kidsCounter = 0;
        int priceToy = 0;
        int priceSuicher = 0;

        String ageForMembers = scanner.nextLine();

        while (!ageForMembers.equals("Christmas")) {
            int age= Integer.parseInt(ageForMembers);

            if (age <= 16) {
                kidsCounter++;
            } else {
                adultsCounter++;
            }
             priceToy = kidsCounter * 5;
             priceSuicher = adultsCounter * 15;

            ageForMembers = scanner.nextLine();

        }

    System.out.printf("Number of adults: %d%n", adultsCounter);
    System.out.printf("Number of kids: %d%n", kidsCounter);
    System.out.printf("Money for toys: %d%n", priceToy);
    System.out.printf("Money for sweaters: %d", priceSuicher);

    }
}
