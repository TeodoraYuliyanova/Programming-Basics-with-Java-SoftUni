import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int magicalNumber = Integer.parseInt(scanner.nextLine());
        boolean isFailed = false;
        int combinationCounter = 0;

        for (int first = startNumber; first <= endNumber; first++) {
            for (int second = startNumber; second <= endNumber; second++) {
                combinationCounter++;
                int sum = first + second;
                if (sum == magicalNumber) {
                    isFailed = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinationCounter, first, second, magicalNumber);
                    break;
                }
            }
            if (isFailed) {
                break;
            }
        }
        if (!isFailed) {
            System.out.printf("%d combinations - neither equals %d", combinationCounter, magicalNumber);
        }
    }
}
