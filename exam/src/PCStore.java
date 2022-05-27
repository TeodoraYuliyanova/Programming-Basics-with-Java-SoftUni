import java.util.Scanner;

public class PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceProcessorDollar = Double.parseDouble(scanner.nextLine());
        double priceVideoCardDollar = Double.parseDouble(scanner.nextLine());
        double priceRamDollar = Double.parseDouble(scanner.nextLine());
        int rams = Integer.parseInt(scanner.nextLine());
        double procentDiscount = Double.parseDouble(scanner.nextLine());

        double priceProcessorLeva = priceProcessorDollar * 1.57;
        double priceVideoCardLeva = priceVideoCardDollar * 1.57;
        double priceRamLeva = priceRamDollar * 1.57;

        double moneyNeedRam = priceRamLeva * rams;
        double priceProcessorAfterDiscount = priceProcessorLeva - (priceProcessorLeva * procentDiscount);
        double priceVideoCardAfterDiscount = priceVideoCardLeva - (priceVideoCardLeva * procentDiscount) ;
        double totalSum = priceProcessorAfterDiscount + priceVideoCardAfterDiscount + moneyNeedRam;
        System.out.printf("Money needed - %.2f leva." , totalSum);
    }
}
