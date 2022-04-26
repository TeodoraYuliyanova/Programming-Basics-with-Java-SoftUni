package ConditionalStatements.Exercises.GodzillaVs;

import java.util.Scanner;

public class Kong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double BudgetFilm = Double.parseDouble(scanner.nextLine());
        int statisti = Integer.parseInt(scanner.nextLine());
        double ClothesForOneStatist = Double.parseDouble(scanner.nextLine());
        double decor = BudgetFilm * 0.10;

        //•	При повече от 150 статиста,  има отстъпка за облеклото на стойност 10%.
        if (statisti > 150) {
            ClothesForOneStatist = ClothesForOneStatist - ClothesForOneStatist * 0.10;
        }
        double moneyneeded = decor + statisti * ClothesForOneStatist;
        double notenoughmoney =  moneyneeded - BudgetFilm ;
        double moneyleft =  BudgetFilm  - moneyneeded;

        if (moneyneeded > BudgetFilm) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more. %n", notenoughmoney);
        }  else if  (moneyneeded <= BudgetFilm) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left. %n", moneyleft);
        }
    }
}