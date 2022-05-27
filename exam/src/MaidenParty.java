import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceParty = Double.parseDouble(scanner.nextLine());

        int loveLetters = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int keyHolder = Integer.parseInt(scanner.nextLine());
        int paintings = Integer.parseInt(scanner.nextLine());
        int surprises = Integer.parseInt(scanner.nextLine());

        double priceLoveLetters = loveLetters * 0.60;
        double priceRoses = roses * 7.20;
        double priceKeyHolder = keyHolder * 3.60;
        double pricePaintings = paintings * 18.20;
        double priceSurprise = surprises * 22.0;
        double discount = 0.0;

        double totalSum = priceLoveLetters + priceRoses + priceKeyHolder + pricePaintings + priceSurprise;
        int quantityProducts = loveLetters + roses + keyHolder + paintings + surprises;

        if (quantityProducts >= 25) {
            totalSum = totalSum - totalSum * 0.35;
        }
        double costHosting = totalSum * 0.10;
        double profit = totalSum - costHosting;

        if (profit > priceParty) {
            System.out.printf("Yes! %.2f lv left.", profit - priceParty);
        } else {
            System.out.printf("Not enough money! %.2f lv needed." , priceParty - profit);
        }


    }
}
