import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();
        String workingTimes = "";
        switch (dayOfWeek){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (hour >= 10 && hour <=18){
                    workingTimes = "open";
                }else {
                    workingTimes = "closed";
                }
                break;
            default:
                workingTimes = "closed";
                break;

        }
        System.out.println(workingTimes);
    }
}
