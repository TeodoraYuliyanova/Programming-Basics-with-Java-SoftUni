package ConditionalStatements.Exercises;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int allTimeInMinutes = (hours * 60) + minutes + 15;
        int h = allTimeInMinutes / 60;
        int min = allTimeInMinutes % 60;
        if (h >= 24){
            h = h - 24;
        }
        if (min <10){
            System.out.printf("%d:0%d" , h , min);
        } else {
            System.out.printf("%d:%d" , h , min);
        }
    }
}
