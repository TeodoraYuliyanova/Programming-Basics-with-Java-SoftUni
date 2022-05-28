import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCats = Integer.parseInt(scanner.nextLine());
        int groupCounter1 = 0;
        int groupCounter2 = 0;
        int groupCounter3 = 0;
        double sumFoodCounter = 0;

        for (int cat = 1; cat <= numberCats; cat++) {
            double food = Double.parseDouble(scanner.nextLine());
            if (food >= 100 && food < 200) {
                groupCounter1++;
                sumFoodCounter += food;
            } else if (food >= 200 && food < 300) {
                groupCounter2++;
                sumFoodCounter += food;
            } else if (food >= 300 && food < 400) {
                groupCounter3++;
                sumFoodCounter += food;
            }

        }
        double kilo = sumFoodCounter / 1000;
        double total = kilo * 12.45;

        System.out.printf("Group 1: %d cats.%n", groupCounter1);
        System.out.printf("Group 2: %d cats.%n", groupCounter2);
        System.out.printf("Group 3: %d cats.%n", groupCounter3);
        System.out.printf("Price for food per day: %.2f lv.", total);

    }
}
