import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nezadovolitelniOvenkiLimit = Integer.parseInt(scanner.nextLine());

        String taskName = scanner.nextLine();
        int nezaovolitelniOcenki = 0;
        boolean isFailed = false;
        double gradeSum = 0.0;
        int gradeCount = 0;
        String lastTaskName = "";

        while (!taskName.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            gradeSum += grade;
            gradeCount++;
            lastTaskName = taskName;
            if (grade <= 4) {
                nezaovolitelniOcenki++;
                if (nezaovolitelniOcenki == nezadovolitelniOvenkiLimit) {
                    isFailed = true;
                    break;
                }
            }
            taskName = scanner.nextLine();
        }
        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", nezaovolitelniOcenki);
        } else {
            System.out.printf("Average score: %.2f\n" +
                            "Number of problems: %d\n" +
                            "Last problem: %s", gradeSum / gradeCount
                    , gradeCount
                    , lastTaskName
            );
        }

    }
}
