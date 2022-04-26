package ConditionalStatements.Exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());
        //Цени на играчките:
        //•	Пъзел - 2.60 лв.
        //•	Говореща кукла - 3 лв.
        //•	Плюшено мече - 4.10 лв.
        //•	Миньон - 8.20 лв.
        //•	Камионче - 2 лв.
        double budget = puzzles * 2.60 + dolls * 3.00 + bears * 4.10 + minions * 8.20 + trucks * 2.00;
        int totalToys = puzzles +  dolls + bears + minions + trucks;

        if ( totalToys >= 50){
          budget = budget - budget * 0.25;
        }
          budget = budget - budget * 0.10;
        if (budget >= excursionPrice){
            System.out.printf("Yes! %.2f lv left." , budget - excursionPrice );
        }else {
            System.out.printf("Not enough money! %.2f lv needed." , excursionPrice - budget);
        }
    }
}
