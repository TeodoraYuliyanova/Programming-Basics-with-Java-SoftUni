import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodBoughtKilo = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int foodEatenInGrams = Integer.parseInt(scanner.nextLine());
        double counter = 0;
        double leftovers = 0;
        boolean is = false;

        while(!command.equals("Adopted")){
            int foodBoughtGrams = foodBoughtKilo * 1000;
            counter += foodBoughtGrams;

            if (counter < foodBoughtGrams){
                leftovers = foodBoughtGrams - counter;
            }






            foodEatenInGrams = Integer.parseInt(scanner.nextLine());
        }

        if ()

    }
}
