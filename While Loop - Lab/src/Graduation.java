import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();
        double minEvaluation = 0;
        double evaluationSum = 0;
        int i = 1;

        while (i <= 12) {
            if (minEvaluation > 1) {
                System.out.printf("%s has been excluded at %d grade", studentName, i);
                break;
            }
            double evaluation = Double.parseDouble(scanner.nextLine());
            evaluationSum += evaluation;
            if (evaluation < 4) {
                minEvaluation++;
                continue;
            }
            if (i == 12) {
                System.out.printf("%s graduated. Average grade: %.2f", studentName, evaluationSum / 12);
            }
            i++;
        }
    }
}
