import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double roses = 5.00;
        double dahlias = 3.80;
        double tulips = 2.80;
        double narcissus = 3.00;
        double gladiolus = 2.50;
        double result = 0;

        switch (flowers) {
            case "Roses":
                if (count > 80) {
                    result = (roses - roses * 10 / 100) * count;
                } else {
                    result = roses * count;
                }
                break;
            case "Dahlias":
                if (count > 90) {
                    result = (dahlias - dahlias * 15 / 100) * count;
                } else {
                    result = dahlias * count;
                }
                break;
            case "Tulips":
                if (count > 80) {
                    result = (tulips - tulips * 15 / 100) * count;
                } else {
                    result = tulips * count;
                }
                break;
            case "Narcissus":
                if (count < 120) {
                    result = (narcissus + narcissus * 15 / 100) * count;
                } else {
                    result = narcissus * count;
                }
                break;
            case "Gladiolus":
                if (count < 80) {
                    result = (gladiolus + gladiolus * 20 / 100) * count;
                } else {
                    result = gladiolus * count;
                }
                break;
        }
        if (result <= budget) {
            double diff = budget - result;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flowers, diff);
        } else if (result > budget) {
            double needed = Math.abs(result - budget);
            System.out.printf("Not enough money, you need %.2f leva more.", needed);
        }


    }
}
