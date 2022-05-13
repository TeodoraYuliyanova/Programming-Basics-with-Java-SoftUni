import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int numbers = 1;
        while(numbers <= n) {
            System.out.println(numbers);
            numbers = numbers * 2 + 1;

        }
    }
}
