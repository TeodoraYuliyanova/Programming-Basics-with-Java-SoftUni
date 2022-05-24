import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String instrument = scanner.nextLine();

        double pointsDifficulty = 0.0;
        double pointsPerformance = 0.0;

        if (country.equals("Russia")){
            if(instrument.equals("ribbon")){
                pointsDifficulty = 9.100;
                pointsPerformance = 9.400;
            }else if (instrument.equals("hoop")){
                pointsDifficulty = 9.300;
                pointsPerformance = 9.800;
            }else if (instrument.equals("rope")){
                pointsDifficulty = 9.600;
                pointsPerformance = 9.000;
            }
        }else if (country.equals("Bulgaria")){
            if (instrument.equals("ribbon")){
                pointsDifficulty = 9.600;
                pointsPerformance = 9.400;
            }else if (instrument.equals("hoop")){
                pointsDifficulty = 9.550;
                pointsPerformance =  9.750;
            }else if(instrument.equals("rope")){
                pointsDifficulty = 9.500;
                pointsPerformance = 9.400;
            }
        }else if (country.equals("Italy")){
            if (instrument.equals("ribbon")){
                pointsDifficulty = 9.200;
                pointsPerformance = 9.500;
            }else if (instrument.equals("hoop")){
                pointsDifficulty = 9.400;
                pointsPerformance =  9.350;
            }else if(instrument.equals("rope")){
                pointsDifficulty = 9.700;
                pointsPerformance = 9.150;
            }
        }
        double totalPoints = pointsDifficulty + pointsPerformance;
        double left = 20 - totalPoints;
        double percent = (left / 20) * 100;

        System.out.printf("The team of %s get %.3f on %s.%n" , country , totalPoints , instrument);
        System.out.printf("%.2f%%" , percent);



    }
}
