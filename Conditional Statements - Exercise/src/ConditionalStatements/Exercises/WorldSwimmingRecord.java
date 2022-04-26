package ConditionalStatements.Exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSecs = Double.parseDouble(scanner.nextLine());
        double distanceInMetres = Double.parseDouble(scanner.nextLine());
        double TimeInSecsForOneMetre = Double.parseDouble(scanner.nextLine());

        double heNeedToSwim = (distanceInMetres * TimeInSecsForOneMetre) + ((Math.floor(distanceInMetres / 15)) * 12.5);
        double diffWithRec  = Math.abs( heNeedToSwim - recordInSecs);

         if (heNeedToSwim < recordInSecs){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds." , heNeedToSwim);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower." , diffWithRec);
        }
        }


    }

