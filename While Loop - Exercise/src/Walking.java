import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goals = 10000;
        int steps = 0;

        while (goals > steps) {
            String input = scanner.nextLine();
            if (input.equals("Going home")) {
                steps += Integer.parseInt(scanner.nextLine());
                break;
            }
            steps += Integer.parseInt(input);

        }
        if (steps >= goals) {
            System.out.printf("Goal reached! Good job!%n" +
                    "%d steps over the goal!", steps - goals);
        } else {
            System.out.printf("%d more steps to reach goal.", goals - steps);
        }
    }
}
