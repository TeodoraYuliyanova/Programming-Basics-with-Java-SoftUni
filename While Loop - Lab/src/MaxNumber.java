import java.time.chrono.MinguoEra;
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        int max = Integer.MIN_VALUE;
        while (!n.equals("Stop")) {
            int number = Integer.parseInt(n);
            if (number > max) {
                max = number;
            }
            n = scanner.nextLine();

        }
        System.out.println(max);
    }
}
