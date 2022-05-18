import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 0;

        for (int first = 0; first <= n ; first++) {
            for (int second = 0; second <= n; second++) {
                for (int third = 0; third <= n; third++) {
                     sum = first + second + third;
                     if(sum == n ){
                         counter++;
                     }

                }

            }

        }
        System.out.println(counter);
    }
}
