import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budgetFamHave = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double priceForOneNight = Double.parseDouble(scanner.nextLine());
        int percentForOtherThings = Integer.parseInt(scanner.nextLine());

        if (nights > 7){
            priceForOneNight = priceForOneNight - (priceForOneNight * 0.05);
        }
        double sumForNights = nights * priceForOneNight;
        double sumAfterPercentForOther = budgetFamHave * percentForOtherThings / 100;
        double sum = sumForNights + sumAfterPercentForOther;

        if (sum <= budgetFamHave){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation." , budgetFamHave - sum);
        }else {
            System.out.printf("%.2f leva needed." , sum - budgetFamHave);
        }

    }
}
