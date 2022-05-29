import java.util.Scanner;

public class RoomPainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boxesWithPainting = Integer.parseInt(scanner.nextLine());
        int numberTapeti = Integer.parseInt(scanner.nextLine());
        double priceForOneGloves = Double.parseDouble(scanner.nextLine());
        double priceForOneChetka = Double.parseDouble(scanner.nextLine());

        double AllPriceForPaint = 21.50 * boxesWithPainting;
        double AllPriceForTapeti = 5.20 * numberTapeti;
        double needGloves = Math.ceil(numberTapeti * 0.35);
        double needChetki = Math.floor(boxesWithPainting * 0.48);
        double totalPriceGloves = needGloves * priceForOneGloves;
        double totalPriceChetki = needChetki * priceForOneChetka;
        double priceForAllProduct = AllPriceForPaint + AllPriceForTapeti + totalPriceGloves + totalPriceChetki;
        double stoinosta =  priceForAllProduct / 15;
        System.out.printf("This delivery will cost %.2f lv." , stoinosta);



    }
}
