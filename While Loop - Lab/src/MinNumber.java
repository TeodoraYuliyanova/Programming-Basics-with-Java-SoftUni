import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        int min = Integer.MAX_VALUE;

        while (!n.equals("Stop")) {
            int number = Integer.parseInt(n);
            if (number < min) {
                min = number;
            }
            n = scanner.nextLine();
        }
        System.out.println(min);
    }
}
