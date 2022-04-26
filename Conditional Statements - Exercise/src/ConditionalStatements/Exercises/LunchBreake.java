package ConditionalStatements.Exercises;

import java.util.Scanner;

public class LunchBreake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serialName = scanner.nextLine();
        int serialDuration = Integer.parseInt(scanner.nextLine());
        int breakeDuration = Integer.parseInt(scanner.nextLine());
        double lunchTime = breakeDuration / 8.0;
        double chillTime = breakeDuration / 4.0;
        double totalTime = serialDuration + lunchTime + chillTime;
        if(breakeDuration >= totalTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time." , serialName , Math.ceil(breakeDuration - totalTime));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes." , serialName , Math.ceil(totalTime - breakeDuration));
        }
    }
}
