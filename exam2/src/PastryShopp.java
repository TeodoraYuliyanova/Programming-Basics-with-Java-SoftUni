import java.util.Scanner;

public class PastryShopp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sweet = scanner.nextLine();
        int orderedSweet = Integer.parseInt(scanner.nextLine());
        int dayOfMonth = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (sweet) {
            case "Cake":
                if (dayOfMonth <= 15) {
                    price = orderedSweet * 24;
                } else  {
                    price = orderedSweet * 28.70;
                }
                break;

            case "Souffle":
                if (dayOfMonth < 15) {
                    price = orderedSweet * 6.66;
                } else if (dayOfMonth > 15) {
                    price = orderedSweet * 9.80;
                }
                break;

            case "Baklava":
                if (dayOfMonth < 15) {
                    price = orderedSweet * 12.60;
                } else if (dayOfMonth > 15) {
                    price = orderedSweet * 16.98;
                }
                break;
        }

        if (dayOfMonth <= 22) {
            if (price >= 100 && price <= 200) {
                price = price - price * 0.15;
            } else if (price > 200) {
                price = price - price * 0.25;
            }
        }
        if (dayOfMonth <= 15) {
            price = price - price * 0.10;
        }


        System.out.printf("%.2f", price);


    }
}
