package ConditionalStatements.Exercises;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //прочитане на вход
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int allTimeInSeconds = first + second + third;
        int allTimeInMin = allTimeInSeconds / 60;
        int secs = allTimeInSeconds % 60;
        if (secs < 10) {
            System.out.printf("%d:0%d", allTimeInMin, secs);
        } else {
            System.out.printf("%d:%d", allTimeInMin, secs);
        }
    }
}