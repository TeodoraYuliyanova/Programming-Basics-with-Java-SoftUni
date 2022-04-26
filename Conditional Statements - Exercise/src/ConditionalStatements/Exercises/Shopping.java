package ConditionalStatements.Exercises;


import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        //•	Видеокарта – 250 лв./бр.
        //•	Процесор – 35% от цената на закупените видеокарти/бр.
        //•	Рам памет – 10% от цената на закупените видеокарти/бр.
        double VideoCardsSum = videoCards * 250;
        double processorsSum =  VideoCardsSum * 0.35;
        double ramSum = VideoCardsSum * 0.10;
        double TotalSum = VideoCardsSum +  processors * processorsSum  + ram * ramSum;
        if (videoCards > processors){
         TotalSum = TotalSum - TotalSum *  0.15;
        }
       if (budget >= TotalSum){
           System.out.printf("You have %.2f leva left!" , budget - TotalSum);
}else {
           System.out.printf("Not enough money! You need %.2f leva more!" , TotalSum - budget);
       }

    }
}
